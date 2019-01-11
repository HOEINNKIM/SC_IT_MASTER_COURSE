package com.scit.springexercise;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scit.springexercise.DAO.MemberDAO;
import com.scit.springexercise.VO.Member;

@Controller
public class MemberController {

	@Autowired
	MemberDAO dao;

	@RequestMapping(value = "/insertMember", method = RequestMethod.POST)
	public String insertMember(Member member, Model model) {

		ArrayList<Member> memList = dao.selectMember(member);
		if (memList == null) {
			model.addAttribute("warning", "������ �߻��߽��ϴ�. �ܼ��� Ȯ���ϼ���.");
			return "signIn";
		} else if (memList.size() != 0) {
			model.addAttribute("member", member);
			model.addAttribute("warning", "�̹� ��ϵ� id�Դϴ�.");
			return "signIn";
		} else {
			dao.insertMember(member);
			model.addAttribute("congrats", "ȸ�����Կ� �����Ͽ����ϴ�.");
			return "home";
		}
	}

	@RequestMapping(value = "/loginCheck", method = RequestMethod.POST)
	public String login(Member member, Model model, HttpSession session) {

		Member memberX = null;
		memberX = dao.loginCheck(member);
		
		if (memberX == null) {
			model.addAttribute("warning", "������ �߻��߽��ϴ�. �ܼ��� Ȯ���ϼ���.");
			return "home";
		} else {
			session.setAttribute("member", memberX);
			return "success";
		}
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		
		//ù��° session ����
		//���̵� ������ ���� �� ������ ��� �� ����
		session.invalidate();
		
		//�ι�° session ����
		//�α��� ������ ������ �ٸ� �����Ͱ� ���ǿ� ����� ��쿡�� �ش� �α��ΰ� ���õ� ��ü�� ����
		//session.setAttribute("loginId", null);
		return "home";
	}

}