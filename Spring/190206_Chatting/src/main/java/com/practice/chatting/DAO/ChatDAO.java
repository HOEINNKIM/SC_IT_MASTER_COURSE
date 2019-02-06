package com.practice.chatting.DAO;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.practice.chatting.VO.Chat;
import com.practice.chatting.VO.Room;
import com.practice.chatting.VO.User;

@Repository
public class ChatDAO {

	@Autowired
	SqlSession sqlSession;
	

	public int insertChat(Chat chat) {
		int result = 0;
		ChatMapper mapper = sqlSession.getMapper(ChatMapper.class);
		
		try {
			result = mapper.insertChat(chat);			
		} catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
		
		return result;
		
	}
	
	public ArrayList<Chat> selectChat(String roomSeq){
		ArrayList<Chat> result = null;
		ChatMapper mapper = sqlSession.getMapper(ChatMapper.class);
		
		try {
			result = mapper.selectChat(roomSeq);			
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
		return result;

	}
	
}