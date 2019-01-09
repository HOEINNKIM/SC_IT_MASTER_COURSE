package com.scit.oraclespring.dao;


import java.util.ArrayList;

import com.scit.oraclespring.vo.Member;

public interface MemberMapper {
	public int insertMember(Member member);
	public ArrayList<Member> selectMember(Member member);
}
