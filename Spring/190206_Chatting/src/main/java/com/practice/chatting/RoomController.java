package com.practice.chatting;

import java.util.ArrayList;

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
public class RoomController {

	@Autowired
	RoomDAO dao;
	
	@Autowired
	ChatDAO dao2;
	
	@RequestMapping(value = "/roomList", method = RequestMethod.GET)
	public String roomList(Model model) {
		ArrayList<Room> result = dao.selectAllRoom();
		model.addAttribute("RList", result);
		return "roomList";
	}

	@RequestMapping(value = "/makeRoom", method = RequestMethod.GET)
	public String makeRoom() {
		return "write";
	}

	@RequestMapping(value = "/writeRoom", method = RequestMethod.GET)
	public String writeRoom(Room room, Model model) {

		//DB에 채팅방 등록
		dao.insertRoom(room);
		
		//등록한 아이디에 해당하는 가장 최신의 roomSeq 찾기
		String roomSeq = dao.selectSeq(room.getUserId());
		
		//찾은 roomSeq로 Room 정보 찾고, 모델에 등록
		Room result = dao.selectRoomBySeq(roomSeq);
		System.out.println(result);
		model.addAttribute("Room", result);
				
		return "room";
	}

	@RequestMapping(value = "/joinRoom", method = RequestMethod.GET)
	public String joinRoom(Room room, Model model) {
		
		Room result = dao.selectRoomBySeq(room.getRoomSeq());
		model.addAttribute("Room", result);
		
		ArrayList<Chat> chatList = dao2.selectChat(room.getRoomSeq());
		model.addAttribute("CList", chatList);
		
		return "room";
	}
	
	@RequestMapping(value = "/back", method = RequestMethod.GET)
	public String back() {
		return "redirect:/roomList";
	}
}