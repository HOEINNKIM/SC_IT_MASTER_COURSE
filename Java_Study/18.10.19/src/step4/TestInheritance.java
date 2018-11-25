package step4;

public class TestInheritance {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.bonus);
		System.out.println(c.money); // 상속받으므로 접근 가능
		c.eat();
	}
}
