import java.util.Scanner;
class Homework1 {
	
	public static void main(String[] args) {

	int givenTime;
	int hour;
	int minute;
	int remainTime;

	Scanner input = new Scanner(System.in);
	System.out.println("�ð��� �� ������ �Է��ϼ��� : ");
	givenTime = input.nextInt();
	hour = givenTime / 3600;
	minute = (givenTime % 3600)/60;
	remainTime = givenTime % 60;

	System.out.println(givenTime + "�ʴ� " + hour + "�ð� " + minute + "�� " + remainTime + "���Դϴ�.");
	
	}
}

	/*	ó�� �ۼ��� �ڵ�
	int second;
	int minute;
	int hour;
	int lastsecond;

	Scanner input = new Scanner(System.in);
	System.out.println("�ð��� �� ������ �Է��ϼ��� : ");
	second = input.nextInt();
	
	hour = (int)second / 3600;
	minute = (int)(second - (hour * 3600))/60;
	lastsecond = (second - (hour * 3600 + minute * 60));
	System.out.println(second + "�ʴ� " + hour + "�ð� " + minute + "�� " + lastsecond + "���Դϴ�.");
	*/