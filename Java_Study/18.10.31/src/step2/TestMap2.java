package step2;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestMap2 {

	public static void main(String[] args) {
		HashMap<String, Employee> map = new HashMap<>();
		Employee e1 = new Employee("최명주", 250);
		map.put("e1", e1);
		Employee e2 = new Employee("박소연", 550);
		map.put("e2", e2);
		Employee e3 = new Employee("장보영", 310);
		map.put("e3", e3);
		Employee e4 = new Employee("최명주", 240);
		map.put("e4", e4);
		System.out.println(map);
		
		//월급이 300을 초과하는 사람의 이름을 출력하시오
		//옛 방식
		Collection<Employee> col = map.values();
		Iterator<Employee> it = col.iterator();
		while (it.hasNext()) {
			Employee e = it.next();
			if(e.getSalary()>300) {
				System.out.println(e.getEname());
			}
			
		}
		//map의 key만 출력
		Set<String> set = map.keySet();
		Iterator<String> it2 = set.iterator();
		while (it2.hasNext()) {
			//System.out.println(it2.next());
			String key = it2.next();
			System.out.println("Key값 :" + key);
			System.out.println("Value값 :" + map.get(key));
			System.out.println("Value값의 salary : " + map.get(key).getSalary());
			//System.out.println("Value값의 salary : " + ((Employee)map.get(key)).getSalary());			
			//System.out.println(map.get(it2.next()));			
		
			System.out.println("---------------------------------------------------------");
		//map에 들어있는 Employee의 이름을 중복제거하고 전체 출력
		Set<String> setX = map.keySet();
		Iterator<String> itX = setX.iterator();
		Set<String> setS = new HashSet();		
		while (itX.hasNext()) {
			String keyX = itX.next();
			setS.add(map.get(keyX).getEname());
			System.out.println(setS);
		}
			System.out.println(setS);
		}
	}
}