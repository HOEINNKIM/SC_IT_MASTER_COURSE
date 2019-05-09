package Test03;
import java.util.Scanner;

public class ChangeChar {

	public static String printResult(String input) {
		
		String result = input;
		
		for(int i = result.length() - 1; i >= 0; i--) {


			String sign = "";
			
			for(int j = 0 ; j < result.length() - i; j++) {
				sign += "#";
			}

			System.out.println(result.substring(0,i) + sign);
		
		}
		
		return result;
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("ют╥б : ");
		String gotOne =  input.nextLine();
		printResult(gotOne);
		
		
	}

}
