import java.util.Scanner;
public class Test_181001_02_answer {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�޴���ȣ �� �޴����� �Է¹޾Ƽ� ����ϱ�");
		// ����ȭ�� :
		// ��ȣ�� �����Ͻÿ�
		// 1.�޴����, 2.���, 0.����
		// ��ȣ : 1(�Է��ϴ°ſ���)
		// ����� �޴����� �Է��ϼ���
		// �޴��� : �׽�Ʈ�޴�(�Է��ϴ°̴ϴ�)
		// ������ ����� �ּ���
		// ���� : 10000(�̷��� �Է����ϸ� �˴ϴ�)
		// 
		// ��ȣ�� �����Ͻÿ�
		// 1.�޴����, 2.���, 0.����
		// ��ȣ : 2(�Է��ϴ°ſ���)
		// �׽�Ʈ�޴� : 10000
		// 
		// ��ȣ�� �����Ͻÿ�
		// 1.�޴����, 2.���, 0.����
		// ��ȣ : 1(�̹� 3���� �޴��� ��ϵ� �Ķ��,)
		// ���̻� ����� �� �����ϴ�.
		// 
		// ��ȣ�� �����Ͻÿ�
		// 1.�޴����, 2.���, 0.����
		// ��ȣ : 0
		// (���α׷�����)
		int num = 0;
		String[] menuName = new String[3];
		int[] cost = new int[3];
		int count = 0;
		do {
			System.out.println("��ȣ�� �����Ͻÿ�");
			System.out.println("1.�޴����, 2.���, 0.����");
			System.out.print("��ȣ : ");
			num = input.nextInt();
			if (num == 0) {
				System.out.println("(���α׷�����)");
			} else if (num == 1) {
				// �̹� 3���� �޴��� ��ϵǾ����� üũ
				if (count < 3) {
					// �޴����
					System.out.println("����� �޴����� �Է��ϼ���");
					System.out.print("�޴��� : ");
					String menu = input.next();
					System.out.println("������ ����� �ּ���");
					System.out.print("���� : ");
					int money = input.nextInt();
					// �迭�� ���
					menuName[count] = menu;
					cost[count] = money;
					// �迭�� ��� ���� ó��
					count++;
				} else {
					System.out.println("���̻� ����� �� �����ϴ�.");
				}
			} else if (num == 2) {
				// �޴����� ù��°�� �ش��ϴ� �迭�� null���� üũ
				if (menuName[0] == null) {
					System.out.println("��ϵ� �޴��� �ϳ��� ���׿�.\n");
					continue;
				}
				// �޴����� ��ü���
				for (int i = 0; i < menuName.length; i++) {
					if (menuName[i] != null) {
						System.out.println(menuName[i] + " : " + cost[i]);
					}
				}
			} else {
				System.out.println("�߸� �Է��ϼ̳׿�.");
			}
			System.out.println();
		} while (num != 0);
	}
}
