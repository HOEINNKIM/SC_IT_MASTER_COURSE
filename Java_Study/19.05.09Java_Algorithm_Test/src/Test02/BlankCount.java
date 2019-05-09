package Test02;
import java.util.Scanner;

public class BlankCount {

	public static String printResult(String input) {
		
		String inputManage = " " + input;
		String result = "";
		
		for(int i = 0; i < inputManage.length(); i++) {

			String gotI = inputManage.charAt(i) + "";
			
			if(gotI.equals(" ")) {				

				if(result.equals("")) {
					result += inputManage.charAt(i+1);
					
				} else {
					result += "," + inputManage.charAt(i+1);					
				}
				
			}
		}

		return result;
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("ют╥б : ");
		String gotOne =  input.nextLine();
		System.out.println(printResult(gotOne));
		
		
	}

}
