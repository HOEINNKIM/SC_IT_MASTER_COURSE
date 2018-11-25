package global.sesoc.ui;

import java.util.List;
import java.util.Scanner;

import global.sesoc.manager.ToyManagerMgr;
import global.sesoc.vo.Bicycle;
import global.sesoc.vo.Drone;
import global.sesoc.vo.GameConsole;
import global.sesoc.vo.Toy;

public class ToyManagerUI {
	Scanner input = new Scanner(System.in);
	ToyManagerMgr manager = new ToyManagerMgr();

	/**
	 * 생성자
	 */
	public ToyManagerUI() {
		int mNum = 0;

		while(true) {
			try {
				mainMenu();
				mNum = input.nextInt();

				switch(mNum) {
				case 1:
					insertToy();
					break;
				case 2:
					searchToy();
					break;
				case 3:
					deleteToy();
					break;
				case 4:
					searchForPrice();
					break;
				case 5:
					printToyInfo();
					break;
				case 9:		// 저장 후 끝냄
					System.out.println("데이터 저장 후 프로그램 종료합니다.");
					manager.saveFile();
					return;
				}
			} catch (Exception e) {
				System.out.println("오류 >>>>> 다시 입력해 주세요.");
				input.nextLine();
				continue;
			}
		}
	}

	/**
	 * 주메뉴를 화면에 출력한다.
	 */
	public void mainMenu() {
		System.out.println("\n===== Toy Manager ======");
		System.out.println("1. 장난감 등록");
		System.out.println("2. 장난감 검색");
		System.out.println("3. 장난감 삭제");
		System.out.println("4. 가격대 검색");
		System.out.println("5. 장난감 정보 출력");
		System.out.println("9. 종료");
		System.out.println("=======================");
		System.out.print  ("[ 메뉴  선택  ] ");
	}

	/**
	 * 장난감 추가를 위해 메뉴를 호출하고 해당 메뉴에 대한 선택을 입력받은 후
	 * Toy 객체를 생성하는 makeToy() 메서드를 호출 한 후
	 * 리턴된 Toy 객체를 List에 삽입한다.
	 */
	
	public void insertToy() {
		while(true) {
			try {
				insertMenu();
				int num = input.nextInt();
				switch (num) {
				case 1:				
				case 2:
				case 3:
					Toy madedToy = makeToy(num);
					if(manager.insertToy(madedToy)) {
						System.out.println("등록 성공");
					}else {
						System.out.println("이미 존재하는 고유번호입니다. 다른 고유번호를 입력하세요.");
					}				

				case 9:
					return;
				
				default:
					System.out.println("1, 2, 3, 9중에 하나를 선택하세요.");
					continue;
				}
				
			} catch(Exception e) {
				System.out.println("오류 >>>>> 다시 입력해 주세요.");
				input.nextLine();
			}
		}
	}

	/**
	 * 장난감 객체를 등록하기 위한 메뉴를 화면에 출력
	 */
	public void insertMenu() {
		System.out.println("\n===== 장난감 등록 메뉴 =====");
		System.out.println("1. 자전거");
		System.out.println("2. 드론");
		System.out.println("3. 게임기");
		System.out.println("9. 상위메뉴");
		System.out.print  ("[ 장난감 선택 ] ");
	}

	/**
	 * 장난감 객체를 저장하기 위해 Toy 객체를 생성한다.
	 * 장난감의 종류에 따라 자전거(1. 도로용, 2. 산악용), 드론(날개 갯수), 게임기(휴대가능 여부)를 입력받는다. 
	 * @param toyType 장난감 종류
	 * @return 생성된 장난감 객체
	 */
	public Toy makeToy(int toyType) {
		Toy toy = null;
		String name, serialNum;
		int price = 0;

		while(true) {
			// Code Here
			System.out.print(">고유번호:");
			serialNum = input.next();
			System.out.print(">이름:");
			name = input.next();
			System.out.print(">가격:");
			price = input.nextInt();

			switch(toyType) {
			case 1:
				
				while(true) {
					System.out.print(">자전거 종류(1. 도로용, 2. 산악용) =>");
					String d = input.next();
					int k = Integer.parseInt(d);
					if(k==1||k==2) {
						if(k==1) {
							d = "mountain";
						} else {
							d = "road";
						}
						toy = new Bicycle(serialNum, name, price, d);
						break;
					}
					System.out.println("******1과 2중에서 고르시오.");
				}
				
				break;
			case 2:
				System.out.print(">날개 수 =>");
				int e = input.nextInt();
				toy = new Drone(serialNum, name, price, e);
				break;
			case 3:
				boolean check = false;
				System.out.print(">휴대용(y/n) =>");
				String f = input.next();
				if(f.equals("y")) {
					check = true;
					toy = new GameConsole(serialNum,name,price, check);
				} else if(f.equals("n")){
					toy = new GameConsole(serialNum,name,price, check);
				} else {
					System.out.println("y와 n 중 하나를 적어야 합니다. 고유번호부터 다시 적으시오.");
				}
				break;
			}					
			if(toy!=null) {
			return toy;	
			}
		}
	}

