package test.ui;

import test.dao.TestDao;
import test.vo.Person;

public class TestMain {

	public static void main(String[] args) {
		TestDao dao = new TestDao();
		
		//�Է�
		Person p = new Person(213, "�����", 2, "010-0000-0000","����� ��õ��");
		dao.insertPerson(p);
		
	}

}
