// 2. n개의 정수를 가진 입력받아 배열을 만든다. 
//    이 배열은 양의 정수와 음의 정수를 모두 가지고 있어야한다.
//    당신은 이 배열을 특별한 방법으로 정렬해야한다. 그 방법은 아래와 같다.
//    음의 정수는 앞쪽에 양의 정수는 뒷쪽에 있어야하며, 
//    양의 정수와 음의 정수의 순서에는 변함이 없어야한다.
// 실행 화면 : 
// -1 1 3 -2 2 ans -1 -2 1 3 2
import java.util.Scanner;
public class test002Check {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("배열의 칸수 입력 : ");
		int array_length = input.nextInt();
		int[] arr = new int[array_length];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("배열[" + i + "] = ");
			arr[i] = input.nextInt();
		}
//작업 시작
	
		int forSaving = 0;

		for(int i = 0; i < arr.length; i++){
			System.out.println("--------------------------");
			System.out.println("--------------------------");

			System.out.println("i : (" + i + ")번째 for문 시작");

			for(int j = i + 1; j <arr.length; j++){
			System.out.println("--------------------------");
			System.out.println("i : (" + i + ")번째 / j : (" + j + ")번째 for문 시작");
			
				if(arr[i]>0 && arr[j]<0){

					forSaving = arr[j];

					for(int k = 0; k < j-i; k++){
				System.out.println("--------------------------");
				System.out.println("i : (" + i + ")번째 / j : (" + j + ")번째 / k : (" + k +")번째 for문 시작");					
					System.out.println("arr[" + (j-k) + "]에 " + arr[j-k] + "대신에 " + arr[j-(k+1)] + "를 넣는다");

					arr[j-k] = arr[j-(k+1)];
				System.out.println("i : (" + i + ")번째 / j : (" + j + ")번째 / k : (" + k +")번째 for문 끝");
				System.out.println("--------------------------");
				
					}

					arr[i] = forSaving;
			
				}							
				


						
			System.out.println("i : (" + i + ")번째 / j : (" + j + ")번째 for문 끝");
			System.out.println("--------------------------");
			
			}

			System.out.println("i : (" + i + ")번째 for문 끝");
			System.out.println("--------------------------");
			System.out.println("--------------------------");

		}

		for(int i =0; i<arr.length; i++){
		System.out.println(arr[i]);
		}
		
	}
}
/*
조건 4가지

i>0, j>0  냅두면됨
i>0, j<0 <=======
i<0, j>0 냅두면 되
i<0, j<0 냅두면되

j - 0 = j - 1
j - 1 = j - 2
....
j - (j-i

4 3 2 1 -1(j) -2
4 3 2 1 x -2
j = j - 1

---------
j - 1 = j - 2


---------
마이너스 바로 앞 숫자가 계속 반복됨.




-1 3 2 1 4 -2
-1 -2 2 1 4 3 

i + k 가 j의 위치로 가야한다.
i + 1 = 2 
i + 2 = 3
...
i + k = 5

k = j-i
k - 5-1 = 4

*/


/*					System.out.println("변화 전 i의 값 : " + arr[i] + ",  변화 전 j의 값 : " + arr[j]);
					forSaving = arr[j]; //음수를 변수에 저장해둔다. + 음수에 이전 변수들을 뒤로 밀어넣는다.
					arr[j] = arr[i];				
					arr[i] = forSaving;		
					System.out.println("변화 후 i의 값 : " + arr[i] + ",  변화 후 j의 값 : " + arr[j]); 
*/
