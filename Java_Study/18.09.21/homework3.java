import java.util.Scanner;


class homework3 {
	public static void main(String[] args) {
		
		int count = 0;
			for(int i = 1; i<=10; i++){
				Scanner input = new Scanner(System.in);
				System.out.print("���� �Է� : ");
				int a = input.nextInt();
				count += a;
			}
			System.out.println();
			System.out.println("�հ� : " + count);			
	}
}
