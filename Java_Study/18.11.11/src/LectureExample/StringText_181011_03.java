package LectureExample;

import java.util.Scanner;

public class StringText_181011_03 {

	public static void main(String[] args) {
		// 占승쇽옙占쏙옙 10占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙 占시쏙옙占쏙옙
		// 占쏙옙占쏙옙1: 占쏙옙占쏙옙微占?占승쇽옙占쏙옙 占쏙옙占쏙옙占싹뤄옙占싹몌옙 
		//占쏙옙占쏙옙占쏙옙 占승쇽옙 占쏙옙치표占쏙옙 占쏙옙占쏙옙占쌔댐옙.
		// 占쏙옙占쏙옙2: 占쏙옙占쏙옙占?占승쇽옙占쏙옙 '占쏙옙占쏙옙 占쌀곤옙占쏙옙', 
		//占쏙옙占쏙옙占쏙옙占?占쏙옙占쏙옙 占승쇽옙占쏙옙 '占쏙옙占썅가占쏙옙'占쏙옙占쏙옙 표占쏙옙占싼댐옙.
		
		Scanner input = new Scanner(System.in);
		String[] table = new String[10];
		

		for(;;) {
			
			for(int i=0;i<table.length;i++) {
				if(table[i]==null) {
					table[i]= "占쏙옙占쏙옙 占쏙옙占쏙옙";
				}			
				System.out.println("占승쇽옙" + (i+1) + " : " + table[i] );
			}
			
			System.out.print("占쏙옙占쏙옙占쏙옙 占승쇽옙占쏙옙호? : ");
			table[input.nextInt()-1] = "占쏙옙占쏙옙 占쌀곤옙占쏙옙";				
		}
			
		
	}

}
