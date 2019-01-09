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
			System.out.println("======if���� true�� �����Ҵ�" + chkMember.size());
			model.addAttribute("warning", "���̵� �̹� �����մϴ�");
			return "home";
		} else {
			dao.insertMember(member);
			System.out.println("db �Է� ����");
			
			model.addAttribute("id", member.getId());
			model.addAttribute("pw", member.getPw());
			
			return "login";			
			
		}
	}
}
