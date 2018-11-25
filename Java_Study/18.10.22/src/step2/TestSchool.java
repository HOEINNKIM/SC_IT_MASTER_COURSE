package step2;

public class TestSchool {

	public static void main(String[] args) {
		Person p = new Person("김회인", "010-1234-5678");
		System.out.println(p.getInfo());
		Student s = new Student("회인킴", "010-1234-5678", "hoeinn");
		System.out.println(s.getInfo());
		Teacher t = new Teacher("호오인", "123-4567", "음악");
		System.out.println(t.getInfo());
	}

}
