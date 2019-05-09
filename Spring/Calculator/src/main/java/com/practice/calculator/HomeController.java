package com.practice.calculator;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.practice.calculator.DAO.OwnerDAO;
import com.practice.calculator.VO.AccountOwner;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	OwnerDAO dao;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "home";
	}
	
	@RequestMapping(value = "/moveSignIn", method = RequestMethod.GET)
	public String moveSignIn() {
		
		
		return "signIn";
	}
	
	@RequestMapping(value = "/signIn", method = RequestMethod.POST)
	public String signIn(AccountOwner owner, Model model) {
		
		int result = dao.insertOwner(owner);
		
		if(result == 0) {
			model.addAttribute("Warning", "아이디가 이미 존재합니다. 다시 입력");
			model.addAttribute("Owner", owner);
			return "signIn";
		} else {
			model.addAttribute("Success", "회원가입에 성공하였습니다.");
			return "home";
		}		
		
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(AccountOwner owner, HttpSession session, Model model) {
		
		AccountOwner result = dao.selectOwner(owner);
		
		if(result == null) {
			model.addAttribute("Warning", "아이디와 비밀번호를 확인하세요.");
			model.addAttribute("Owner", owner);
			return "home";		
		} else {
			session.setAttribute("loginId", owner.getId());
			return "board";
		}
		
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test(String dating) {
		
		System.out.println(dating);
		
		return "redirect:/boardList";
	}
	
}
