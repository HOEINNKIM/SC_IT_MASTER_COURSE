public class ArrExample3{
	public static void main(String[] args) {
		System.out.println("4�� ����̸鼭 5�� ����� �ƴ� �� ã��");
		//���� : 100 ������ �ڿ��� �߿��� 4�� ����̸鼭 5�� ����� �ƴ� ���� ��� ����Ͻÿ�.
		// ��� : 4 8 12 16 20 24 28 ~~~~~~~~~~~ 96

		for(int i = 1; i <= 100; i++) {
			if(i%4 == 0 && i%5 != 0){
				System.out.print(i + " ");			
			}
		}
		
	}
}
