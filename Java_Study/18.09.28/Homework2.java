import java.util.Scanner;

public class test002 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("배열의 칸수 입력 : ");
		int array_length = input.nextInt();
		int[] arr = new int[array_length];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("배열[" + i + "] = ");
			arr[i] = input.nextInt();
		}
		
	}
}