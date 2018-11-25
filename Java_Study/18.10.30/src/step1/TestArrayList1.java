package step1;

import java.util.ArrayList;

public class TestArrayList1 {

	
	public static void main(String[] args) {
		ArrayList list = new ArrayList(); // List: 순서를 보장 O, 중복을 허용 O
		list.add("김회인");
		list.add("다나카");
		list.add("티이모");
		list.add("김회인");
		System.out.println(list);	//toString() 오버라이딩
		System.out.println(list.size());
		System.out.println(list.contains("김회인"));
		//list.add("김회인"); // 중복 가능
		System.out.println(list.remove("김회인"));
		System.out.println(list);
		//존재의 여부 true/false 반환
		list.clear();
		System.out.println(list);
		list = null;
		System.out.println(list);
		//System.out.println(list.get(1));
		//인덱스로 조회해서 데이터를 반환
		
		//문제 : 마지막 요소를 출력 size() + get() 조합해서 작성하세요.		
		//int a = list.size() - 1;
		//System.out.println(list.get(a));
	}
}