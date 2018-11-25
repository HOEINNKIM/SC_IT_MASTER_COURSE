import java.util.Scanner;
class HomeTraining3 {
	public static void main(String[] args) {

	int r;
	int height;
	double extent;
	double volume;	

	Scanner input = new Scanner(System.in);
	System.out.print("원기둥의 반지름 : ");
	r = input.nextInt();
	System.out.print("원기둥의 높이 : ");
	height = input.nextInt();
	extent = r * r * 3.14;
	volume = extent * height;
	System.out.println("원기둥의 부피는 " + volume + "입니다.");

	}
}
