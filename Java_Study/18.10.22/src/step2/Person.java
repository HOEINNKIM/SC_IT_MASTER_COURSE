package step2;

public class Person {

	private String name;
	private String tel;

	public Person(String name, String tel2) {
		super();
		this.name = name;
		this.tel = tel2;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getInfo() {
		return "Person [name=" + name + ", tel=" + tel + "]";
	}
	
	
	
	
}
