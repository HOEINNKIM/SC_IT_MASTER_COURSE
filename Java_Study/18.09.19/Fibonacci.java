class Fibonacci {
	public static void main(String[] args) {

	/*피보나치 = 맨 앞의 두 수는 1, 
	그 다음 열부터는 앞의 두 항의 합의 수가 배열되는 수열 
	*/

	int a = 1; // 첫번째 열
	int b = 1; // 두번째 열이면서 피보나치에 더할 앞 수
	int c = 0; // 세번째 열이면서 피보나치에 더할 뒷 수
	
	System.out.print(a + "  ");
	System.out.print(b + "  ");

	
		for(int i = 1; ; i++){
			if(a + b <= 100){
		c = a + b;
		System.out.println(c + "  ");
		a = b;
		b = c;
			}
		}



	}
}
