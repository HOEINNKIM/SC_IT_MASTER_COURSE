import java.util.Scanner;
class HomeTraining3 {
	public static void main(String[] args) {

	int r;
	int height;
	double extent;
	double volume;	

	Scanner input = new Scanner(System.in);
	System.out.print("������� ������ : ");
	r = input.nextInt();
	System.out.print("������� ���� : ");
	height = input.nextInt();
	extent = r * r * 3.14;
	volume = extent * height;
	System.out.println("������� ���Ǵ� " + volume + "�Դϴ�.");

	}
}
