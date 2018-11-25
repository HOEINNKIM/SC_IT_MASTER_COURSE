package sesoc.global.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import sesoc.global.manager.SaleManager;
import sesoc.global.vo.DeliveryOrder;
import sesoc.global.vo.Food;
import sesoc.global.vo.Order;
import sesoc.global.vo.StoreOrder;

public class RestaurantUI implements UI {
	Scanner sc = new Scanner(System.in);
	List<Food> foodList = new ArrayList<>();
	SaleManager sm = new SaleManager();

	public RestaurantUI() {
		// 메서드를 통해 메뉴내용을 읽어온다.
		foodList = sm.getFoods();
		while (true) {
			printMainMenu();
			int selectedNumber = sc.nextInt();
			System.out.println();
			switch (selectedNumber) {
			case 1:
				insertOrder();
				break;
			case 2:
				deleteOrder();
				break;
			case 3:
				sm.showAll();
				int[] toT = sm.calcSalesTotal();
				System.out.println("[ 매장 판매 총액 ]" + toT[0] + "원");
				System.out.println("[ 배달 판매 총액 ]" + toT[1] + "원");
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				sm.saveFile();
				System.out.println("당일 매출 파일이 생성되었습니다.");
				System.exit(0);
				break;
			default:
				System.out.println("입력이 잘못되었습니다. \n다시 입력해주세요.\n");
				break;
			}
		}
	}

	@Override
	public void insertOrder() {
		while (true) {
			printOrderMenu();
			// 매장 주문이냐 배달 주문이냐 돌아가느냐...
			int selectedNumber = sc.nextInt();
			switch (selectedNumber) {
			case 1:
				printFoodList();
				System.out.println("테이블 번호를 입력하세요");
				int tableNum = sc.nextInt();
				Map<Food, Integer> addToMap = new HashMap();

				while (true) {
					System.out.println("주문할 메뉴 (입력이 끝나면 0)");
					int chooseMenu = sc.nextInt();
					if (chooseMenu == 0) {
						break;
					}
					int chooseMenu2 = chooseMenu - 1;
					System.out.println("개수 : ");
					int howMany = sc.nextInt();
					Food foodObject = new Food(chooseMenu2, foodList.get(chooseMenu2).getFoodName(),
							foodList.get(chooseMenu2).getPrice());
					// !addToMap.containsKey(foodObject)
					Set<Food> checkKey = addToMap.keySet();
					Iterator<Food> checkIt = checkKey.iterator();
					while (checkIt.hasNext()) {
						Food a = checkIt.next();
						if (a.getFoodNo() == chooseMenu2) {
							addToMap.replace(foodObject, howMany);
							System.out.println("Order리스트에 이미 등록되어 있으므로 수량 변경");
						}
					}
					addToMap.put(foodObject, howMany);
					System.out.println("Order리스트에 등록 시도합니다.");
				}
				Order addToManager = new StoreOrder(tableNum, addToMap);
				if (sm.insertOrder(addToManager)) {
					System.out.println("총 합계 : " + foodOrdered(addToMap) + "원");
					System.out.println("** 음식 주문을 완료하였습니다.");
				} else {
					System.out.println("Order리스트등록에 이미 있으므로 등록 안함");
				}

				break;

			case 2:
				printFoodList();
				System.out.println("전화번호를 입력하세요 : ");
				String phoneNum = sc.next();
				System.out.println("주소를 입력하세요 : ");
				String address = sc.next();

				Map<Food, Integer> addToMap2 = new HashMap();

				while (true) {
					System.out.println("주문할 메뉴 (입력이 끝나면 0)");
					int chooseMenu = sc.nextInt();
					if (chooseMenu == 0) {
						break;
					}
					int chooseMenu2 = chooseMenu - 1;
					System.out.println("개수 : ");
					int howMany = sc.nextInt();
					Food foodObject = new Food(chooseMenu2, foodList.get(chooseMenu2).getFoodName(),
							foodList.get(chooseMenu2).getPrice());
					Set<Food> checkKey = addToMap2.keySet();
					Iterator<Food> checkIt = checkKey.iterator();
					while (checkIt.hasNext()) {
						Food a = checkIt.next();
						if (a.getFoodNo() == chooseMenu2) {
							addToMap2.replace(foodObject, howMany);
							System.out.println("Order리스트에 이미 등록되어 있으므로 수량 변경");
						}
					}
					addToMap2.put(foodObject, howMany);
					System.out.println("Order리스트에 등록 시도합니다.");
				}
				Order addToManager2 = new DeliveryOrder(phoneNum, address, addToMap2);
				if (sm.insertOrder(addToManager2)) {
					System.out.println("총 합계 : " + foodOrdered(addToMap2) + "원");
					System.out.println("** 음식 주문을 완료하였습니다.");
				} else {
					System.out.println("Order리스트등록에 이미 있으므로 등록 안함");
				}

				break;

			case 9:

				return;
			default:
				System.out.println("입력이 잘못되었습니다. \n다시 입력해주세요.\n");
				break;
			}
		}

	}