	/**
	 * 고유번호에 해당하는 장난감을 검색하여 화면에 출력한다.
	 * 검색이 되지 않을 경우 메시지 출력
	 */
	public void searchToy() {
		while(true) {
			System.out.print("\n> 장난감 고유번호: ");
			String serialNum = input.next();
			Toy sToy = manager.searchToy(serialNum);

			if(sToy != null) {
				System.out.println(sToy.toString());
			}
			else {
				System.out.println("검색 실패 >>>>> 입력하신 고유번호의 장난감이 존재하지 않습니다.\n");
			}
			return;
		}
	}

	/** 
	 * 장난감의 시리얼번호를 입력받아 해당하는 장난감 정보를 삭제한다. 
	 */
	public void deleteToy() {
		System.out.println("\n===== 장난감 삭제 메뉴 =====");
		System.out.print("> 장난감 고유 번호: ");
		String serialNum = input.next();

		if(manager.deleteToy(serialNum)) {
			System.out.println("[ 삭제 성공 ]\n");
		}
		else {
			System.out.println("삭제 실패 >>>>> 입력하신 고유번호의 장난감이 존재하지 않습니다.\n");
		}
	}

	/**
	 * 가격대 검색
	 * 최소 가격과 최대 가격을 입력받아 해당하는 가격 범위 내의 모든 장난감을 검색해서 출력
	 */
	public void searchForPrice()  {
		System.out.println("\n===== 가격 검색 메뉴 =====");

		System.out.print("> 최소가격: ");
		int minPrice = input.nextInt();

		System.out.print("> 최대가격: ");
		int maxPrice = input.nextInt();

		int count = 0;

		// Code Here
		System.out.println("[ " + minPrice + "원 ~ " + maxPrice + "원 사이의 제품 검색 결과 ]");
		List<Toy> gotToys = manager.toyListForPrice(minPrice, maxPrice);
		for(int i = 0 ; i < gotToys.size(); i++){
			System.out.println(gotToys.get(i).toString());
			count++;
		}
		System.out.println("[총 " + count + " 개의 제품이 검색되었습니다. ]");
	}

	/**
	 * 장난감 정보를 화면에 출력
	 * 장난감 정보를 출력하고 난 후 검색한 장난감의 개수 출력
	 * 검색이 되지 않을 경우 등록된 장난감이 없다는 메시지 출력
	 */
	public void printToyInfo() {
		while(true) {
			printMenu();
			int pNum = input.nextInt();
			String msg = null;
			
			// Code Here 
			
			switch(pNum) {
			case 1:
				List<Toy> entireToy = manager.printToyInfo(pNum);
				msg = "총 장난감 개수: [" +entireToy.size() + "] 대";

				if(entireToy.size()==0) {
					System.out.println("등록된 장난감이 없습니다.");
				} else {
					System.out.println(msg);
				}
				break;

			case 2:
				List<Toy> pBic = manager.printToyInfo(pNum);
				msg = "총 자전거 대수: [" + pBic.size() + "] 대";
				
				if(pBic.size()==0) {
					System.out.println("등록된 장난감이 없습니다.");
				} else {
					System.out.println(msg);
				}
				break;
				
			case 3:
				List<Toy> pDrone = manager.printToyInfo(pNum);
				msg = "총 드론 대수: [" + pDrone.size() + "] 대";
				
				if(pDrone.size()==0) {
					System.out.println("등록된 장난감이 없습니다.");
				} else {
					System.out.println(msg);
				}
				break;

			case 4:
				List<Toy> pGameConsole = manager.printToyInfo(pNum);
				msg = "총 드론 대수: [" + pGameConsole.size() + "] 대";
				
				if(pGameConsole.size()==0) {
					System.out.println("등록된 장난감이 없습니다.");
				} else {
					System.out.println(msg);
				}
				break;
				
			case 9:
				return;
			default : 
				System.out.println("[ 메뉴를 다시 선택해 주세요. ] ");
				continue;
			}
		}
	}

	/**
	 * 장난감 정보 출력 서브 메서드
	 */
	public void printMenu() {
		System.out.println("\n===== 장난감 정보 출력 =====");
		System.out.println("1. 전체 출력");
		System.out.println("2. 자전거 정보 출력");
		System.out.println("3. 드론 정보 출력");
		System.out.println("4. 게임콘솔 정보 출력");
		System.out.println("9. 상위 메뉴");
		System.out.print  ("[ 선택 ] ");
	}
}