public class Example06 {
	public static void main(String[] args) {


		System.out.println();
		System.out.println("문제 1 : ");
		System.out.println();

		//문제1
		for(int i=0 ; i<5; i ++){

	 		for(int j=1; j<=5; j++){
				System.out.print(j + i);
			}
		
			System.out.println();
		}

		//문제2

		System.out.println();
		System.out.println("문제 2 : ");
		System.out.println();
		

		for(int i=0; i<5; i++) {
			for(int j=0;j<=i;j++){
			System.out.print(j);			
			}

			System.out.println();
		}

		//문제3 - 틀린점

		System.out.println();
		System.out.println("문제 3 틀린 코딩 : ");
		System.out.println();
		
		for(int i = 5; i>=1; i--){
		
			for(int j=1; j<=i; j++){
				System.out.print(j);
			}
			
			System.out.println();
		}


		//문제3 - 정답
		System.out.println();
		System.out.println("문제 3 강사님정답 : ");
		System.out.println();

		for(int i=1 ; i<6; i ++){

			for(int j=i; j<6; j++){
				System.out.print(j);
			}
		
			System.out.println();
		}


		//문제1 - 강사님 정답
		System.out.println();
		System.out.println("문제 1 강사님정답 : ");
		System.out.println();
		
		
		for(int i=1 ; i<6; i ++){

			for(int j=i; j<i + 5; j++){
				System.out.print(j);
			}
		
			System.out.println();
		}

		//문제4 

		System.out.println();
		System.out.println("문제 4 : ");
		System.out.println();

		for(int i = 1; i<=5; i++){
			for(int j = 1; j<=5; j++){
			
				if(j == i){
					System.out.print(j + " ");
				} else {
			System.out.print("0" + " ");
				}
			}
			System.out.println();
		}


	

	}
}
