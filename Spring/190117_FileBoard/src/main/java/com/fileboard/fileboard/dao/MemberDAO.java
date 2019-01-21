package com.fileboard.fileboard.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fileboard.fileboard.vo.Member;

@Repository
public class MemberDAO {

	@Autowired
	SqlSession sqlSession;
	
	public int insertMember(Member member) {
		
		int result = 0;
		MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);
		
		try {
			result = mapper.insertMember(member);
			
		} catch(Exception e) {
			e.printStackTrace();
			return result;
		}
		return result;
		
	}
	
	public Member selectMember(Member member) {

		Member mem = null;
		MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);

		try {
			mem = mapper.selectMember(member);
		} catch(Exception e) {
			e.printStackTrace();
			return mem;
		}
		return mem;
	}
}
