package step2;

public class MyDate {

	private int day = 1;
	private int month = 1;
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if(day>=1 && day<=31) {
			this.day = day;
		} else {
			System.out.println("잘못된 입력값입니다.");
		}	
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month>=1 && month<=12) {
			this.month = month;
		} else {
			System.out.println("잘못된 입력값입니다.");
		}	
	}
	
	
	
	
}
