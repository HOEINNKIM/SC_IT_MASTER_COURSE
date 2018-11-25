import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {

		int[] intArr = new int[10];

		Scanner input = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
		System.out.print((i+1) + "번째 도서에 등록할 번호를 입력하시오 : ");
		intArr[i] = input.nextInt();
		}
		
		System.out.println("첫번째 도서 : " + intArr[0]);
		System.out.println("두번째 도서 : " + intArr[1]);
		System.out.println("세번째 도서 : " + intArr[2]);
		System.out.println("네번째 도서 : " + intArr[3]);
		System.out.println("다섯번째 도서 : " + intArr[4]);
		System.out.println("여섯번째 도서 : " + intArr[5]);
		System.out.println("일곱번째 도서 : " + intArr[6]);
		System.out.println("여덟번째 도서 : " + intArr[7]);
		System.out.println("아홉번째 도서 : " + intArr[8]);
		System.out.println("열번째 도서 : " + intArr[9]);
				

	}
}
