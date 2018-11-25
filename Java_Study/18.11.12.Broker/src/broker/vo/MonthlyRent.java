package broker.vo;

import java.io.Serializable;

public class MonthlyRent extends RealEstate implements Serializable{

	private int monthlyRent;

	public MonthlyRent() {
	}
	
	
	public MonthlyRent(String address, String houseType, int size, int monthlyRent) {
		super(address, houseType, size);
		this.monthlyRent = monthlyRent;
	}


	public int getMontylrRent() {
		return monthlyRent;
	}

	public void setMontylrRent(int montylrRent) {
		this.monthlyRent = montylrRent;
	}
	
	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return super.getInfo() + ", 월 임대료 : " + monthlyRent;
	}
	
	
	
}
