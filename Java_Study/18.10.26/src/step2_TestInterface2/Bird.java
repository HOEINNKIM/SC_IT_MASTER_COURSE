package step2_TestInterface2;

public class Bird extends Animal implements Flyer {

	@Override
	public void fly() {
		System.out.println("?덇? ?좊떎");
	}
	
	public void sing() {
		System.out.println("?덇? ?몃옒?섎떎");
	}

}
