package com.supermarket.supermarket.VO;

public class Customer {
	private String customerId;
	private String customerPw;
	private String name;
	private String phone;	
	private String birthDate;
	private String address;
	private String inDate;
	
	public Customer() {}
	public Customer(String customerId, String customerPw, String name, String phone, String birthDate, String address,
			String inDate) {
		this.customerId = customerId;
		this.customerPw = customerPw;
		this.name = name;
		this.phone = phone;
		this.birthDate = birthDate;
		this.address = address;
		this.inDate = inDate;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerPw() {
		return customerPw;
	}
	public void setCustomerPw(String customerPw) {
		this.customerPw = customerPw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getInDate() {
		return inDate;
	}
	public void setInDate(String inDate) {
		this.inDate = inDate;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerPw=" + customerPw + ", name=" + name + ", phone="
				+ phone + ", birthDate=" + birthDate + ", address=" + address + ", inDate=" + inDate + "]";
	}
	
}