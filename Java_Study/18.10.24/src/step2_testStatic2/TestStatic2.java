﻿package step2_testStatic2;

class Test {
	public static void test1() {
		// test2(); // static -> non-static으로 접근하려면 객체 생성해야한다.
	}

	public void test2() {
	}

	public void test3() {
		test1(); // non-static -> static으로 접근은 가능
	}
}

public class TestStatic2 {
	public void test() {
		System.out.println("non-static test...");
	}
	
	public static void main(String[] args) {
//		test();	//동일한 클래스 내에서 접근할지라도 객체 생성이 필요함.
		TestStatic2 t = new TestStatic2();

	}
	
}
