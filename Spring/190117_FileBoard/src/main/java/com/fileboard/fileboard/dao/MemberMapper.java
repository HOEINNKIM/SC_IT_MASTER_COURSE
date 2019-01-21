package com.fileboard.fileboard.dao;

import java.util.ArrayList;

import com.fileboard.fileboard.vo.Member;

public interface MemberMapper {

	//회원 가입
	public int insertMember(Member member);
	
	//로그인
	public Member selectMember(Member member);

}
