package Test01;
import java.util.Scanner;

public class StringNumber {

	public static String printResult(String input) {
		
		char[] array = input.toCharArray();
		String buf = "" + array[0];
		String result = "";
		int num = 0;

		for(int i = 0; i < array.length; i++) {

						
			if(buf.equals(array[i]+"")) {
				num += 1;				
			} else {
				result += buf;
				result += num;

				buf = "" + array[i];
				num = 1;
			}			

			if(i == array.length - 1) {
				result += buf;
				result += num;
			}
			
			
		}
		
		return result;
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("ют╥б : ");
		String gotOne =  input.next();
		System.out.println(printResult(gotOne));
		
		
	}

}
