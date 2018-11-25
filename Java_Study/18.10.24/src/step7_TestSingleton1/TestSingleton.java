package step7_TestSingleton1;

public class TestSingleton {

	public static void main(String[] args) {
		//new Company();
		Company c = Company.getInstance();
		System.out.println(c);
		Company c1 = Company.getInstance();
		System.out.println(c1);
		//	
	}	
}