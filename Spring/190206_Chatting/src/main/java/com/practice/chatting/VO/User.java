package com.practice.chatting.VO;

public class User {

	private String userId;
	private String userPw;
	public User() {}
	public User(String userId, String userPw) {
		this.userId = userId;
		this.userPw = userPw;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userPw=" + userPw + "]";
	}	
}