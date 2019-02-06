package com.practice.chatting.DAO;

import com.practice.chatting.VO.User;

public interface UserMapper {

	public User selectUser(User user);
	
	public int insertUser(User user);
}
