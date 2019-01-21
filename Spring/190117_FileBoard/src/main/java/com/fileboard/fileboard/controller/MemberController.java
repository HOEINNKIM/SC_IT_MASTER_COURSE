package com.fileboard.fileboard.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fileboard.fileboard.dao.MemberDAO;
import com.fileboard.fileboard.vo.Member;

@Controller
public class MemberController {

	@Autowired
	MemberDAO dao;

	@RequestMapping(value = "/signup", method = { RequestMethod.GET, RequestMethod.POST })
	public String signup() {
		return "signup";
	}

	@RequestMapping(value = "/login", method = { RequestMethod.GET, RequestMethod.POST })
	public String login() {
		return "login";
	}

	@RequestMapping(value = "/logout", method =  { RequestMethod.GET, RequestMethod.POST })
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}

	@RequestMapping(value = "/insertMember", method = RequestMethod.POST)
	public String insertMember(Model model, Member member) {

		int result = dao.insertMember(member);

		if (result == 0) {
			model.addAttribute("message", "ID�� �ߺ��Ǿ� ���Կ� �����߽��ϴ�.");
			model.addAttribute("member", member);
			return "signup";
		}

		return "redirect:/";
	}

	@RequestMapping(value = "/selectMember", method = RequestMethod.POST)
	public String selectMember(HttpSession session, Model model, Member member) {

		Member result = dao.selectMember(member);

		if (result == null) {
			model.addAttribute("message", "ID�� PW�� Ȯ�����ּ���.");
			model.addAttribute("member", member);
			return "login";
		}
		session.setAttribute("loginId", result.getId());

		return "redirect:/";
	}

}


/*package com.fileboard.fileboard.controller;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fileboard.fileboard.dao.MemberDAO;
import com.fileboard.fileboard.vo.Member;

@Controller
public class MemberController {


	//DAO ������ ����
	@Autowired
	MemberDAO dao;
	
	//!! ����Ʈ�� ���̵� method�� ��ȣ�� ������ �Ѵ� �����Ѵ�.
	@RequestMapping(value="/signup", method= {RequestMethod.GET, RequestMethod.POST})
	public String signup() {
		
		
		return "signup";
	}

	
	@RequestMapping(value="/login", method= {RequestMethod.GET, RequestMethod.POST})
	public String login() {
	
		return "login";
	}

	@RequestMapping(value="/logout", method= {RequestMethod.GET, RequestMethod.POST})
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	//ȸ�� ���� ��Ʈ�ѷ�
	@RequestMapping(value="/insertMember", method=RequestMethod.POST)
	public String insertMember(Model model, Member member) {
		
		int result = dao.insertMember(member);
		
		if(result==0) {
			model.addAttribute("message", "ID�� �ߺ��Ǿ� ���Կ� �����߽��ϴ�.");
			model.addAttribute("member", member);
			return "signup";
		}
		return "redirect:/";
	}

	//�α��� ��Ʈ�ѷ�
	@RequestMapping(value="/selectMember", method=RequestMethod.POST)
	public String selectMember(HttpSession session, Model model, Member member) {
		
		Member result = dao.selectMember(member);
		
		if(result==null) {
			model.addAttribute("message", "ID�� PW�� Ȯ�����ּ���.");
			model.addAttribute("member", member);
			
			return "login";
		}

		session.setAttribute("loginId", result.getId());
		
		return "redirect:/";
	}

}
*/