package step4_TestStatic4;

class A{
	static int i;
	A(){
		i++;
	}
}


public class TestStatic4 {

	public static void main(String[] args) {
		A a = new A(); //1
		System.out.println(a.i);
		new A();	//2
		System.out.println(a.i);
		new A();	//3
		System.out.println(a.i);
	}

}
