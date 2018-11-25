package step4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class TestIterator {

	public static void main(String[] args) {
		//Iterator : Collection 계열의 요소를 읽기 위한 방법으로 표준화된 인터페이스
		//주요 abstract method
		//hasNext() : boolean 타입 반환 -> 다음 읽어올 요소가 있으면 true, 없으면 false
		//next() : Object 반환 -> 다음 요소를 반환
		
		ArrayList<String> list = new ArrayList<>(); // List: 순서를 보장 O, 중복을 허용 O
		list.add("김회인");
		list.add("다나카");
		list.add("티이모");
		System.out.println(list);	

		//아래 메서드를 이용해서 모든 요소를 출력
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		HashSet<String> set = new HashSet<>();
		set.add("김회인");
		set.add("다나카");
		set.add("티이모");
		Iterator<String> it2 = set.iterator();		
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		//set은 순서가 없기 때문에 for문으로 뽑아낼 수 없음.
	}
}