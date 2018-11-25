class ExtraExample6 {
	public static void main(String[] args) {

		
		String x = "¡Ù";
		String y = "¡Ú";


		for(int i = 10; i >= 1; i--) {
		System.out.print("          ");

			for(int j = 1; j < i; j++) {
			
			System.out.print(" ");			
			}
						
			for(int k = 10; k >= i; k--) {
			System.out.print(x);

			}
			
			for(int l = 1; l < i ; l++) {
			System.out.print(" ");
			}
		
		System.out.println();
		}		




		for(int i = 10; i > 1; i--) {

					for(int j = 1; j < i; j++) {
					System.out.print(" ");			
					}
								
					for(int k = 10; k >= i; k--) {
					System.out.print(x);
					}
					
					for(int m = 1; m < i; m++) {
					System.out.print(y);
					}

					for(int n = 10; n >= i; n--) {
					System.out.print(x);
					}


					for(int l = 1; l < i ; l++) {
					System.out.print(" ");
					}
				
			System.out.println();
		}
	


	
	}

}