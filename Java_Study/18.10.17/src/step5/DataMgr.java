package step5;

import step1.Car;

public class DataMgr {
	
	
	public void passTestRef(Car car) {
		car = new Car("SM5", "BLACK");
	}

	public void passTestValue(Car car) {
		car.setModel("QM5");
	}



}
