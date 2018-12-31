package com.mycom.test2;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import VO.User;

@Controller
public class MemberController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		System.out.println("!!!");
		return "login";
	}

	@RequestMapping(value = "/userLogin", method = RequestMethod.GET)
	public String login(String userid, String userpw, User user) {
		System.out.println(userid + "    " + userpw + "   " + user);
		return "redirect:/login";
	}

}
