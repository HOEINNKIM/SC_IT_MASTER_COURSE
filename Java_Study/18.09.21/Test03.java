class Test03 {
	public static void main(String[] args) {
		
		int a = 0;

		for(int i = 1; i <= 29 ; i++) {
			
			if (i == 1) {
			a = 1;
			} else if (i % 2 == 0){
			a = a + 1;
			} else {
			a = a + 2;
			}

			
			if(a>30){
			break;
			}

			System.out.print(a + " ");
		}
	}
}
