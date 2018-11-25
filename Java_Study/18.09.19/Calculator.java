import java.util.Scanner;

class Calculator {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("피연산자 : ");
		int a = input.nextInt();

		System.out.print("  연산자 : ");
		int b = input.nextInt();

		
		System.out.println(a + " + " + b + " = " + (a+b)); 



	}
}
