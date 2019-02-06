package com.practice.chatting.DAO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.practice.chatting.VO.User;

@Repository
public class UserDAO {

	@Autowired
	SqlSession sqlSession;
	
	public User selectUser(User user) {
		User selectedUser = null;
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);

		try {
			selectedUser = mapper.selectUser(user);		
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		return selectedUser;
	}
	
	public int insertUser(User user) {
		int result = 0;
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);

		try {
			result = mapper.insertUser(user);		
		} catch(Exception e) {
			e.printStackTrace();
			return 0;
		}

		return result;		

	}
	
	
}
