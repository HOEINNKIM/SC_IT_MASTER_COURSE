package step2;

public class Teacher extends Person {

	private String subject;

	

	public Teacher(String name, String tel2, String subject) {
		super(name, tel2);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Override
	public String getInfo() {
		return super.getInfo() + " subject : " + subject;
	}
	
}