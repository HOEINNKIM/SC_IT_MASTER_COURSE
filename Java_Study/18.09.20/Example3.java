class Example3 {
	public static void main(String[] args) {
	
		String a = " a";
		String b = " b";
		String c = " c";

		for(int i = 1; i<=50; i++){
			System.out.print(i);
			
			if(i%3==0){
			System.out.print(a);
			}

			if(i%5==0){
			System.out.print(b);
			}

			if(i%7==0){
			System.out.print(c);
			}

			System.out.println();
		}
	}
}



/*

a는 3의 배수에 넣기
b는 5의 배수에 넣기
c는 7의 배수에 넣기
*/