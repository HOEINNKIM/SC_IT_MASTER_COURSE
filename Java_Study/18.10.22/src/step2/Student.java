package step2;

public class Student extends Person {
	
	private String stuId;

	public Student(String name, String tel, String stuId) {
		super(name, tel);
		this.stuId = stuId;
	}

	public String getStuId() {
		return stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	
	@Override
	public String getInfo() {
		return super.getInfo() + " stuId : " + stuId;
	}


	
}