package com.practice.chatting;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.practice.chatting.DAO.ChatDAO;
import com.practice.chatting.DAO.RoomDAO;
import com.practice.chatting.VO.Chat;
import com.practice.chatting.VO.Room;

@Controller
public class ChatController {

	@Autowired
	ChatDAO dao;
	
	@Autowired
	RoomDAO dao2;
	
	@RequestMapping(value = "/chat", method = RequestMethod.GET)
	public String roomList(Chat chat, HttpSession session, Model model) {
		
		//채팅 DB입력
		chat.setUserId((String)session.getAttribute("loginId"));
		dao.insertChat(chat);
		
		//룸 시퀀스 번호를 받아 룸정보 다시 모델에 전달
		Room room = dao2.selectRoomBySeq(chat.getRoomSeq());
		model.addAttribute("Room", room);

		//룰 시퀀스 번호에 맞는 채팅내용 모델에 전달
		ArrayList<Chat> result = dao.selectChat(chat.getRoomSeq());	
		if(result!=null) {
			model.addAttribute("CList", result);			
		}
		
		return "room";
	}


}
