public class Example4 {
	public static void main(String[] args) {
		System.out.println("Unicode 출력하기");
		//문제 : 유니코드 41- 122번까지의 코드와 문자를 한 줄에 8개씩 출력한다.
		// hint : char형은 정수형이다. 예를들어 문자 A는 유니코드값인 65로 저장된다.
		//실행결과 : 
		//41:)

	for(int i = 41; i<123; i++){
		char A = (char)i;
		System.out.print(i + ":" + A + "\t");
			if(i%8==0){
			System.out.println();			
			}
	}


		
	}
}
