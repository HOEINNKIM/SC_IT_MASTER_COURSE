import java.util.Scanner;

class Test01 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Java 점수 : ");
		int a = input.nextInt();
		
		System.out.print("Oracle 점수 : ");
		int b = input.nextInt();

		System.out.print("JSP 점수 : ");
		int c = input.nextInt();

		int sum = a+b+c;
		double avg = (double)sum/3;

			if(a>= 100 || b>=100 || c>=100 || a<0 || b<0 || c<0) {
			System.out.println("잘못 입력했습니다.");
			} else {
			System.out.print("총점 : " + sum + " 평균 : " + avg + " 등급 : ");
		 	
				if(avg>=90) {
						System.out.println("수");
				}else if(avg >=80) {
						System.out.println("우");
				
				}else if(avg >=70) {
						System.out.println("미");
				
				}else if(avg >=60) {
						System.out.println("양");
				
				}else {
						System.out.println("가");
				}
			
			}


			
	}
}

//각 과목의 점수가 100이 넘는 경우