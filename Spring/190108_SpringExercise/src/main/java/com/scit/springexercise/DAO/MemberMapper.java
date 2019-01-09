package com.scit.springexercise.DAO;

import java.util.ArrayList;

import com.scit.springexercise.VO.Member;

public interface MemberMapper {

	public int insertMember(Member member);
	public ArrayList<Member> selectMember(Member member);
	public Member loginCheck(Member member);
}
