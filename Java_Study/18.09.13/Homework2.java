import java.util.Scanner;
class Homework2 {
	public static void main(String[] args) {

	int price;
	int goman;
	int man;
	int gosen;
	int sen;
	int won;

	Scanner input = new Scanner(System.in);
	System.out.println("상품가격을 입력하세요.");
	price = input.nextInt();
	goman = price / 50000;
	man = (price % 50000)/10000;
	gosen = (price % 10000)/5000;
	sen = (price % 5000)/1000;
	won = (price % 1000);
	System.out.println
		(price + "원은 5만원권 " + goman + "장, 만원권 " + man + "장, 5천원권 " + gosen + "장, 천원권 " + sen + "장을 지불하고 " + won + "원이 남습니다.");



	}
}

/*
	int price;
	int goman;
	int man;
	int gosen;
	int sen;
	int won;

	Scanner input = new Scanner(System.in);
	System.out.println("상품가격을 입력하세요.");
	price = input.nextInt();
	goman = price/50000;
	man = (price - goman*50000)/10000;
	gosen = (price - (goman*50000 + man*10000))/5000;
	sen = (price - (goman*50000 + man*10000 + gosen*5000))/1000;
	won = (price - (goman*50000 + man*10000 + gosen*5000 + sen*1000));
	System.out.println
		(price + "원은 5만원권 " + goman + "장, 만원권 " + man + "장, 5천원권 " + gosen + "장, 천원권 " + sen + "장을 지불하고 " + won + "원이 남습니다.");

*/