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
	System.out.println("��ǰ������ �Է��ϼ���.");
	price = input.nextInt();
	goman = price / 50000;
	man = (price % 50000)/10000;
	gosen = (price % 10000)/5000;
	sen = (price % 5000)/1000;
	won = (price % 1000);
	System.out.println
		(price + "���� 5������ " + goman + "��, ������ " + man + "��, 5õ���� " + gosen + "��, õ���� " + sen + "���� �����ϰ� " + won + "���� �����ϴ�.");



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
	System.out.println("��ǰ������ �Է��ϼ���.");
	price = input.nextInt();
	goman = price/50000;
	man = (price - goman*50000)/10000;
	gosen = (price - (goman*50000 + man*10000))/5000;
	sen = (price - (goman*50000 + man*10000 + gosen*5000))/1000;
	won = (price - (goman*50000 + man*10000 + gosen*5000 + sen*1000));
	System.out.println
		(price + "���� 5������ " + goman + "��, ������ " + man + "��, 5õ���� " + gosen + "��, õ���� " + sen + "���� �����ϰ� " + won + "���� �����ϴ�.");

*/