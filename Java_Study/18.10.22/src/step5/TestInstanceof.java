package step5;

import step4.Animal;
import step4.Person;

class Monkey extends Animal {}

public class TestInstanceof {
/*
	Instanceof 연산자 : 객체의 타입을 비교해서 판단한다.	
*/	
	public static void main(String[] args) {
		Monkey m = new Monkey();
		if(m instanceof Monkey) {
			System.out.println("Monkey 객체");
		}
		Animal a = new Person();
		System.out.println(a instanceof Person);
		//instanceof 는 is a 관계이면 true를 반환한다.
		//비교할 때에 자식에서부터 부모의 순서로 비교해나간다.
		System.out.println(a instanceof Animal);		
		System.out.println(a instanceof Monkey);
	}

}
