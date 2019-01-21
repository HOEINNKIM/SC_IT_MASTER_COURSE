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
			model.addAttribute("message", "ID가 중복되어 가입에 실패했습니다.");
			model.addAttribute("member", member);
			return "signup";
		}

		return "redirect:/";
	}

	@RequestMapping(value = "/selectMember", method = RequestMethod.POST)
	public String selectMember(HttpSession session, Model model, Member member) {

		Member result = dao.selectMember(member);

		if (result == null) {
			model.addAttribute("message", "ID와 PW를 확인해주세요.");
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


	//DAO 의존성 주입
	@Autowired
	MemberDAO dao;
	
	//!! 포스트든 겟이든 method를 괄호로 묶으면 둘다 차리한다.
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
	
	//회원 가입 컨트롤러
	@RequestMapping(value="/insertMember", method=RequestMethod.POST)
	public String insertMember(Model model, Member member) {
		
		int result = dao.insertMember(member);
		
		if(result==0) {
			model.addAttribute("message", "ID가 중복되어 가입에 실패했습니다.");
			model.addAttribute("member", member);
			return "signup";
		}
		return "redirect:/";
	}

	//로그인 컨트롤러
	@RequestMapping(value="/selectMember", method=RequestMethod.POST)
	public String selectMember(HttpSession session, Model model, Member member) {
		
		Member result = dao.selectMember(member);
		
		if(result==null) {
			model.addAttribute("message", "ID와 PW를 확인해주세요.");
			model.addAttribute("member", member);
			
			return "login";
		}

		session.setAttribute("loginId", result.getId());
		
		return "redirect:/";
	}

}
*/