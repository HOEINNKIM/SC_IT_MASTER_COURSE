import java.util.Scanner;

class Test01 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Java ���� : ");
		int a = input.nextInt();
		
		System.out.print("Oracle ���� : ");
		int b = input.nextInt();

		System.out.print("JSP ���� : ");
		int c = input.nextInt();

		int sum = a+b+c;
		double avg = (double)sum/3;

			if(a>= 100 || b>=100 || c>=100 || a<0 || b<0 || c<0) {
			System.out.println("�߸� �Է��߽��ϴ�.");
			} else {
			System.out.print("���� : " + sum + " ��� : " + avg + " ��� : ");
		 	
				if(avg>=90) {
						System.out.println("��");
				}else if(avg >=80) {
						System.out.println("��");
				
				}else if(avg >=70) {
						System.out.println("��");
				
				}else if(avg >=60) {
						System.out.println("��");
				
				}else {
						System.out.println("��");
				}
			
			}


			
	}
}

//�� ������ ������ 100�� �Ѵ� ���