import java.util.Scanner;

class homework2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");

		long a = input.nextLong();
		long b = 1;

			for(int i = 1; i <= a; i++) {			
				b *= i;
			}
		System.out.println(a + "! = " + b);
	
	}
}

//팩토리얼 : 1부터 n까지 모든 정수를 곱한 것