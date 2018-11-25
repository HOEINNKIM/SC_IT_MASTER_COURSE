package step3_TestInner;

public class Person {
	private String password = "12345";
	// ...
	
	public class Inner {
		public void innerTest() {
			// Outer 클래스의 private 속성에 접근가능
			System.out.println(password);
		}
	}
}