import java.util.Scanner;

class Test02 {
	public static void main(String[] args) {
	
	int count = 0;

	Scanner input = new Scanner(System.in);
	
		for(int i=1; i <= 10; i++){
			System.out.print("���� �Է� : ");
			int a = input.nextInt();
	
			if(a % 3 == 0) {
			count++;
			}
			
			System.out.println();
		}

	System.out.println("3�� ��� ���� : " + count + "��");
	}
}
