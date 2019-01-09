package com.myApp.calcTest;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import VO.Message;

@Controller
public class MessageController {

	//�ƹ��� ��Ʈ�ѷ��� �������� �����Ǿ �����ϴ� ����Ʈ�� �ϳ�!
	static ArrayList<Message> messageList= new ArrayList<Message>();	
	
	@RequestMapping(value="/goMessage", method = RequestMethod.GET)
	public String goMessage() {
		return "message";
	}
	
	@RequestMapping(value="/sendMessage", method = RequestMethod.POST)
	public String sendMessage(Message message, Model model) {
		messageList.add(message);
		
		model.addAttribute("messageList", messageList);		

		return "message";
		
	}
}