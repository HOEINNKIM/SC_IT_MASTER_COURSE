package step4;

public class TestPoly1 {

	public static void main(String[] args) {
		//부모 타입의 참조변수에다가 자식객체의 주소값을 할당했습니다.
		Animal a = new Person();
		//부모 타입의 변수로 사용할 수 있는 범위 체크
		a.sleep();	//사용 가능
		a.eat();	//오버라이딩한 메서드가 실행되었습니다.
//		a.study();
			//자식 객체로 생성은 했지만 자식객체의 독자적인 멤버(변수, 메서드)로 접근은 불가능하다.
			//이 경우, 독자적인 멤버를 호출하기 위해서는 객체 캐스팅(down casting)이 필요
		Person p = (Person)a;
		p.study();
		//추가로, 줄여서 사용한다면
		((Person)a).study();
	}
}