public class ArrExample3{
	public static void main(String[] args) {
		System.out.println("4의 배수이면서 5의 배수가 아닌 값 찾기");
		//문제 : 100 이하의 자연수 중에서 4의 배수이면서 5의 배수가 아닌 값을 모두 출력하시오.
		// 결과 : 4 8 12 16 20 24 28 ~~~~~~~~~~~ 96

		for(int i = 1; i <= 100; i++) {
			if(i%4 == 0 && i%5 != 0){
				System.out.print(i + " ");			
			}
		}
		
	}
}
