package step5_TestStatic5;

class Person {
	private String name;
	int count; // heap 영역에 매번 새롭게 초기화 된다.
	static int sCount; // class area 에 계속해서 누적된다.

	public Person(String name) {
		super();
		this.name = name;
		count++;
		sCount++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class TestStatic5 {

	public static void main(String[] args) {
		Person p1 = new Person("김회인");
		System.out.println(p1.count);
		System.out.println("static : " + Person.sCount);
		Person p2 = new Person("김뫼인");
		System.out.println(p2.count);
		System.out.println("static : " + Person.sCount);
		Person p3 = new Person("기뫼인");
		System.out.println(p3.count);
		System.out.println("static : " + Person.sCount);
	}

}
