import java.util.Scanner;
class Homework1 {
	
	public static void main(String[] args) {

	int givenTime;
	int hour;
	int minute;
	int remainTime;

	Scanner input = new Scanner(System.in);
	System.out.println("시간을 초 단위로 입력하세요 : ");
	givenTime = input.nextInt();
	hour = givenTime / 3600;
	minute = (givenTime % 3600)/60;
	remainTime = givenTime % 60;

	System.out.println(givenTime + "초는 " + hour + "시간 " + minute + "분 " + remainTime + "초입니다.");
	
	}
}

	/*	처음 작성한 코드
	int second;
	int minute;
	int hour;
	int lastsecond;

	Scanner input = new Scanner(System.in);
	System.out.println("시간을 초 단위로 입력하세요 : ");
	second = input.nextInt();
	
	hour = (int)second / 3600;
	minute = (int)(second - (hour * 3600))/60;
	lastsecond = (second - (hour * 3600 + minute * 60));
	System.out.println(second + "초는 " + hour + "시간 " + minute + "분 " + lastsecond + "초입니다.");
	*/