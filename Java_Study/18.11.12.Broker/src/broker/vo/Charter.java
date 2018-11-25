package broker.vo;

import java.io.Serializable;

public class Charter extends RealEstate implements Serializable{
	private int depositMoney;

	public Charter() {
		
	}
	
	public Charter(String address, String houseType, int size, int depositMoney) {
		super(address, houseType, size);
		this.depositMoney = depositMoney;
	}

	public void setDepositMoney(int depositMoney) {
		this.depositMoney = depositMoney;
	}
	
	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return super.getInfo() + ", 임대 보증금 : " + depositMoney;
	}
	
	
	
}
