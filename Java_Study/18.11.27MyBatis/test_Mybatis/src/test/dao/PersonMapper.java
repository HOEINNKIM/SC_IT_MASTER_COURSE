package test.dao;

import java.util.ArrayList;

import test.vo.Person;

public interface PersonMapper {

	//��ü�� �����ϴ� SQL
	public int insertPerson(Person p);
	
	//Person ��ü ��� �д� SQL
	public ArrayList<Person> selectPerson();
	
}
