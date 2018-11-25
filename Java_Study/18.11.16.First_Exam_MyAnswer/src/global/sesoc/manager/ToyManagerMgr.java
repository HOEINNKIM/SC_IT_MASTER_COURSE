package global.sesoc.manager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import global.sesoc.vo.Bicycle;
import global.sesoc.vo.Drone;
import global.sesoc.vo.GameConsole;
import global.sesoc.vo.Toy;

public class ToyManagerMgr implements ToyManager {
	private final String FILE_NAME="toy.dat";
	private List<Toy> toyList;			// 각종 Toy 정보를 담을 리스트

	private FileInputStream fis;		// 파일을 읽기 위한 객체
	private FileOutputStream fos;		// 파일을 쓰기 위한 객체
	private ObjectInputStream ois;		// 객체를 읽기 위한 객체
	private ObjectOutputStream oos;		// 객체를 쓰기 위한 객체
	
	/** 생성자 
	 * @throws Exception
	 */
	public ToyManagerMgr(){
		// 이전에 등록된 toy 정보가 등록된 파일의 정보를 읽어들인다.

		if(new File(FILE_NAME).exists()){
			loadFile();
		} else {
			toyList = new ArrayList<Toy>();
		}
	}

	@Override
	public void loadFile() {
		
			try {
				fis = new FileInputStream(FILE_NAME);
				ois = new ObjectInputStream(fis);
				toyList = (List<Toy>) ois.readObject();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				closeStreams();
			}
	}

	@Override
	public boolean saveFile() {
		
		try {
		
			fos = new FileOutputStream(FILE_NAME);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(toyList);
			return true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			closeStreams();
		}
		
		return false;
	}

	@Override
	public boolean insertToy(Toy toy) {
		boolean flag = false;
		
		if(searchToy(toy.getSerialNum())==null){
			toyList.add(toy);
			flag = true;
		}	

		return flag;

	}

	@Override
	public Toy searchToy(String serialNum) {
		Toy searched = null;

		for(int i = 0; i < toyList.size(); i++) {
			if(toyList.get(i).getSerialNum().equals(serialNum)){		
				searched = toyList.get(i);
			}			
		}		

		return searched;
	}

	@Override
	public boolean deleteToy(String serialNum) {
		boolean deleteCheck = false;
		Toy toyDelete = searchToy(serialNum);

		if(toyDelete!=null) {
			toyList.remove(toyDelete);
			deleteCheck = true;
		}
				
		return deleteCheck;
	}

	@Override
	public List<Toy> toyListForPrice(int minPrice, int maxPrice) {
		List<Toy> takeToys = new ArrayList<Toy>();
		
		for(int i = 0 ; i < toyList.size(); i++) {
			if(toyList.get(i).getPrice()>=minPrice && toyList.get(i).getPrice()<=maxPrice) {
				takeToys.add(toyList.get(i));
			}
		}
		
		return takeToys;
	}

	@Override
	public List<Toy> printToyInfo(int type) {
		List<Toy> printToy = new ArrayList();
		switch(type) {
		case 1:
			for(int i = 0 ; i < toyList.size(); i++) {
				System.out.println(toyList.get(i).toString());
			}
			return toyList;
		case 2:
			for(int i = 0 ; i < toyList.size(); i++) {
				if(toyList.get(i) instanceof Bicycle) {
					printToy.add(toyList.get(i));
					System.out.println(toyList.get(i).toString());					
				}
			}
			return printToy;
		case 3:
			for(int i = 0 ; i < toyList.size(); i++) {
				if(toyList.get(i) instanceof Drone) {
					printToy.add(toyList.get(i));
					System.out.println(toyList.get(i).toString());
				}
			}
			return printToy;
		case 4:
			for(int i = 0 ; i < toyList.size(); i++) {
				if(toyList.get(i) instanceof GameConsole) {
					printToy.add(toyList.get(i));
					System.out.println(toyList.get(i).toString());
				}
			}
			return printToy;
		default:
			return null;
		}
	}
	
	public void closeStreams() {
		try {
			if(fis!=null)fis.close();
			if(fos!=null)fos.close();
			if(ois!=null)ois.close();
			if(oos!=null)oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}