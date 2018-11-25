package broker.client;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

import broker.manager.RealEstateManager;
import broker.vo.BuyingAndSelling;
import broker.vo.Charter;
import broker.vo.MonthlyRent;
import broker.vo.RealEstate;

public class RealEstateClientManager implements RealEstateManager {
	String path = "C:\\testRealEstate\\test.txt";
	private ArrayList<RealEstate> arr = null;

	public RealEstateClientManager() {
		arr = new ArrayList<RealEstate>();
		File f = new File(path);
		f.getParentFile().mkdirs();
		
		try {
			if(f.exists()) {
				FileInputStream is = new FileInputStream(f);
				// is 객체가 0바이트면 읽을 정보가 아예없어 ObjectInputStream 에서 EOFException을 내므로 available()체크!
				if(is.available()!=0) {
				ObjectInputStream ois = new ObjectInputStream(is);
				arr = (ArrayList<RealEstate>)ois.readObject();
				ois.close();
				}
				is.close();
			}else {
				f.createNewFile();
			}
		} catch (IOException e){
			e.printStackTrace();
		} catch (Exception e ) {
			e.printStackTrace();			
		} 
		
	}

	@Override
	public boolean addForSales(RealEstate re) {
		boolean flag = false;
		Iterator iterator = arr.iterator();
		while (iterator.hasNext()) {
			RealEstate got1FromArray = (RealEstate)iterator.next();
			if (got1FromArray.getAddress().equals(re.getAddress())) {
				System.out.println("중복된 주소입니다.");
				return flag;
			}			
		}
		arr.add(re);
		flag = true;
		return flag;
	}

	@Override
	public RealEstate searchForSalesByAddress(String inputAddress) {
		//담을 객체를 선언
		RealEstate realEstate = null;
		
		//인자값으로 받은 String 주소가 이미 arrayList에 등록되어있는지 확인
		//있다면 해당 객체를 get메서드로 리턴
		for(int i = 0; i < arr.size(); i++) {
			if(inputAddress.equals(arr.get(i).getAddress())) {
				System.out.println("주소를 찾았습니다.");
				System.out.println(arr.get(i).getInfo());
				realEstate = arr.get(i);
			}
		}
		
		//없을 경우 null값을 리턴
		if(realEstate == null) {
			System.out.println("입력하신 주소가 등록되어있지 않습니다.");					
		}

		return realEstate;
	}

	@Override
	public ArrayList<RealEstate> searchForSalesByTradeType(int second) {		
		ArrayList<RealEstate> foundOne = new ArrayList<RealEstate>();
		switch (second) {	
		case 1:
			for(int i = 0 ; i < arr.size(); i++) {
				if(arr.get(i) instanceof BuyingAndSelling) {
					foundOne.add(arr.get(i));
					System.out.println(arr.get(i).getInfo());
				}
			}
			break;
		case 2:
			for(int i = 0 ; i < arr.size(); i++) {
				if(arr.get(i) instanceof Charter) {
					foundOne.add(arr.get(i));
					System.out.println(arr.get(i).getInfo());					
				}
			}
			break;
		case 3:
			for(int i = 0 ; i < arr.size(); i++) {
				if(arr.get(i) instanceof MonthlyRent) {
					foundOne.add(arr.get(i));
					System.out.println(arr.get(i).getInfo());
				}
			}
			break;
			
		default:
			System.out.println("올바른 매물 정보 검색 형식을 고르시오.");
			break;
		}
		return foundOne;
	}

	@Override
	public void updateForSalesInfo(RealEstate reUpdate) {
		//전체 리스트내 객체의 주소와 인자의 주소를 비교하여 같을 경우 ArrayList의 set 메서드로 객체 치환
		for(int i = 0 ; i < arr.size(); i++) {
			if(reUpdate.getAddress().equals(arr.get(i).getAddress())){
				arr.set(i, reUpdate);
				System.out.println("변경성공");
			}
		}
	}

	@Override
	public boolean deleteForSaleInfo(String addressForDelete) {
		boolean flag = false;
		for(int i = 0 ; i < arr.size(); i++) {
			if(arr.get(i).getAddress().equals(addressForDelete)) {
				arr.remove(i);
				flag = true;
			}
		}
		return flag;
	}

	@Override
	public ArrayList<RealEstate> getAllForSalesInfo() {
		return arr;
	}

	public void writeOnText() {
		try {
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(arr);
			oos.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}