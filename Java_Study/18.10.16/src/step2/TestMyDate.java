package step2;

public class TestMyDate {

	public static void main(String[] args) {
		MyDate d = new MyDate();
		d.setDay(32); //잘못된 입력값입니다.
		System.out.println(d.getDay()); //1
		d.setDay(-1); //잘못된 입력값입니다.
		System.out.println(d.getDay()); //1
		d.setDay(31); 
		System.out.println(d.getDay()); //31	
		
		System.out.println();

		
		// month 는  1~12만 유효하도록 조건검사를 setter에 구현
		d.setMonth(0); //잘못된 입력값입니다.
		System.out.println(d.getMonth()); //1			
		d.setMonth(13); //잘못된 입력값입니다.
		System.out.println(d.getMonth()); //1			
		d.setMonth(12); //잘못된 입력값입니다.
		System.out.println(d.getMonth()); //12			
		
	}
}
