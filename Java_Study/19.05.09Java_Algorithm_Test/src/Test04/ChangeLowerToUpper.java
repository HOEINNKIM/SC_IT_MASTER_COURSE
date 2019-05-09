package Test04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChangeLowerToUpper {

	public static StringBuffer printResult(String input) {
		StringBuffer sb = new StringBuffer(input);

		String lower = "abcdefghijklmnopqrstuvwxyz";
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		ArrayList<Integer> index = new ArrayList<Integer>();

		int count = 0;

		for (int i = 0; i < sb.length(); i++) {

			for (int j = 0; j < lower.length(); j++) {
				if ((sb.charAt(i) + "").equals(lower.charAt(j) + "")) {
					sb.replace(i, i + 1, upper.charAt(j) + "");
				}
			}
		}

		return sb;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("ют╥б : ");
		String gotOne = input.next();
		System.out.println(printResult(gotOne).toString());

	}

}
