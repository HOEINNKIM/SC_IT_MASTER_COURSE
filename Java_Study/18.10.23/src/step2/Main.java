package step2;

import java.util.Scanner;

public class Main {
	
	 public static void main(String[] args) {
		 Calculator cal = new Calculator();
		 Scanner input = new Scanner(System.in);
		 		 
		 for(;;) {
			 System.out.println("===================");
			 System.out.println("1.덧셈");
			 System.out.println("2.뺄셈");
			 System.out.println("3.곱셈");
			 System.out.println("4.나눗셈");
			 System.out.println("5.종료");			 
			 System.out.println("===================");
			 
			 int a = input.nextInt();
			 if(a==5) {
				 break;
			 }
			 System.out.println("첫번째 수를 입력해주세요 : ");
			 double b = input.nextDouble();
			 System.out.println("두번째 수를 입력해주세요 : ");		 
			 double c = input.nextDouble();
			 switch(a) {
			 case 1:
				 System.out.println(cal.add(b, c));
				 break;
			 case 2:
				 System.out.println(cal.minus(b, c));
				 break;
			 case 3:
				 System.out.println(cal.multiplier(b, c));
				 break;
			 case 4:
				 System.out.println(cal.divide(b, c));
				 break;
			 }
		 }
/*		 System.out.println(cal.add(6,7));
		 System.out.println(cal.divide(6,7));
		 System.out.println(cal.minus(6,7));
		 System.out.println(cal.multiplier(6,7));
*/			
	 }	
}