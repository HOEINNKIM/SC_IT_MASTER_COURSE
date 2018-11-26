
public class Member {
	private String id;		//Member2의 첫번째 Column : id, varchar2
	private String name;	//Member2의 두번째 Column : name, varchar2
	private String password;//Member2의 세번째 Column : password, varchar2
	
	
	
	public Member(String id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
