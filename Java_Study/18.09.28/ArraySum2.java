import java.util.Scanner;

class ArraySum2 {
	public static void main(String[] args) {
		System.out.println("�迭 �� �հ� ���ϱ�.");
		
		Scanner input = new Scanner(System.in);
		System.out.print("�迭�� ������ �Է��Ͻÿ� : ");
		
		int arr_length = input.nextInt();
		
		while(arr_length<2) {
			System.out.print("2 �̻��� ���� �Է��ϼ��� : ");
			arr_length = input.nextInt();
			System.out.println();
		}

		//�迭 ����
		int[] arr = new int[arr_length];


		//�迭�� �� ���� �Է�
		int total = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.print("�迭[" + i + "] = " );
			arr[i] = input.nextInt();
			total += arr[i];
		}
	
		//�������
		System.out.println(total);
	}
}
