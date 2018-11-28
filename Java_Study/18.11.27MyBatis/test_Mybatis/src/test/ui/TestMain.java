package test.ui;

import test.dao.TestDao;
import test.vo.Person;

public class TestMain {

	public static void main(String[] args) {
		TestDao dao = new TestDao();
		
		//입력
		Person p = new Person(213, "기뫼인", 2, "010-0000-0000","서울시 양천구");
		dao.insertPerson(p);
		
	}

}
