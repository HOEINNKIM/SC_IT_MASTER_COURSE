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
			model.addAttribute("warning", "에러가 발생했습니다. 콘솔을 확인하세요.");
			return "signIn";
		} else if (memList.size() != 0) {
			model.addAttribute("member", member);
			model.addAttribute("warning", "이미 등록된 id입니다.");
			return "signIn";
		} else {
			dao.insertMember(member);
			model.addAttribute("congrats", "회원가입에 성공하였습니다.");
			return "home";
		}
	}

	@RequestMapping(value = "/loginCheck", method = RequestMethod.POST)
	public String login(Member member, Model model, HttpSession session) {

		Member memberX = null;
		memberX = dao.loginCheck(member);
		
		if (memberX == null) {
			model.addAttribute("warning", "에러가 발생했습니다. 콘솔을 확인하세요.");
			return "home";
		} else {
			session.setAttribute("member", memberX);
			return "success";
		}
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		
		//첫번째 session 비우기
		//아이디 정보를 지울 때 세션을 비울 때 유용
		session.invalidate();
		
		//두번째 session 비우기
		//로그인 정보와 무관한 다른 데이터가 세션에 저장될 경우에는 해당 로그인과 관련된 객체만 비우기
		//session.setAttribute("loginId", null);
		return "home";
	}

}