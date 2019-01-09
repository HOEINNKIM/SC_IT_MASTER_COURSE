package com.scit.oraclespring.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.scit.oraclespring.vo.Member;

@Component
public class memberDAO {

	@Autowired
	SqlSession sqlSession;
	
	
	public int insertMember(Member member) {
		MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);
		int cnt = 0;
		
		try {
			cnt = mapper.insertMember(member);			
		} catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
		
		return cnt;
	}
	
	public ArrayList<Member> selectMember(Member member) {
		MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);
		ArrayList<Member> memList = new ArrayList<Member>();
		
		try {
			memList = mapper.selectMember(member);			
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
		return memList;
	}
}
