package global.sesoc.vo;

import java.io.Serializable;

public class GameConsole extends Toy implements Serializable {
	// Code Here
	// 필요한 필드, 생성자, setter/getter, toString() overriding
	
	private boolean isPortable;

	public GameConsole(String serialNum, String name, int price, boolean isPortable) {
		super(serialNum, name, price);
		this.isPortable = isPortable;
	}

	public boolean isPortable() {
		return isPortable;
	}

	public void setPortable(boolean isPortable) {
		this.isPortable = isPortable;
	}

	@Override
	public String toString() {
		if(isPortable) {
			return "[게임콘솔]\t" + super.toString() + "휴대용= Y]";			
		} else {
			return "[게임콘솔]\t" + super.toString() + "휴대용= N]";			
			
		}
	}
	
	
}
