package com.practice.chatting.VO;

public class Room {

	private String roomSeq;
	private String userId;
	private String name;
	private String inDate;
	public Room() {}
	public Room(String roomSeq, String userId, String name, String inDate) {
		this.roomSeq = roomSeq;
		this.userId = userId;
		this.name = name;
		this.inDate = inDate;
	}
	public String getRoomSeq() {
		return roomSeq;
	}
	public void setRoomSeq(String roomSeq) {
		this.roomSeq = roomSeq;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInDate() {
		return inDate;
	}
	public void setInDate(String inDate) {
		this.inDate = inDate;
	}
	@Override
	public String toString() {
		return "Room [roomSeq=" + roomSeq + ", userId=" + userId + ", name=" + name + ", inDate=" + inDate + "]";
	}	
}