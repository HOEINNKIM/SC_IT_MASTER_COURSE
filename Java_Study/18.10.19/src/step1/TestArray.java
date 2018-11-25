package step1;

public class TestArray {
	/*
	 * 기본형 데이터를 담는 배열연습
	 */
	public static void main(String[] args) {
		// 1. 배열 선언
		int ages[];
		// 2. 배열선언
		ages = new int[3];
		System.out.println(ages); // 배열 주소값
		System.out.println(ages[2]); // 0 int의 기본 초기값
		// 3. 배열 요소 값 할당
		ages[0] = 20;
		ages[1] = 35;
		ages[2] = 28;
		System.out.println(ages[2]); // 28
		System.out.println(ages.length); // 배열의 길이 3
		/*
		 * System.out.println(ages[3]); java.lang.ArrayIndexOutOfBoundsException: 3
		 */
		System.out.println("*배열의 전체 출력*");
		for(int i = 0; i< ages.length; i++) {
			System.out.println("ages[" + i + "] : " + ages[i]);
		}
	}
}
