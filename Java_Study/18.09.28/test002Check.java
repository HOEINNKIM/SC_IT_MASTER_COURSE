// 2. n���� ������ ���� �Է¹޾� �迭�� �����. 
//    �� �迭�� ���� ������ ���� ������ ��� ������ �־���Ѵ�.
//    ����� �� �迭�� Ư���� ������� �����ؾ��Ѵ�. �� ����� �Ʒ��� ����.
//    ���� ������ ���ʿ� ���� ������ ���ʿ� �־���ϸ�, 
//    ���� ������ ���� ������ �������� ������ ������Ѵ�.
// ���� ȭ�� : 
// -1 1 3 -2 2 ans -1 -2 1 3 2
import java.util.Scanner;
public class test002Check {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�迭�� ĭ�� �Է� : ");
		int array_length = input.nextInt();
		int[] arr = new int[array_length];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("�迭[" + i + "] = ");
			arr[i] = input.nextInt();
		}
//�۾� ����
	
		int forSaving = 0;

		for(int i = 0; i < arr.length; i++){
			System.out.println("--------------------------");
			System.out.println("--------------------------");

			System.out.println("i : (" + i + ")��° for�� ����");

			for(int j = i + 1; j <arr.length; j++){
			System.out.println("--------------------------");
			System.out.println("i : (" + i + ")��° / j : (" + j + ")��° for�� ����");
			
				if(arr[i]>0 && arr[j]<0){

					forSaving = arr[j];

					for(int k = 0; k < j-i; k++){
				System.out.println("--------------------------");
				System.out.println("i : (" + i + ")��° / j : (" + j + ")��° / k : (" + k +")��° for�� ����");					
					System.out.println("arr[" + (j-k) + "]�� " + arr[j-k] + "��ſ� " + arr[j-(k+1)] + "�� �ִ´�");

					arr[j-k] = arr[j-(k+1)];
				System.out.println("i : (" + i + ")��° / j : (" + j + ")��° / k : (" + k +")��° for�� ��");
				System.out.println("--------------------------");
				
					}

					arr[i] = forSaving;
			
				}							
				


						
			System.out.println("i : (" + i + ")��° / j : (" + j + ")��° for�� ��");
			System.out.println("--------------------------");
			
			}

			System.out.println("i : (" + i + ")��° for�� ��");
			System.out.println("--------------------------");
			System.out.println("--------------------------");

		}

		for(int i =0; i<arr.length; i++){
		System.out.println(arr[i]);
		}
		
	}
}
/*
���� 4����

i>0, j>0  ���θ��
i>0, j<0 <=======
i<0, j>0 ���θ� ��
i<0, j<0 ���θ��

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
���̳ʽ� �ٷ� �� ���ڰ� ��� �ݺ���.




-1 3 2 1 4 -2
-1 -2 2 1 4 3 

i + k �� j�� ��ġ�� �����Ѵ�.
i + 1 = 2 
i + 2 = 3
...
i + k = 5

k = j-i
k - 5-1 = 4

*/


/*					System.out.println("��ȭ �� i�� �� : " + arr[i] + ",  ��ȭ �� j�� �� : " + arr[j]);
					forSaving = arr[j]; //������ ������ �����صд�. + ������ ���� �������� �ڷ� �о�ִ´�.
					arr[j] = arr[i];				
					arr[i] = forSaving;		
					System.out.println("��ȭ �� i�� �� : " + arr[i] + ",  ��ȭ �� j�� �� : " + arr[j]); 
*/
