package step3;


class Person {
	private int money = 100;
	Person(int money){
		this.money = money;
	}

	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}

}
public class TestObjectInit {
	public static void main(String[] args) {
		// 객체 초기화 단계를 알아보는 예제
		// 1. 기본 초기화
		// 2. 변수에 의한 명시적 초기화
		// 3. 생성자에 의한 초기화
		// 4, setter 호출시 초기화
		Person p = new Person(3);
		System.out.println(p.getMoney());
	
	}

}
