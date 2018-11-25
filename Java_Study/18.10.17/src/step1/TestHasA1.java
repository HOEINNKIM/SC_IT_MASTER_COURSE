package step1;

public class TestHasA1 {	
	public static void main(String[] args) {
		Car car = new Car("K5", "blue");
		System.out.println(car.getModel() + " " + car.getColor()); //K5 blue
		car.setModel("SM5");
		car.setColor("black");
		System.out.println(car.getModel() + " " + car.getColor()); //SM5 black
		
		Car c = new Car("소울", "빨강");
		Person p = new Person("아이유", c);
		System.out.println(p.getName() + " " + p.getCar().getModel() + " " + p.getCar().getColor()); //아이유 소울 빨강
	}
}
//왜 매서드랑 변수를 정의하는 클래스는 앞에 접근지정자를 정의할 수 없는가?