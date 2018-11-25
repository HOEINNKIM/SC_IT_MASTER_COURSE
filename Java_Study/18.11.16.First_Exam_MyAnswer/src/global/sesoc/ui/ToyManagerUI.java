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
	 * ������
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
				case 9:		// ���� �� ����
					System.out.println("������ ���� �� ���α׷� �����մϴ�.");
					manager.saveFile();
					return;
				}
			} catch (Exception e) {
				System.out.println("���� >>>>> �ٽ� �Է��� �ּ���.");
				input.nextLine();
				continue;
			}
		}
	}

	/**
	 * �ָ޴��� ȭ�鿡 ����Ѵ�.
	 */
	public void mainMenu() {
		System.out.println("\n===== Toy Manager ======");
		System.out.println("1. �峭�� ���");
		System.out.println("2. �峭�� �˻�");
		System.out.println("3. �峭�� ����");
		System.out.println("4. ���ݴ� �˻�");
		System.out.println("5. �峭�� ���� ���");
		System.out.println("9. ����");
		System.out.println("=======================");
		System.out.print  ("[ �޴�  ����  ] ");
	}

	/**
	 * �峭�� �߰��� ���� �޴��� ȣ���ϰ� �ش� �޴��� ���� ������ �Է¹��� ��
	 * Toy ��ü�� �����ϴ� makeToy() �޼��带 ȣ�� �� ��
	 * ���ϵ� Toy ��ü�� List�� �����Ѵ�.
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
						System.out.println("��� ����");
					}else {
						System.out.println("�̹� �����ϴ� ������ȣ�Դϴ�. �ٸ� ������ȣ�� �Է��ϼ���.");
					}				

				case 9:
					return;
				
				default:
					System.out.println("1, 2, 3, 9�߿� �ϳ��� �����ϼ���.");
					continue;
				}
				
			} catch(Exception e) {
				System.out.println("���� >>>>> �ٽ� �Է��� �ּ���.");
				input.nextLine();
			}
		}
	}

	/**
	 * �峭�� ��ü�� ����ϱ� ���� �޴��� ȭ�鿡 ���
	 */
	public void insertMenu() {
		System.out.println("\n===== �峭�� ��� �޴� =====");
		System.out.println("1. ������");
		System.out.println("2. ���");
		System.out.println("3. ���ӱ�");
		System.out.println("9. �����޴�");
		System.out.print  ("[ �峭�� ���� ] ");
	}

	/**
	 * �峭�� ��ü�� �����ϱ� ���� Toy ��ü�� �����Ѵ�.
	 * �峭���� ������ ���� ������(1. ���ο�, 2. ��ǿ�), ���(���� ����), ���ӱ�(�޴밡�� ����)�� �Է¹޴´�. 
	 * @param toyType �峭�� ����
	 * @return ������ �峭�� ��ü
	 */
	public Toy makeToy(int toyType) {
		Toy toy = null;
		String name, serialNum;
		int price = 0;

		while(true) {
			// Code Here
			System.out.print(">������ȣ:");
			serialNum = input.next();
			System.out.print(">�̸�:");
			name = input.next();
			System.out.print(">����:");
			price = input.nextInt();

			switch(toyType) {
			case 1:
				
				while(true) {
					System.out.print(">������ ����(1. ���ο�, 2. ��ǿ�) =>");
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
					System.out.println("******1�� 2�߿��� ���ÿ�.");
				}
				
				break;
			case 2:
				System.out.print(">���� �� =>");
				int e = input.nextInt();
				toy = new Drone(serialNum, name, price, e);
				break;
			case 3:
				boolean check = false;
				System.out.print(">�޴��(y/n) =>");
				String f = input.next();
				if(f.equals("y")) {
					check = true;
					toy = new GameConsole(serialNum,name,price, check);
				} else if(f.equals("n")){
					toy = new GameConsole(serialNum,name,price, check);
				} else {
					System.out.println("y�� n �� �ϳ��� ����� �մϴ�. ������ȣ���� �ٽ� �����ÿ�.");
				}
				break;
			}					
			if(toy!=null) {
			return toy;	
			}
		}
	}

	/**
	 * ������ȣ�� �ش��ϴ� �峭���� �˻��Ͽ� ȭ�鿡 ����Ѵ�.
	 * �˻��� ���� ���� ��� �޽��� ���
	 */
	public void searchToy() {
		while(true) {
			System.out.print("\n> �峭�� ������ȣ: ");
			String serialNum = input.next();
			Toy sToy = manager.searchToy(serialNum);

			if(sToy != null) {
				System.out.println(sToy.toString());
			}
			else {
				System.out.println("�˻� ���� >>>>> �Է��Ͻ� ������ȣ�� �峭���� �������� �ʽ��ϴ�.\n");
			}
			return;
		}
	}

	/** 
	 * �峭���� �ø����ȣ�� �Է¹޾� �ش��ϴ� �峭�� ������ �����Ѵ�. 
	 */
	public void deleteToy() {
		System.out.println("\n===== �峭�� ���� �޴� =====");
		System.out.print("> �峭�� ���� ��ȣ: ");
		String serialNum = input.next();

		if(manager.deleteToy(serialNum)) {
			System.out.println("[ ���� ���� ]\n");
		}
		else {
			System.out.println("���� ���� >>>>> �Է��Ͻ� ������ȣ�� �峭���� �������� �ʽ��ϴ�.\n");
		}
	}

	/**
	 * ���ݴ� �˻�
	 * �ּ� ���ݰ� �ִ� ������ �Է¹޾� �ش��ϴ� ���� ���� ���� ��� �峭���� �˻��ؼ� ���
	 */
	public void searchForPrice()  {
		System.out.println("\n===== ���� �˻� �޴� =====");

		System.out.print("> �ּҰ���: ");
		int minPrice = input.nextInt();

		System.out.print("> �ִ밡��: ");
		int maxPrice = input.nextInt();

		int count = 0;

		// Code Here
		System.out.println("[ " + minPrice + "�� ~ " + maxPrice + "�� ������ ��ǰ �˻� ��� ]");
		List<Toy> gotToys = manager.toyListForPrice(minPrice, maxPrice);
		for(int i = 0 ; i < gotToys.size(); i++){
			System.out.println(gotToys.get(i).toString());
			count++;
		}
		System.out.println("[�� " + count + " ���� ��ǰ�� �˻��Ǿ����ϴ�. ]");
	}

	/**
	 * �峭�� ������ ȭ�鿡 ���
	 * �峭�� ������ ����ϰ� �� �� �˻��� �峭���� ���� ���
	 * �˻��� ���� ���� ��� ��ϵ� �峭���� ���ٴ� �޽��� ���
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
				msg = "�� �峭�� ����: [" +entireToy.size() + "] ��";

				if(entireToy.size()==0) {
					System.out.println("��ϵ� �峭���� �����ϴ�.");
				} else {
					System.out.println(msg);
				}
				break;

			case 2:
				List<Toy> pBic = manager.printToyInfo(pNum);
				msg = "�� ������ ���: [" + pBic.size() + "] ��";
				
				if(pBic.size()==0) {
					System.out.println("��ϵ� �峭���� �����ϴ�.");
				} else {
					System.out.println(msg);
				}
				break;
				
			case 3:
				List<Toy> pDrone = manager.printToyInfo(pNum);
				msg = "�� ��� ���: [" + pDrone.size() + "] ��";
				
				if(pDrone.size()==0) {
					System.out.println("��ϵ� �峭���� �����ϴ�.");
				} else {
					System.out.println(msg);
				}
				break;

			case 4:
				List<Toy> pGameConsole = manager.printToyInfo(pNum);
				msg = "�� ��� ���: [" + pGameConsole.size() + "] ��";
				
				if(pGameConsole.size()==0) {
					System.out.println("��ϵ� �峭���� �����ϴ�.");
				} else {
					System.out.println(msg);
				}
				break;
				
			case 9:
				return;
			default : 
				System.out.println("[ �޴��� �ٽ� ������ �ּ���. ] ");
				continue;
			}
		}
	}

	/**
	 * �峭�� ���� ��� ���� �޼���
	 */
	public void printMenu() {
		System.out.println("\n===== �峭�� ���� ��� =====");
		System.out.println("1. ��ü ���");
		System.out.println("2. ������ ���� ���");
		System.out.println("3. ��� ���� ���");
		System.out.println("4. �����ܼ� ���� ���");
		System.out.println("9. ���� �޴�");
		System.out.print  ("[ ���� ] ");
	}
}