package step1;

import java.util.HashMap;

public class TestMap1 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("s1", "아이유");
		map.put("s2", "신세경");
		map.put("s3", "안내상");
		System.out.println(map);
		System.out.println(map.get("s1"));	
		System.out.println(map.get("아이유")); //키값에 존재안하므로 null
		System.out.println(((String)map.get("s3")).length()); //제너릭 지정 안할경우객체 캐스팅을 통해서만 접근가능
		//System.out.println(map.get("s2").length());
		System.out.println(map.size()); //jUnit이라는 기능을 알아볼것
		map.put("s3", "장혁");
		System.out.println(map);
		System.out.println(map.containsKey("s3"));		//true/false
		System.out.println(map.containsValue("장혁"));	//true/false
		System.out.println(map.remove("s1")); //value값이 나온다.
		System.out.println(map.remove("s5")); //null을 가지고 와서 다른 로직을 만들 수 있음
		System.out.println(map);
		map.clear();
		System.out.println(map);
		map.put("em", new Employee("엔젤", 500));
		Employee e = (Employee)map.get("em");
		System.out.println(e.getEname());
		System.out.println(e.getSalary());
	}
}