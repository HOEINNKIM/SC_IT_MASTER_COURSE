package LectureExample;

import java.util.Scanner;

public class StringText_181011_01 {

	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);

		System.out.print("占썼열占쏙옙 占쏙옙占쏙옙 : ");
		double[] arr = new double[input.nextInt()];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("占쌉뤄옙" + (i+1) + " : ");
			arr[i] = input.nextDouble();			
		}

		double sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
				
		System.out.println("占쏙옙占쏙옙占?" + (sum/arr.length) + " 占쏙옙 占쌉니댐옙.");		

	}
}
