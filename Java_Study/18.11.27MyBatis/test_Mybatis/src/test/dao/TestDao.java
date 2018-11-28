package test.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import test.vo.Person;

public class TestDao {
	private SqlSessionFactory factory = MybatisConfig.getSqlsessionFactory();

	//회원정보 저장
	public void insertPerson(Person p) {
		SqlSession ss = null;

		ss = factory.openSession();	//1번째
		PersonMapper mapper = ss.getMapper(PersonMapper.class);	//2번째
		mapper.insertPerson(p);	//3번째
		ss.commit();
		ss.close();
	}
	
	//회원목록 읽기
	public ArrayList<Person> selectPerson(){
		ArrayList<Person> list = null;
		SqlSession ss = null;

		ss = factory.openSession();	//1번째
		PersonMapper mapper = ss.getMapper(PersonMapper.class);	//2번째
		list = mapper.selectPerson();	//3번째
		ss.commit();
		ss.close();
		
		return list;
	}
}
