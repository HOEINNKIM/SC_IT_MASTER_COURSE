package com.supermarket.supermarket.VO;

public class Sold {
	
	private String soldSeq;
	private String customerId;
	private String productSeq;
	private String inDate;
	private String quantity;
	
	public Sold() {}
	public Sold(String soldSeq, String customerId, String productSeq, String inDate, String quantity) {
		super();
		this.soldSeq = soldSeq;
		this.customerId = customerId;
		this.productSeq = productSeq;
		this.inDate = inDate;
		this.quantity = quantity;
	}

	public String getSoldSeq() {
		return soldSeq;
	}
	public void setSoldSeq(String soldSeq) {
		this.soldSeq = soldSeq;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getProductSeq() {
		return productSeq;
	}
	public void setProductSeq(String productSeq) {
		this.productSeq = productSeq;
	}
	public String getInDate() {
		return inDate;
	}
	public void setInDate(String inDate) {
		this.inDate = inDate;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Sold [soldSeq=" + soldSeq + ", customerId=" + customerId + ", productSeq=" + productSeq + ", inDate="
				+ inDate + ", quantity=" + quantity + "]";
	}

}