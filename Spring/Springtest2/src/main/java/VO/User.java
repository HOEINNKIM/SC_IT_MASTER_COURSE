package VO;

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
	public void setUserId(String userid) {
		this.userId = userid;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userpw) {
		this.userPw = userpw;
	}
	@Override
	public String toString() {
		return "User [userid=" + userId + ", userpw=" + userPw + "]";
	}	
}