import java.util.Scanner;
class VarTest2 {
	public static void main(String[] args) {

	int Korean;     //��� �Ҽ��� ǥ�ø� ���ؼ� �Ǽ� ó��
	int English;
	int Mathmatics;
	

	Scanner input = new Scanner(System.in);

	System.out.println("�������� : ");
	Korean = input.nextInt();
	
	System.out.println("�������� : ");
	English = input.nextInt();
	
	System.out.println("�������� : ");
	Mathmatics = input.nextInt();
	
	double Total = (double)Korean + English + Mathmatics;

	System.out.println("���� : " + (int)Total);
	System.out.println("��� : " + Total/3); 

	}
}


/*
3������ ������ �Է¹޾� ������ ����� �����ֽÿ�.

������ :
	�������� : 80
	�������� : 90
	�������� " 95
	���� : 265
	��� : 88.3333333333
*/