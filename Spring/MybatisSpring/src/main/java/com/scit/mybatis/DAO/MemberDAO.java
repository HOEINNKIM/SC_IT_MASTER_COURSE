package com.scit.mybatis.DAO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scit.mybatis.VO.Member;

@Repository
public class MemberDAO {
	
	//의존성 주입
	@Autowired
	SqlSession sqlSession;
	public int insertMember(Member member) {
		
		int result = 0;
		MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);

		try {
			result = mapper.insertMember(member);
			//스프링에서 알아서 커밋을 해주므로 커밋이 필요 없다.
			/*sqlSession.commit();*/
	} catch(Exception e) {
			e.printStackTrace();
			return 0;
		} finally {
			//스프링에서 알아서 클로즈 해준다.
			/*sqlSession.close();	*/				
		}

		return result;
	}
}