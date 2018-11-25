package step2;

public class TestArray {
	public static void main(String[] args) {
		// 배열 선언과 생성을 동시에 처리
		int ages[] = new int[5];
		ages[0] = 11;
		ages[1] = 22;
		ages[2] = 33;
		ages[3] = 44;
		ages[4] = 55;
		// 현재 ages의 배열 모든 요소의 총합을 구하세요.

		int count = 0;
		for (int i = 0; i < ages.length; i++) {
			count += ages[i];
		}
		
		System.out.println(count);
		// 배열 선언과 생성, 할당을 동시에
		int [] money = {100, 200, 300, 400, 500, 600};
		// money의 평균값을 출력해 볼것
		
		int sum = 0;
		double avg = 0;
		for(int i=0; i < money.length; i++) {
			sum += money[i];			
		}
		
		avg = (double)sum/money.length;
		System.out.println(avg);
	}
}
