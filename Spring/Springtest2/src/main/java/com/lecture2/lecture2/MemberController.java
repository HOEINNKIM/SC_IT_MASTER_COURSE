package com.lecture2.lecture2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import VO.User;

@Controller
public class MemberController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public void login() {
		System.out.println("�̰����� ������ ����");
	}

	
	@RequestMapping(value = "/login2", method = RequestMethod.GET)
	public String login2(String userId, String userPw, User user) {
		System.out.println(userId);
		System.out.println(userPw);
		System.out.println(user.getUserId());
		System.out.println(user.getUserPw());		
		return "redirect:login";
	}
}
