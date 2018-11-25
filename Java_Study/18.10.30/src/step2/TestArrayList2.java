package step2;

import java.lang.reflect.Member;
import java.util.ArrayList;

public class TestArrayList2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new MemberVO("id01", "pw01", "아이유", "종로"));
		System.out.println(list);
		list.add(new MemberVO("id02", "pw02", "신세경", "마포"));
		Object obj = list.get(0);
		MemberVO mvo = (MemberVO)obj;
		System.out.println(mvo.getName());	//아이유
		MemberVO mvo1 = (MemberVO)list.get(1);
		System.out.println(mvo1.getName()); //신세경
		System.out.println("********************************");
		list.add(new MemberVO("id03", "pw03", "신회인", "부평"));
		//현재 list의 모든 이름을 출력(for문 이용)
		for(int i = 0; i<list.size(); i++) {
			MemberVO vo = (MemberVO)list.get(i);
			System.out.println(vo.getName());
		}
		System.out.println("********************************");
		list.add(new MemberVO("id04", "pw04", "신삼당", "부평"));		

		//문제 : 부평에 사는 모든 사람의 이름을 출력

		for(int i = 0; i < list.size(); i++) {
			MemberVO bup = (MemberVO)list.get(i);
			if(bup.getAddress().equals("부평")) {
				System.out.println(bup.getName());
			}
		}
		System.out.println("********************************");
		System.out.println(list);
		MemberVO mem = new MemberVO("javaking", "pw05", "기뫼인", "서울");
		list.set(1, mem); //index에 해당하는 값을 변경할 때
		System.out.println(list);
		
	}
}

// == 이 true가 되는 때와 아닌 때