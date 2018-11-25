package test03;

class CreditCard{
	private String name;
	private int age;
	private String address;
	private int phoneNumber;
	public CreditCard(){}
	public CreditCard(String name, int age, String address, int phoneNumber) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	public CreditCard(CreditCard card) {
		this.name = card.getName();
		this.age = card.getAge();
		this.address = card.getAddress();
		this.phoneNumber = card.getPhoneNumber();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
		return "CreditCard [name=" + name + ", age=" + age + ", address=" + address + ", phoneNumber=" + phoneNumber
				+ "]";
	}
}
public class TestConstructor3 {
	public static void main(String[] args) {
		CreditCard card = new CreditCard("김영우",25,"송파",0101234);
		System.out.println(card.toString());
		CreditCard card2 = new CreditCard();
		card2.setName("김영우");
		card2.setAge(25);
		card2.setAddress("송파");
		card2.setPhoneNumber(0101234);
		System.out.println(card2.toString());
		CreditCard card3 = new CreditCard(card2);
//		card.setAddress("분당");
//		System.out.println(card.getAddress());
	}
}
