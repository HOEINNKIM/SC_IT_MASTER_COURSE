package com.scit.mybatis.DAO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scit.mybatis.VO.Member;

@Repository
public class MemberDAO {
	
	//������ ����
	@Autowired
	SqlSession sqlSession;
	public int insertMember(Member member) {
		
		int result = 0;
		MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);

		try {
			result = mapper.insertMember(member);
			//���������� �˾Ƽ� Ŀ���� ���ֹǷ� Ŀ���� �ʿ� ����.
			/*sqlSession.commit();*/
	} catch(Exception e) {
			e.printStackTrace();
			return 0;
		} finally {
			//���������� �˾Ƽ� Ŭ���� ���ش�.
			/*sqlSession.close();	*/				
		}

		return result;
	}
}