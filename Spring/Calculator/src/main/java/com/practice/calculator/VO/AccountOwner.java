package com.practice.calculator.VO;

public class AccountOwner {

	private String id;
	private String pw;

	public AccountOwner() {}

	public AccountOwner(String id, String pw) {
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	@Override
	public String toString() {
		return "AccountOwner [id=" + id + ", pw=" + pw + "]";
	}
	
	
	
	
}
