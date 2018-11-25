package step1;

public class Engineer extends Employee {

	private String skill;
	

	public Engineer(String empId, String eName, int salary, String skill) {
		super(empId, eName, salary);
		this.skill = skill;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	
	public String getDetails() {
		return super.getDetails() + " skill : " + skill;
	}
}
