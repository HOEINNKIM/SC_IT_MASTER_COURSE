import java.util.Scanner;

class ExCalc {
	public static void main(String[] args) {
		System.out.println("계산기 프로그램!");
		Scanner input = new Scanner(System.in);
	
		
		System.out.print("숫자1: ");
		int a = input.nextInt();
		input.nextLine();

		System.out.print("숫자기호: ");
		String b = input.nextLine();


		System.out.print("숫자2: ");
		int c = input.nextInt();

	switch(b){

	case "+" :
		System.out.println(a + b + c + " = " + (a+c));
		break;
	case "-" :
		System.out.println(a + b + c + " = " + (a-c));
		break;
	case "*" :
		System.out.println(a + b + c + " = " + (a*c));
		break;
	case "/" :
		System.out.println(a + b + c + " = " + (a/c));
		break;
	default :
		System.out.println("연산자 제대로 입력할 것!");
		break;
	}


	}
}
