package step1;

public class Main {

	public static void main(String[] args) {
		//Person person = new Person(	); 추상은 이렇게 못씀
		Teacher teacher = new Teacher("김회인", "서울", "한문");
		teacher.printInfo();
		
		Person person = new Teacher("김회인", "서울", "한문");
		person.printInfo();
		
		Person person2 = new Student("김회인", "서울", "2011");
		person2.printInfo();

		Person person3 = new Teacher();
		person3.printInfo();
		
	}

}
