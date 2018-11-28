package test.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import test.vo.Person;

public class TestDao {
	private SqlSessionFactory factory = MybatisConfig.getSqlsessionFactory();

	//ȸ������ ����
	public void insertPerson(Person p) {
		SqlSession ss = null;

		ss = factory.openSession();	//1��°
		PersonMapper mapper = ss.getMapper(PersonMapper.class);	//2��°
		mapper.insertPerson(p);	//3��°
		ss.commit();
		ss.close();
	}
	
	//ȸ����� �б�
	public ArrayList<Person> selectPerson(){
		ArrayList<Person> list = null;
		SqlSession ss = null;

		ss = factory.openSession();	//1��°
		PersonMapper mapper = ss.getMapper(PersonMapper.class);	//2��°
		list = mapper.selectPerson();	//3��°
		ss.commit();
		ss.close();
		
		return list;
	}
}