	@Override
	public void deleteOrder() {
		System.out.print("  > 취소할 주문번호 입력 : ");
		int deleteOrderNumber = sc.nextInt();
		sm.deleteOrder(deleteOrderNumber);
	}

	@Override
	public void printMainMenu() {
		System.out.println("=========================");
		System.out.println("[ SCIT Restaurant 매상 관리 시스템  by 회인쓰]");
		System.out.println("=========================");
		System.out.println(" 1. 주문");
		System.out.println(" 2. 주문 취소");
		System.out.println(" 3. 당일 매출 정산 출력");
		System.out.println(" 9. 종료");
		System.out.println("=========================");
		System.out.print("** 메뉴 번호선택 : ");
	}

	@Override
	public void printOrderMenu() {
		System.out.println("=========================");
		System.out.println("	[ SCIT 음식 주문]		");
		System.out.println("=========================");
		System.out.println(" 1. 매장 주문");
		System.out.println(" 2. 배달 주문");
		System.out.println(" 9. 상위로");
		System.out.println("=========================");
		System.out.print("** 주문 방식 : ");
	}

	public Order makeOrder(int menuNum) {

		return null;
	}

	@Override
	public void printFoodList() {
		System.out.println("====== 주문 가능한 메뉴 ======");
		for (Food food : this.foodList) {
			System.out.println(food);
		}
		System.out.println("======================");
	}

	@Override
	public int foodOrdered(Map<Food, Integer> addToMap) {

		int partTotal = 0;

		for (Map.Entry<Food, Integer> check : addToMap.entrySet()) {
			Food checkKey = check.getKey();
			int checkPrice = checkKey.getPrice();
			int checkHowMany = check.getValue();
			partTotal += (checkPrice * checkHowMany);
		}

		return partTotal;
	}

}

/*
 * System.out.println("테이블 번호 : "); int tableNum = s.nextInt(); while(true) {
 * System.out.println("주문할 메뉴 "); int menuNum = s.nextInt(); Order o =
 * makeOrder(menuNum); if(sm.insertOrder(o)) {
 * System.out.println("음식 주문에 성공했습니다."); } else {
 * System.out.println("음식 주문에 실패했습니다."); }
 * System.out.println("주문을 종료하시겠습니까? 종료할거면  : n"); String done = s.next();
 * s.nextLine(); }
 */

/*
 * //받은 넘버값에 해당하는 푸드 고르고 수량 고르기 Map<Food, Integer> map = new HashMap<>();
 * 
 * Food wantedOrder = foodList.get(menuNum);
 * 
 * System.out.println("개수 : "); int howMany = s.nextInt(); map.put(wantedOrder,
 * howMany);
 * 
 * return new Order(map);
 */
