class Example4 {
	public static void main(String[] args) {
		int a = 1;

		for(int i = 1; i<=50 ; i++ ){
			
			if(i==1){
			System.out.print(i);
			
			} else if(i%2 == 0){
			a = a + i;
			System.out.print("+");
			System.out.print(i);		

			} else {
			a = a - i;
			System.out.print("-");
			System.out.print(i);
			
			} 
			
			if(i==50){
			System.out.println();
			System.out.println("=" + a);
			}

		}

	}
}


//1+2-3+4-