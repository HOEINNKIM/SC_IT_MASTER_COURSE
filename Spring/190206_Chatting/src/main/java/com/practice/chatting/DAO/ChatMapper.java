package com.practice.chatting.DAO;

import java.util.ArrayList;

import com.practice.chatting.VO.Chat;

public interface ChatMapper {

	public int insertChat(Chat chat);
	
	public ArrayList<Chat> selectChat(String roomSeq);
}
