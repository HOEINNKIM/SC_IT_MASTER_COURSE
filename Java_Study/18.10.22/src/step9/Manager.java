package step9;

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
	public String toString() {
		return "Engineer [dept=" + dept + "getEmpId()" + getEmpId() + "geteName()" + geteName() +  "getSalary()" + getSalary() + "]" + "Manager [dept=" + dept + "]";
	}
	

		
}
