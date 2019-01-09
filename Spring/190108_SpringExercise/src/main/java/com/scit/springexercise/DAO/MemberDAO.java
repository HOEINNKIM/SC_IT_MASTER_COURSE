package com.scit.springexercise.DAO;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.scit.springexercise.VO.Member;

@Component
public class MemberDAO {

	@Autowired
	SqlSession sqlSession;
	
	public int insertMember(Member member) {
		
		int result = 0;
		MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);
		
		try {
			result = mapper.insertMember(member);
		}catch(Exception e) {
			e.printStackTrace();
			return  0;
		}
		
		return result;

	}

	public ArrayList<Member> selectMember(Member member){
		
		ArrayList<Member> memList = new ArrayList<Member>();
		MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);
		
		try {
			memList = mapper.selectMember(member);
		}catch(Exception e) {
			e.printStackTrace();
			return  null;
		}
		
		return memList;
		
	}
	
	public Member loginCheck(Member member){
		
		//어레이리스트가 아닌 Member 객체 자체로도 받을 수 있다.
		Member memList = null;

		MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);
		
		try {
			memList = mapper.loginCheck(member);
		}catch(Exception e) {
			e.printStackTrace();
			return  null;
		}
		return memList;		
	}
}