package step3;

import java.util.ArrayList;

public class CompanyMgr {

	public int avgSalary(ArrayList<Employee> list) {
		int sum = 0;
		for(int i = 0 ; i < list.size(); i++) {
			sum += list.get(i).getSalary();
		}
		return sum/list.size();
	}

	public ArrayList<Employee> addBonusList(ArrayList<Employee> list) {
			
		for(int i = 0; i <list.size(); i++) {
			//1
			double money = list.get(i).getSalary()*1.1;
			list.get(i).setSalary((int)money);			
			//2
			int money2 = (int)(list.get(i).getSalary());
			
			//3
			list.get(i).setSalary((int)(list.get(i).getSalary()*1.1));
		}
		
		return list;
	}

}
