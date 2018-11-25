package LectureExample;

import java.util.Scanner;

public class StringText_181011_02 {

	public static void main(String[] args) {
		//占썼열占쏙옙 占싱울옙占싹울옙 占쏙옙짜占쏙옙 占쏙옙占쏙옙킨 占쏙옙
		int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30 ,31, 30, 31};
		//占쏙옙占쏙옙占쏙옙 :
		//占쏙옙占싹댐옙 占쏙옙:3
		//3占쏙옙占쏙옙 31占쏙옙 占쌉니댐옙.
		
		Scanner input = new Scanner(System.in);
		System.out.print("占쏙옙占싹댐옙 占쏙옙 : ");
		int a = input.nextInt();
		System.out.println(a + "占쏙옙占쏙옙 " + month[a-1] +"占쏙옙 占쌉니댐옙.");
		
	}

}
