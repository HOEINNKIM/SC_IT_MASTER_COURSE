public class Test_181001_01 {
	public static void main(String[] args) {
	System.out.println("배열 원소의 값을 증가시키기");
	//문제 : int형 원소 10개짜리 배열을 생성하고 각 원소의 값을 초기화한 후,
	//반복문을 이용하여 각 원소의 값을 1씩 증가시킨다.
	//실행결과:
	//초기값 : 9 7 6 5 4 0 1 3 2
	//변경후 : 10 8 7 5 6 5 1 2 4 3 

		int[] Arr = {9, 7, 6, 4, 5, 4, 0, 1, 3, 2};
	

			System.out.print("초기값 : ");
		for(int i=0;i<Arr.length;i++){
			System.out.print(Arr[i] + (i < Arr.length - 1 ? " " : "\n"));		

			/*
			if(i < ar.length -1){
				System.out.print(" ");
			} else{
				System.out.print("\n");
			}
			*/
		}
			
			System.out.print("변경후 : ");

		for(int i=0;i<Arr.length;i++){
			//Arr[i] += 1;
			System.out.print(++Arr[i] + " ");	
		}

	
	
	}
}
