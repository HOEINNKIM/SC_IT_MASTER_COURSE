package step1;

public class Student extends Person{

	private String stdId;

	public Student() {};
	public Student(String name, String address, String stdId) {
		super(name, address);
		this.stdId = stdId;
	}

	public String getStdId() {
		return stdId;
	}

	public void setStdId(String stdId) {
		this.stdId = stdId;
	}

	@Override
	public void printInfo() {
		System.out.println("이름 : " + super.getName() + 
				" / 주소 : " + super.getAddress() + 
				" / 학번 : " + getStdId());
	}
}
