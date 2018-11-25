package step1;

class Person {
	public static void test() {
		System.out.println("static test...");
	}
}

public class TestStatic1 {

	public static void main(String[] args) {
		Person.test(); // 객체 생성없이 클래스명으로 접근이 가능하다.
		// 이 작업이 필요 없음
		// Person p = new Person(); 
		//p.test();
		for(int i = 0; i<5; i++) {
			System.out.println(Math.random()); //API의 static으로 접근가능
		}

	}
}
