package com.supermarket.supermarket.VO;

public class Product {

	private String productSeq;
	private String name;
	private String quantity;
	private String price;
	private String comments;
	private String inDate;

	public Product() {}
	public Product(String productSeq, String name, String quantity, String price, String comments, String inDate) {
		super();
		this.productSeq = productSeq;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.comments = comments;
		this.inDate = inDate;
	}
	public String getProductSeq() {
		return productSeq;
	}
	public void setProductSeq(String productSeq) {
		this.productSeq = productSeq;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getInDate() {
		return inDate;
	}
	public void setInDate(String inDate) {
		this.inDate = inDate;
	}
	@Override
	public String toString() {
		return "Product [productSeq=" + productSeq + ", name=" + name + ", quantity=" + quantity + ", price=" + price
				+ ", comments=" + comments + ", inDate=" + inDate + "]";
	}	
	
	
}