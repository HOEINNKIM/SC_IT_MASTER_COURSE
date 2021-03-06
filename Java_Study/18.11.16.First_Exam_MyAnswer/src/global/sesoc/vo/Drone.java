package global.sesoc.vo;

import java.io.Serializable;

public class Drone extends Toy implements Serializable{
	// Code Here
	// 필요한 필드, 생성자, setter/getter, toString() overriding
	
	private int wingCount;

	public Drone(String serialNum, String name, int price, int wingCount) {
		super(serialNum, name, price);
		this.wingCount = wingCount;
	}

	public int getWingCount() {
		return wingCount;
	}

	public void setWingCount(int wingCount) {
		this.wingCount = wingCount;
	}

	
	@Override
	public String toString() {
		return "[드론]\t" +super.toString() + "날개 수= " + wingCount + "]";
	}

	
}
