package broker.client;

import java.util.ArrayList;
import java.util.Scanner;

import broker.vo.BuyingAndSelling;
import broker.vo.Charter;
import broker.vo.MonthlyRent;
import broker.vo.RealEstate;

public class RealEstateBrokerUI {
	private RealEstateClientManager manager = new RealEstateClientManager();
	private Scanner sc = new Scanner(System.in);

	public RealEstateBrokerUI() {

		while (true) {
			printMainMenu();
			int zero = sc.nextInt();

			switch (zero) {
			case 1:
				insertForSalesInfo();
				break;
				
			case 2:
				searchForSalesInfo();
				break;

			case 3:
				System.out.println("|수정 물건의 주소|");
				String updatingAddress = sc.next();
				System.out.println("등록된 정보");
				System.out.println("=======================");
				RealEstate re = manager.searchForSalesByAddress(updatingAddress);
				System.out.println("=======================");
				//null 값일때는 그냥 돌아가기
				if(re == null) {
					break;
				}
				//null 아닐때 update 작업(1. 자식객체 생성하기)
					int change = 0;
					RealEstate reUpdate = null;
					if(re instanceof BuyingAndSelling) {
						System.out.println("매매가격 : ");
						change = sc.nextInt();
						reUpdate = new BuyingAndSelling(re.getAddress(), re.getHouseType(), re.getSize(), change);
					} else if(re instanceof Charter) {
						System.out.println("전세보증금 : ");
						change = sc.nextInt();
						reUpdate = new Charter(re.getAddress(), re.getHouseType(), re.getSize(), change);
					} else if(re instanceof MonthlyRent) {
						System.out.println("월임대료 : ");
						change = sc.nextInt();
						reUpdate = new MonthlyRent(re.getAddress(), re.getHouseType(), re.getSize(), change);
					}
				//null 아닐때 update 작업(2. 자식객체로 치환하기)
				manager.updateForSalesInfo(reUpdate);
				break;
				
			case 4:
				System.out.println("삭제할 주소 입력 :");
				sc.nextLine();
				String addressForDelete = sc.nextLine();
				boolean checkDelete = manager.deleteForSaleInfo(addressForDelete);
				if (checkDelete) {
					System.out.println("정상 삭제 되었습니다.");
				} else {
					System.out.println("삭제되지 않은걸 보아하니, 주소를 잘못입력하였거나 없는 주소입니다.");
				}
				break;

			case 5:
				ArrayList<RealEstate> arrList = manager.getAllForSalesInfo();
				if(arrList.isEmpty()) {
					System.out.println("등록된 정보가 없습니다.");
				} else {
					for(int i = 0; i < arrList.size(); i++) {
						System.out.println(arrList.get(i).getInfo());
					}
					System.out.println("이상 모두 출력되었습니다.");
				}
				break;
				
			case 9:
				manager.writeOnText();
				System.exit(0);
				break;

			default:
				System.out.println("제대로 된 번호를 입력하시오.");
				continue;
			}
		}
	}

	public void printMainMenu() {
		System.out.println("-------------------------");
		System.out.println("      부동산 중계 관리 시스템         ");
		System.out.println("-------------------------");
		System.out.println("1. 등록");
		System.out.println("2. 검색");
		System.out.println("3. 수정");
		System.out.println("4. 삭제(거래완료)");
		System.out.println("5. 전체출력");
		System.out.println("9. 종료");
		System.out.println("-------------------------");
		System.out.println("메뉴 번호를 선택하세요 => ");
	}

	public void printInsertForSalesInfoMenu() {
		System.out.println("-------------------------");
		System.out.println("      부동산 매물 정보 등록");
		System.out.println("-------------------------");
		System.out.println("1. 매매");
		System.out.println("2. 전세");
		System.out.println("3. 월세");
		System.out.println("4. 상위메뉴");
		System.out.println("-------------------------");
		System.out.println("메뉴 번호를 선택하세요 => ");
	}

	public void searchForSalesInfo() {
		System.out.println("-------------------------");
		System.out.println("부동산 매물 정보 검색");
		System.out.println("-------------------------");
		System.out.println("0. 주소로 검색");
		System.out.println("1. 매매 물건 검색");
		System.out.println("2. 전세 물건 검색");
		System.out.println("3. 월세 물건 검색");
		System.out.println("-------------------------");
		System.out.println("메뉴 번호를 선택하세요 => ");

		int second = 0;
		second = sc.nextInt();

		if (second == 0) {
			System.out.println("주소를 입력하세요");
			sc.nextLine();
			String inputAddress = sc.nextLine();
			manager.searchForSalesByAddress(inputAddress);			
		} else if (second == 1 | second == 2 | second == 3) {
			manager.searchForSalesByTradeType(second);
		} else {
			System.out.println("0~3의 숫자를 입력하시마셍카!");
		}
	}

	public void insertForSalesInfo() {
		// 객체 정보 입력 후 저장
		while (true) {
			printInsertForSalesInfoMenu();
			int first = sc.nextInt();
			if (first == 4) {
				break;
			} else if (first != 1 && first != 2 && first != 3) {
				System.out.println("올바른 숫자를 입력하세요.");
				break;
			}
			RealEstate addressCheck = makeForSaleInfo(first);
			if (manager.addForSales(addressCheck)) {
				System.out.println("등록에 성공하였습니다.");
			} else {
				System.out.println("등록에 실패하였습니다.");
			}
		}
	}

	public RealEstate makeForSaleInfo(int first) {

		// 객체를 저장할 변수 선언
		RealEstate re = null;

		// 모든 객체에 공통되는 인자값 받기
		System.out.print("주소 : ");
		sc.nextLine();
		String address = sc.nextLine();
		System.out.print("주거형태 : ");
		String houseType = sc.nextLine();
		System.out.print("크기 : ");
		int size = sc.nextInt();

		// 받은 인자 first를 가지고 매매, 전세, 월세에 해당하는 객체를 생성
		switch (first) {
		case 1:
			System.out.print("매매가격 : ");
			int price = sc.nextInt();
			re = new BuyingAndSelling(address, houseType, size, price);
			break;
		case 2:
			System.out.print("임대 보증금 :");
			int deposit = sc.nextInt();
			re = new Charter(address, houseType, size, deposit);
			break;
		case 3:
			System.out.print("월임대료 : ");
			int monthlyPrice = sc.nextInt();
			re = new MonthlyRent(address, houseType, size, monthlyPrice);
			break;
		case 4:
			System.out.println("상위 메뉴로 돌아갑니다.");
		}
		return re;
	}

}