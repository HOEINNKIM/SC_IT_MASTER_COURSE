package step4;

class Printer{ //매서드 오버로딩
	public void test() {}
	//public void test() {}// X - 동일한 이름과 파라미터 형태가 동일하면 error 발생.
	public void test(int i) {} // ok
	public void test(String s) {} // ok - 타입이 다르더라도 오버로딩 가능
	public void test(int i, String s) {} // ok - 갯수가 다르더라도 오버로딩 가능
	public void test(String s, int i) {} // ok - 순서가 다르더라도 오버로딩 가능
	public void test(int i, int j) {}
	//public void test(int j, int i) {} // X - 변수의 위치만 바뀌는 것으로 오버로딩 안됨, 타입이 중요	
}

class Person{
	private int age;
	private String name;
	Person(){
		//생성자 오버로딩 : 생성자를 여러개 정의하여 다양한 초기값을 입력받음.
	}
	
	Person(int age) { 
		this.age = age;
	}
	// 생성자 오버로딩
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}

}
public class TestOverloading {
	public static void main(String[] args) {
		//같은 이름의 메서드를 다양한 인자값으로 정의함으로써
		//메서드 사용자의 편의성을 높이기 위한 코딩기법
		System.out.println(1);		// println(int i){...}
		System.out.println("1");	// println(String s){...}
	}
}
