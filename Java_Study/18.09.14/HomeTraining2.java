import java.util.Scanner;
class HomeTraining2 {
	public static void main(String[] args) {

		int cm;
		double inch;

		Scanner input = new Scanner(System.in);
		System.out.print("길이 입력 (Cm 단위) : ");
		cm = input.nextInt();
		inch = (1/2.54) * cm;
		System.out.println(cm + "Cm = " + inch + "inch");
		
	}
}
