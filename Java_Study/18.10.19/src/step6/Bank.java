package step6;

public class Bank {
	public void publicTest() {
		System.out.println("publicTest");
		privateTest();
	}

	protected void protectedTest() {
		System.out.println("protectedTest");
	}

	void defaultTest() {
		System.out.println("defaultTest");
	}

	 private void privateTest() {
		System.out.println("privateTest");
	}
	 
}

