package com.fileboard.fileboard.dao;

import java.util.ArrayList;

import com.fileboard.fileboard.vo.Member;

public interface MemberMapper {

	//ȸ�� ����
	public int insertMember(Member member);
	
	//�α���
	public Member selectMember(Member member);

}
