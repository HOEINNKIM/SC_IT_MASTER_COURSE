import java.util.Scanner;

class ArraySum2 {
	public static void main(String[] args) {
		System.out.println("배열 값 합계 구하기.");
		
		Scanner input = new Scanner(System.in);
		System.out.print("배열의 갯수를 입력하시오 : ");
		
		int arr_length = input.nextInt();
		
		while(arr_length<2) {
			System.out.print("2 이상의 값을 입력하세요 : ");
			arr_length = input.nextInt();
			System.out.println();
		}

		//배열 생성
		int[] arr = new int[arr_length];


		//배열의 각 값을 입력
		int total = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.print("배열[" + i + "] = " );
			arr[i] = input.nextInt();
			total += arr[i];
		}
	
		//최종출력
		System.out.println(total);
	}
}
