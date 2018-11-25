package step5;

import java.util.ArrayList;
import java.util.Iterator;

import step3.Employee;

abstract class TestIterator2 {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee("아이유", 220));
		list.add(new Employee("윤계상", 320));
		list.add(new Employee("안내상", 400));		
		Iterator<Employee> it = list.iterator();
	//월급이 300이상인 사람의 이름을 출력

		while(it.hasNext()) {
			Employee emp = it.next();
			if(emp.getSalary()>=300) {
				System.out.println(emp.getEname());
			}
		}
	}
}