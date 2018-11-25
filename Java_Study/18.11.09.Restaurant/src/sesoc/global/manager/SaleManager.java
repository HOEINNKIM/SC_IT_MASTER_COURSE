package sesoc.global.manager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import sesoc.global.vo.DeliveryOrder;
import sesoc.global.vo.Food;
import sesoc.global.vo.Order;
import sesoc.global.vo.StoreOrder;

public class SaleManager implements Manager {
	private final String FILE_NAME = "menu.txt";
	private FileReader fr = null;
	private FileWriter fw = null;
	private BufferedReader br = null;
	private BufferedWriter bw = null;
	private List<Food> foodList = new ArrayList<>();
	private List<Order> listOrder = new ArrayList<>();
	int StoreSalary = 0;
	int DeliverySalary = 0;	

	public SaleManager() {
		getFile();
	}

	@Override
	public void getFile() {
		try {
			fr = new FileReader(FILE_NAME);
			br = new BufferedReader(fr);
			String str = null;
			while ((str = br.readLine()) != null) {
				// 1,립아이 스테이크,40800
				String[] s = str.split(",");
				int foodNo = Integer.parseInt(s[0]);
				String foodName = s[1];
				int price = Integer.parseInt(s[2]);
				Food f = new Food(foodNo, foodName, price);
				foodList.add(f);
			}
		} catch (NumberFormatException e) {
			System.out.println("menu.txt 파일이 잘못되어 있습니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Food> getFoods() {
		return this.foodList;
	}

	@Override
	public Order findOrder(int number) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteOrder(int number) {
		for (int i = 0; i < listOrder.size(); i++) {
			if (listOrder.get(i).getOrderNo() == number) {
				listOrder.remove(i);
				System.out.println("삭제에 성공하였습니다.");
				return;
			}
		}
		System.out.println("취소할 주문번호가 존재하지 않습니다.");
	}

	@Override
	public void showAll() {
		for (int i = 0; i < listOrder.size(); i++) {
			System.out.println(listOrder.get(i).showOrderSituation());
		}

	}

	@Override
	public boolean insertOrder(Order addToManager) {
		boolean flag = false;
		if (!listOrder.contains(addToManager)) {
			listOrder.add(addToManager);
			flag = true;
		}
		return flag;
	}

	@Override
	public void saveFile() {
		String saveAddress = "C:\\Users\\김회인\\Desktop\\1차역량평가\\Restaurant\\saveFile.txt";
		File f = new File(saveAddress);
		f.getParentFile().mkdirs();
	
		try {
			if (f.exists()) {
					fw = new FileWriter(saveAddress);
				bw = new BufferedWriter(fw);

				bw.write("[ SCIT Restaurant 매출 보고서 ]");
				bw.newLine();
					
				for (int i = 0; i < listOrder.size(); i++) {
					bw.newLine();			
					bw.write(listOrder.get(i).showOrderSituation());
					bw.newLine();
				}				
				
				bw.newLine();
				
				String a = "[ 매장 판매 총액 ] " + Integer.toString(StoreSalary);
				String b = "[ 배달 판매 총액 ] " + Integer.toString(DeliverySalary);
												
				bw.write(a);
				bw.newLine();
				bw.write(b);
				bw.close();
				fw.close();
			} else {
				f.createNewFile();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public int[] calcSalesTotal() {

		for (int i = 0; i < listOrder.size(); i++) {
			Set<Food> searchPrice = listOrder.get(i).getOrderedFoods().keySet();
			Iterator<Food> searchIt = searchPrice.iterator();
			while (searchIt.hasNext()) {
				Food ser = searchIt.next();
				int serPrice = ser.getPrice();
				int serHowMany = listOrder.get(i).getOrderedFoods().get(ser);
				if (listOrder.get(i) instanceof StoreOrder) {
					StoreSalary += (serPrice * serHowMany);
				} else if (listOrder.get(i) instanceof DeliveryOrder) {
					DeliverySalary += (serPrice * serHowMany);
				}
			}
		}
		int[] fin = { StoreSalary, DeliverySalary };
		return fin;
	}
}
/*
 * boolean flag = false; Set checkKey = order.getOrderedFoods().keySet();
 * //key들의 집합 Iterator iterator = checkKey.iterator(); while(iterator.hasNext())
 * { Food checkNext = (Food)iterator.next(); if(OrderMap.containsKey(checkNext))
 * { System.out.println("이미 존재하는 주문입니다. 수량을 변경할 작업을 시행합니다."); int suNum =
 * sc2.nextInt(); OrderMap.replace(checkNext, suNum); return flag; } }
 * OrderMap.put(, 1); flag = true; return flag;
 */

/*
 * System.out.println("돌고 있음");
 * if(listOrder.get(i).getOrderedFoods().equals(changeToOrder.getOrderedFoods())
 * ) { listOrder.set(i, changeToOrder); flag = true; return flag;
 * 
 * Set<Food> checkKeyNew = changeToOrder.getOrderedFoods().keySet();
 * Iterator<Food> iteratorNew = checkKeyNew.iterator();
 * 
 * for(int i = 0 ; i < listOrder.size(); i++) {
 * 
 * Set<Food> checkKeyList = listOrder.get(i).getOrderedFoods().keySet();
 * Iterator<Food> iterator = checkKeyList.iterator();
 * 
 * while(iterator.hasNext()){ Food a = iterator.next(); String str =
 * (String)a.getFoodName(); while(iteratorNew.hasNext()){ Food b =
 * iteratorNew.next(); String str2 = (String)b.getFoodName(); } } }
 * listOrder.add(changeToOrder); System.out.println("등록된 list" + listOrder);
 * return flag;
 */