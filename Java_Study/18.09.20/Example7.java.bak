import java.util.Scanner;

class Example7 {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
					
			for(int i = 1; ; i++){
	
				System.out.print("숫자 : ");
				int a = input.nextInt();

				System.out.print("기호 : ");
				input.nextLine();
				String b = input.nextLine();
				
				System.out.print("숫자 : ");
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
						System.out.println("사칙연산을 제대로 입력하시오");
						break;
				}
				
				System.out.print("이어서계산하시겠습니까?(0)");
				
				int d = input.nextInt();
					if(d!=0){
						break;
					}				
			}				
	}
}