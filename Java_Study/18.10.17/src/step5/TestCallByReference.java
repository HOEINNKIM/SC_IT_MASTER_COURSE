package step5;
import step1.Car;

public class TestCallByReference {

	public static void main(String[] args) {
		DataMgr mgr = new DataMgr();
		Car car = new Car("K5", "WHITE");
		System.out.println(car.model);
		mgr.passTestRef(car);
		System.out.println(car.model);
		mgr.passTestRef(car);
		System.out.println(car.model);		
		System.out.println(car.getModel()); //K5
		mgr.passTestValue(car);
		System.out.println(car.getModel());
		System.out.println(car.model);
	}

}
