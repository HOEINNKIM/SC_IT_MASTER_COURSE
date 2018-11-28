package test.dao;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisConfig {
	private static SqlSessionFactory sqlSessionFactory;
	
	//static �ʱ�ȭ ���� ����Ͽ� Ŭ������ �ε��� �� ���� �ѹ� ����
	static {
		String resource = "mybatis-config.xml";		//mybatis ȯ�漳�� ���ϸ�
				
		try {
			Reader reader = Resources.getResourceAsReader(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
				//reader ��ü�� �־ ȯ�漳���� sqlSessionFactory�� ����. 
			reader.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public static SqlSessionFactory getSqlsessionFactory() {
		// ȯ�漳���� ��� �ִ� sqlSessionFactory�� ��ȯ���ִ� �޼���
		return sqlSessionFactory;
	}
	
}
