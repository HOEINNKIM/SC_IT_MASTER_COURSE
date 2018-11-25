package test01;
/*
 *하나의 파일에서 여러개의 클래스 정의가 가능하다.
 *이 경우 파일명은 메인 메서드가 있는 클래스 명으로 하고
 *클래스 앞 접근제어자 public은 메인이 있는 클래스 앞에 
 *한번만 정의 가능하다. 
 */

class Person{
	//생성자(Constructor)를 명시하면 자동삽입x
	//생성자가 비어 있으면 Person(){} 로 인식함.
	Person(){
		System.out.println("Person 생성자 실행");
	}
}

class MemberVO{
	/*
	 * 생성자명은 반드시 클래스 명과 일치해야 하고, 리턴 타입은 적지 않는다. X!
	 * 회원 객체는 반드시 아이디를 할당받을 때만 생성
	 * 이 경우 인자값 있는 생성자를 정의해야 한다.
	 */
	MemberVO(String id){
		System.out.println(id + " member object create...");
	}
	
}

public class TestConstructor {
	
	public static void main(String[] args) {
		new Person();
		MemberVO membervo = new MemberVO("java");
		
	}

}
