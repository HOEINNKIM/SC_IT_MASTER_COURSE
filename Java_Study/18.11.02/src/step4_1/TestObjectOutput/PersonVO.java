package step4_1.TestObjectOutput;

import java.io.Serializable;

public class PersonVO implements Serializable {
	
	
	private String name;
	private transient String password; //transient 吏곷젹????곸뿉???쒖쇅
	public PersonVO(String name, String password) {
		super();
		this.name = name;
		this.password = password;
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
	@Override
	public String toString() {
		return "PersonVO [name=" + name + ", getName()=" + getName() + ", getPassword()=" + getPassword()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	
	
}
