package com.scit.practice_190121;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scit.practice_190121.DAO.MemberDAO;
import com.scit.practice_190121.VO.Member;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
		
	@Autowired
	MemberDAO dao;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {

		return "home";
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signup() {

		return "signup";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {

		return "login";
	}
	
	@RequestMapping(value = "/insertMember", method = RequestMethod.GET)
	public String insertMember(Member member, Model model) {
		int result = 0;
		result = dao.insertMember(member);
		
		if(result == 0) {
			model.addAttribute("Warning", "가입에 실패하였습니다.");
			return "signup";			
		} else {
			model.addAttribute("Success", "가입에 성공했습니다.");			
			return "home";
		}
	}
	
	@RequestMapping(value = "/loginMember", method = RequestMethod.GET)
	public String loginMember(Member member, Model model, HttpSession session) {

		Member mem = dao.selectMember(member);
		if(mem==null) {
			model.addAttribute("Warning", "로그인에 실패하였습니다.");
			return "login";
		} else {
			
			session.setAttribute("loginId", mem.getId());
			System.out.println("2222" + session.getAttribute("loginId")+"1111");

			return "home";
		}		
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.invalidate();
		return "/home";
	}
}
