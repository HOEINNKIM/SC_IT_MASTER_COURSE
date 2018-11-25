package broker.vo;

import java.io.Serializable;

public class BuyingAndSelling extends RealEstate implements Serializable{
	private int price;

	public BuyingAndSelling() {
	}

	public BuyingAndSelling(String address, String houseType, int size, int price) {
		super(address, houseType, size);
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return super.getInfo() + ", 매매 가격 : " + price;
	}
	
}
