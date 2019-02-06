package com.practice.chatting.VO;

public class Chat {

	private String chatSeq;
	private String roomSeq;
	private String userId;
	private String message;
	private String inDate;
	public Chat() {}
	public Chat(String chatSeq, String roomSeq, String userId, String message, String inDate) {
		this.chatSeq = chatSeq;
		this.roomSeq = roomSeq;
		this.userId = userId;
		this.message = message;
		this.inDate = inDate;
	}
	public String getChatSeq() {
		return chatSeq;
	}
	public void setChatSeq(String chatSeq) {
		this.chatSeq = chatSeq;
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
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getInDate() {
		return inDate;
	}
	public void setInDate(String inDate) {
		this.inDate = inDate;
	}
	@Override
	public String toString() {
		return "Chat [chatSeq=" + chatSeq + ", roomSeq=" + roomSeq + ", userId=" + userId + ", message=" + message
				+ ", inDate=" + inDate + "]";
	}
}