package com.scit.oraclespring;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scit.oraclespring.dao.memberDAO;
import com.scit.oraclespring.vo.Member;

@Controller
public class MemberController {

	
	@Autowired
	memberDAO dao;
	
	
	@RequestMapping(value = "/insertMember", method = RequestMethod.POST)
	public String insertMember(Member member, Model model) {
		ArrayList<Member> chkMember = dao.selectMember(member);
		System.out.println(chkMember);
		System.out.println(chkMember.size());
		if(chkMember.size()!=0) {			
			System.out.println("======if문의 true로 들어오았다" + chkMember.size());
			model.addAttribute("warning", "아이디가 이미 존재합니닷");
			return "home";
		} else {
			dao.insertMember(member);
			System.out.println("db 입력 성공");
			
			model.addAttribute("id", member.getId());
			model.addAttribute("pw", member.getPw());
			
			return "login";			
			
		}
	}
}
