package step1;

public class Teacher extends Person {

	private String subject;
	
	public Teacher() {
		
	}
	
	public Teacher(String name, String address, String subject) {
		super(name, address);
		this.subject = subject;
	}
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public void printInfo() {
		System.out.println("이름 : " + super.getName() + 
						" / 주소 : " + super.getAddress() + 
						" / 과목 : " + getSubject());
	}	
}