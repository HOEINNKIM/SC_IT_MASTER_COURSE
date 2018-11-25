package step3;

public class TestArray3 {
/*
	참조형 데이터를 담는 배열 연습
*/	
	public static void main(String[] args) {
		//1. 배열 선언
		Car cars[];
		//2. 배열 생성
		cars = new Car[3];
		System.out.println(cars[0]); //기본 초기값 null
		// String str;
		//3. 할당
		cars[0] = new Car("K5", 2000);
		cars[1] = new Car("K7", 3000);
		cars[2] = new Car("K3", 1000);
		System.out.println(cars[0]);
		//마지막 배열 요소의 가격을 출력
		System.out.println(cars[2].getPrice()); // 1000
		System.out.println(cars[cars.length - 1].getPrice()); //위와 동일한 동작
		// 배열 안에 들어있는 자동차 객체의 모델명을 모두 출력해보세요.
		
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i].getModel());
		}
		//배열요소의 자동차 가격평균
		int sum1 =0;
		for(int i=0; i<cars.length; i++) {
			sum1 += cars[i].getPrice();
		}
		
		double avg1 = (double)sum1/cars.length;
		System.out.println(avg1);

		//배열의 선언 생성 할당을 동시에
		Car[] parkingSpace = {
				new Car("소울", 2000),
				new Car("BMW", 4500),
				new Car("캠리", 3100),
				new Car("아반테", 1800)				
		};
		//차 가격이 3000 이상인 자동차의 모델명만 출력
		for(int i=0; i<cars.length; i++) {
			if(parkingSpace[i].getPrice() >= 3000) {
				System.out.println(parkingSpace[i].getModel());
			}
		}				
	}

}
