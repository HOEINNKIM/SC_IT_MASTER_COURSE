package com.practice.chatting;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.practice.chatting.DAO.UserDAO;
import com.practice.chatting.VO.User;

@Controller
public class UserController {

	@Autowired
	UserDAO dao;
	
	@RequestMapping(value = "/enrollment", method = RequestMethod.GET)
	public String enrollment(User user, Model model) {
		User result = dao.selectUser(user);
		if(result==null) {
			dao.insertUser(user);
			model.addAttribute("Success", "회원가입에 성공했습니다!");
			
			return "home";
		} else {
			model.addAttribute("User", user);
			model.addAttribute("Warning", "이미 등록된 아이디입니다.");
			return "signUp";
		}
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(User user, HttpSession session, Model model) {
		User result = dao.selectUser(user);
		if(result!=null) {
			session.setAttribute("loginId", user.getUserId());
			return "redirect:/roomList";
		} else {
			model.addAttribute("Warning", "아이디나 비밀번호를 확인해주세요.");
			model.addAttribute("User", user);
			return "home";
		}
		
	}
}