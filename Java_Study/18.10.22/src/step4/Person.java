package step4;

public class Person extends Animal{

	//매서드 오버라이딩
	@Override
	public void eat() {
		System.out.println("수저로 먹다");
	}
	
	public void study() {
		System.out.println("공부하다");
	}
}
