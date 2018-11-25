package step9_TestAbstract;

//abstract method가 하나이상 존재하면 해당 클래스는 abstract class !
abstract class Parent {
	public void eat() {
		System.out.println("먹다");

	}

	public abstract void study();
	// abstract 메서드는 중괄호가 없음. 하나 이상의 abstract 가 있어야함.
}

class Child extends Parent {

	@Override
	public void study() {
		System.out.println("공부하다");
	}
	
	public void play() {
		System.out.println("놀다");
	}
}

public class TestAbstract {
	public static void main(String[] args) {
//		new Parent();//abstract 클래스는 객체 생성이 불가능
		Child c = new Child();
		c.study();
		c.eat();
		c.play();
		Parent p = new Child();
		p.study();
		p.eat();
//		p.play();//독자적인 자식 클래스의 메서드를 사용하기 위해서는 객체 클래스를 캐스팅해야한다.
		((Child)p).play();		
		// 상송과 다형성은 동일하게 사용할 수 있다.
	}

}
