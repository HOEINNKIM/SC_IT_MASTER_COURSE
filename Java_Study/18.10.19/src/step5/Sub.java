package step5;

public class Sub extends Super {
	private int money = 100;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	public void printAll () {
		// private 형식은 자식이라도 접근 불가능
		//System.out.println(money + " " + age);
		
		//이 경우에는 set/get으로 접근 가능!(부모에서 public 으로 설정되어있기 때문에)
		System.out.println(money + " " + getAge());
			
		
	}
}