package step5_TestSet;

import java.util.HashSet;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {
		Set<String> set = new HashSet();
		set.add("아이유");
		set.add("김구라");
		set.add("김회인");
		set.add("김회인");
		System.out.println(set); //toString() 오버라이딩 되어 요소가 전체출력
		System.out.println(set.size()); // 길이 3
		System.out.println(set.contains("김구라"));	//요소가 존재하는지 true/false
		System.out.println(set.contains("김광석"));
		System.out.println(set.remove("김회인"));	//해당 요소 삭제할 수 있었는지
		System.out.println(set);
		set.clear();
		System.out.println(set);
		set = null;
		System.out.println(set); 
		//set이라는 변수에 주소값(Hashcode)가 있으면 [], 없으면 null
	}
}