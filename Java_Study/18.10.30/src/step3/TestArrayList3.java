package step3;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestArrayList3 {

	public static void main(String[] args) {
		CompanyMgr mgr = new CompanyMgr();
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee("아이유", 220));
		list.add(new Employee("윤계상", 320));
		list.add(new Employee("안내상", 400));
		int avg = mgr.avgSalary(list);
		System.out.println(avg);		
		// list의 모든 Employee의 월급이 10% 인상된 새 리스트 rlist를 만드세요.
		System.out.println("***************");
		System.out.println(list);
		ArrayList<Employee> rlist = mgr.addBonusList(list);	
		System.out.println(rlist);
		//객체 값만 복사해서 새로운 객체를 생성하는 방법?
		
//		LinkedList : 연속된 데이터의 끝점과 시작점이 연결된 형태의 리스트
		LinkedList<Employee> lkList = new LinkedList<>();
		lkList.add(new Employee("아이유", 220));
		lkList.add(new Employee("윤계상", 320));
		lkList.add(new Employee("안내상", 400));
		lkList.add(1, new Employee("기뫼인", 150));
		System.out.println(lkList);
	}
}
//ArrayList는 인덱스 기반이므로 for문으로 2, 3번째 값을 변경하면 에러
//LinkedList는 링크점 기반이므로 for문으로 링크점변경만 하므로 에러x