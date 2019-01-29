package com.scit.practice_190121.DAO;

import com.scit.practice_190121.VO.Member;

public interface MemberMapper {

	public int insertMember(Member member);
	
	public Member selectMember(Member member);
}
