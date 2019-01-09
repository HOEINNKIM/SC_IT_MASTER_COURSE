package com.myApp.calcTest;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {

	static ArrayList<String> userList= new ArrayList<String>();	
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		System.out.println("!!!");
		return "login";
	}

	@RequestMapping(value = "/userLogin", method = RequestMethod.GET)
	public String login(String username, String pass, HttpSession session, Model model) {

		
		for(String user: userList) {
			if(user.equals(username)) {
				model.addAttribute("warning", "이미 로그인된 아이디입니다.");
				return "login";
			}
		}		
		
		model.addAttribute("messageList", MessageController.messageList);
		System.out.println("리스트에 조회해보니 없음");
		userList.add(username);
		session.setAttribute("username", username);
		
		return "message";
	}
}