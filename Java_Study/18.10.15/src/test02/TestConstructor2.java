package test02;

class CreditCard{
	private String address;
	public int age;
	private String name;
	public int phoneNumber;
	
	CreditCard(String a){
		address = a;
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "CreditCard [address=" + address + ", age=" + age + ", name=" + name + ", phoneNumber=" + phoneNumber
				+ "]";
	}
	
	
	
}

public class TestConstructor2 {

	public static void main(String[] args) {
		CreditCard card = new CreditCard("송파");
		System.out.println(card.getAddress());
		CreditCard card2 = new CreditCard("목2동");		
		card2.setAddress("목동");
		card2.setAge(27);
		card2.setName("김회인");
		card2.setPhoneNumber(1064185242);
		System.out.println(card2.toString());
		
	}
}