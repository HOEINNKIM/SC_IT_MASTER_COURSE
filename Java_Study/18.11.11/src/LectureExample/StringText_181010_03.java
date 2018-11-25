package LectureExample;

import java.util.Random;

public class StringText_181010_03 {

	public static void main(String[] args) {
		//0~99
		System.out.println((int)(Math.random()*100));
		Random r = new Random();
		System.out.println(r.nextInt(100));
		//1~100
		System.out.println((int)(Math.random()*100)+1);
		//0~5
		System.out.println((int)(Math.random()*6));
		//1~6
		System.out.println((int)(Math.random()*6)+1);
		//1~6
		System.out.println((int)(Math.random()*6)+3);
		// abs()
		System.out.println(Math.abs(10));
		System.out.println(Math.abs(-10));
		System.out.println(Math.abs(-3.14));

		//floor ceil round
		System.out.println(Math.floor(3.14));
		System.out.println(Math.floor(3.9));
		System.out.println(Math.ceil(3.14));
		System.out.println(Math.ceil(3.9));
		System.out.println(Math.round(3.14));
		System.out.println(Math.round(3.9));

		// min max
		System.out.println(Math.min(3.14,  3.14159));
		System.out.println(Math.max(3.14,  3.14159));
		System.out.println(Math.min(-10,  -11));
		System.out.println(Math.max(-10,  -11));
		
		//pow sqrt
		System.out.println(Math.pow(5, 2));
		System.out.println(Math.sqrt(25));

		//sin cos tan		
	}
}