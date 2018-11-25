package step3;

class Animal { //extends Object
	
}

class Car { //extends Object
	private String model = "K5";
	//주소값 대신에 객체의 필드 속성을 반환

	@Override
	public String toString() {
		return "Car [model=" + model + "]";
	}	
}

public class TestObject {
	public static void main(String[] args) {
		Animal a = new Animal();
		System.out.println(a.toString());  //주소값을 반환
		System.out.println(a); 				//println()에서 toString()값을 가져와 출력
		Car c = new Car();
		System.out.println(c.toString());
		System.out.println(c);	
	}
}