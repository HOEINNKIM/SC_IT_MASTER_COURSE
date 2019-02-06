package com.practice.chatting.DAO;

import java.util.ArrayList;

import com.practice.chatting.VO.Room;

public interface RoomMapper {

	public ArrayList<Room> selectAllRoom();

	public Room selectRoom(Room room);

	public int insertRoom(Room room);
	
	public Room selectRoomBySeq(String roomSeq);
	
	public String selectSeq(String roomSeq);
}
