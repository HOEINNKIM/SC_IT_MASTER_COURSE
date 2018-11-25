package step9;

public class TestOverriding2 {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setName("김회인");
		e.setAge(24);
		System.out.println(e.getDetails());
		Manager m = new Manager();
		m.setName("이대건");
		m.setAge(29);
		m.setDept("영업부");
		System.out.println(m.getDetails());
	}
}