package com.scit.practice_190121.DAO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scit.practice_190121_VO.Member;

@Repository
public class MemberDAO {

	@Autowired
	SqlSession sqlSession;
	
	public int insertMember(Member member) {
		MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);
		int result = 0;
		
		try {
			result = mapper.insertMember(member);			
		} catch(Exception e) {
			e.printStackTrace();
			return result;
		}
		
		return result;
	}
	
	public Member selectMember(Member member) {
		MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);
		Member result = null;
		
		try {
			result = mapper.selectMember(member);			
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
		return result;

	}
	
	
}
