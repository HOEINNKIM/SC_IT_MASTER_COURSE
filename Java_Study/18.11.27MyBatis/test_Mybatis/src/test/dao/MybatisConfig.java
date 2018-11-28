package test.dao;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisConfig {
	private static SqlSessionFactory sqlSessionFactory;
	
	//static 초기화 블럭을 사용하여 클래스가 로딩될 때 최초 한번 실행
	static {
		String resource = "mybatis-config.xml";		//mybatis 환경설정 파일명
				
		try {
			Reader reader = Resources.getResourceAsReader(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
				//reader 객체에 넣어서 환경설정을 sqlSessionFactory에 저장. 
			reader.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public static SqlSessionFactory getSqlsessionFactory() {
		// 환경설정을 담고 있는 sqlSessionFactory를 반환해주는 메서드
		return sqlSessionFactory;
	}
	
}
