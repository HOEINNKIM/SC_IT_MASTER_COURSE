package com.scit.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scit.mybatis.DAO.MemberDAO;
import com.scit.mybatis.VO.Member;

@Controller
public class MemberController {

	@Autowired
	MemberDAO dao;

	@RequestMapping(value="/insertMember", method=RequestMethod.POST)
	public String insertMember(Member member) {

		
		int result = dao.insertMember(member);		
		return "home";
	}

}