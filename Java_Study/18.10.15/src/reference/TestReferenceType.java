package reference;

public class TestReferenceType {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("김회인");
		System.out.println(p1.getName());

		Person p2 = new Person();
		p2.setName("김회인2");
		System.out.println(p2.getName());
		
		p2 = p1;
		System.out.println(p2.getName());
		p2 = null;
		System.out.println(p1.getName());
		
		Person p3 = new Person();
		System.out.println(p3.getName());
		
		
	}
}

//ありがとうございます。