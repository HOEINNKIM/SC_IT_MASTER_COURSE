import java.util.Scanner;
class VarTest1 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // System.in은 시스템에 들어가는 입력에 해당하는 신호
		int price;
		int receivedprice;

		System.out.println("상품금액을 입력하세요 : ");
		price = input.nextInt();
		System.out.println("받은 돈을 입력하세요 : ");
		receivedprice = input.nextInt();
		System.out.println("거스름돈은 " + (price-receivedprice) + "원입니다.");

	}
}

/*
 거스름돈계산하기
 실행결과 :
 상품금액을 입력하세요 : [숫자로 입력되기]
 받을 돈을 입력하세요 : [숫자로 입력되기]
 거스름돈은 4700원입니다.
*/
