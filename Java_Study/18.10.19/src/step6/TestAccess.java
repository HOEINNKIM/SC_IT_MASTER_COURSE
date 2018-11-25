package step6;

public class TestAccess extends Bank {
	public void test() {
		this.publicTest();
		this.protectedTest();
		this.defaultTest();
		//this.privateTest();
		//private 는 자식클래스에서 생성;
	}
/*
	public > protected > default > private
	public : 해당 프로젝트 내에서 누구든지 접근가능하다
	private : 같은 클래서 내에서만 접근 가능
	protected : 같은 패키지 내에서만 접근가능 (단, 상속관계에서는 어디서가 접근 가능)
	default : 같은 패키지 내에서만 접근 가능
	private : 같은 클래서 내에서만 접근 가능
*/	
	public static void main(String[] args) {
		Bank b = new Bank();
		b.publicTest();
		b.protectedTest();
		b.defaultTest();
		// b.privateTest();
		
	}

}
