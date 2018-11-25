package step1;

public class Manager extends Employee {
	private String dept;

	public Manager(String empId, String eName, int salary, String dept) {
		super(empId, eName, salary);
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	@Override
	public String getDetails() {
		return super.getDetails() + " 부서 : " + dept;
	}
		
}
