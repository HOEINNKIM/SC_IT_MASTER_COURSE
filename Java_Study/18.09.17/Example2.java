import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {

		int[] intArr = new int[10];

		Scanner input = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
		System.out.print((i+1) + "��° ������ ����� ��ȣ�� �Է��Ͻÿ� : ");
		intArr[i] = input.nextInt();
		}
		
		System.out.println("ù��° ���� : " + intArr[0]);
		System.out.println("�ι�° ���� : " + intArr[1]);
		System.out.println("����° ���� : " + intArr[2]);
		System.out.println("�׹�° ���� : " + intArr[3]);
		System.out.println("�ټ���° ���� : " + intArr[4]);
		System.out.println("������° ���� : " + intArr[5]);
		System.out.println("�ϰ���° ���� : " + intArr[6]);
		System.out.println("������° ���� : " + intArr[7]);
		System.out.println("��ȩ��° ���� : " + intArr[8]);
		System.out.println("����° ���� : " + intArr[9]);
				

	}
}
