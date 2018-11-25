package step1_TestObject;

public class TestObject {

	public static void main(String[] args) {
		Person p1 = new Person("아이유");
		Person p2 = new Person("아이유");
		
		System.out.println(p1 == p2);	//false
		System.out.println(p1.equals(p2));	//false 주소값을 비교, ==와 같은 의미
		System.out.println(p1.equals("아이유"));
		//java.lang.Object 최상위 클래스로부터 상속받은 equals
		
		System.out.println(p1.getName().equals(p2.getName()));
		System.out.println(p1.getName().equals("아이유"));
		System.out.println("아이유".equals("아이유"));
		//java.lang.String에서 equals()를 오버라이딩해서 문자열을 비교.
		Car c1 = new Car("티코");
		Car c2 = new Car("티코");
		System.out.println(c1.equals(c2));	
		//equals에 대한 오버라이딩으로 equals 적용		
		System.out.println(c1==c2);
		System.out.println(c1.equals("아이유"));
		System.out.println(c1.equals(1));
		
	}
}