package step8_TestFinal;

final class A {
}

//class B extends A{} // error -> final 클래스는 상속이 불가능하다
class C {
	public final void c() {
	}
}

// 상속에 문제는 없으나 오버라이딩은 불가능
class D extends C {
//	public void c() {}
	// final 메서드는 오버라이딩이 불가능하다
}

class E {
	public static final int MY_ID = 1; // final 은 상수이므로 대문자,
										// 합성어는 _로 연결해서 표현한다 // 국제 표기 약속

	void e() {
//		MY_ID = 2; // final 상수는 값을 재설정하는 것이 불가능
	}

}

public class TestFinal {
	public static void main(String[] args) {
		System.out.println(E.MY_ID);
	}
}
