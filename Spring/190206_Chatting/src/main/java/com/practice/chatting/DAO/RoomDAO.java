package com.practice.chatting.DAO;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.practice.chatting.VO.Room;
import com.practice.chatting.VO.User;

@Repository
public class RoomDAO {

	@Autowired
	SqlSession sqlSession;
	
	public ArrayList<Room> selectAllRoom() {
		ArrayList<Room> result = null;
		RoomMapper mapper = sqlSession.getMapper(RoomMapper.class);

		try {
			result = mapper.selectAllRoom();		
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		return result;
	}
	
	public Room selectRoom(Room room) {
		Room result = null;
		RoomMapper mapper = sqlSession.getMapper(RoomMapper.class);

		try {
			result = mapper.selectRoom(room);		
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		return result;
	}
	
	public int insertRoom(Room room) {
		int result = 0;
		RoomMapper mapper = sqlSession.getMapper(RoomMapper.class);

		try {
			result = mapper.insertRoom(room);		
		} catch(Exception e) {
			e.printStackTrace();
			return 0;
		}

		return result;		

	}
	
	public Room selectRoomBySeq(String roomSeq) {
		Room result = null;
		RoomMapper mapper = sqlSession.getMapper(RoomMapper.class);

		try {
			result = mapper.selectRoomBySeq(roomSeq);		
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		return result;
		
	}
	
	public String selectSeq(String userId) {
		String result = null;
		RoomMapper mapper = sqlSession.getMapper(RoomMapper.class);

		try {
			result = mapper.selectSeq(userId);		
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		return result;
		
		
		
	}
}
