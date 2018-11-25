package step9;

public class Manager extends Employee {

	private String dept;

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String getDetails() {
//		return "사원명 : " + getName() + " 나이 : " + getAge() + " " + dept;
		return super.getDetails() + " 부서 : " + dept;
	}
	
}