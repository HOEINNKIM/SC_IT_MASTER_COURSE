import java.util.Scanner;

class Calculator {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("�ǿ����� : ");
		int a = input.nextInt();

		System.out.print("  ������ : ");
		int b = input.nextInt();

		
		System.out.println(a + " + " + b + " = " + (a+b)); 



	}
}
