package step1;

public class MemberVO {

	private String id;
	private String password;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	// Constructor 생성자 : 클래스 이름과 동일, 리턴이 x	
	MemberVO(String id, String password) {
		this.id = id;
		this.password = password;		
	}
	public MemberVO() {
		//기존 생성자를 다시 생성해 주어야함.
	}
}
