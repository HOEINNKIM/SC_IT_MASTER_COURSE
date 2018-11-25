package LectureExample;

import java.util.Scanner;

public class ArrayTest_181011_03_answer {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// 醫뚯꽍??10媛쒖씤 ?꾩꽌愿 ?덉빟 ?쒖뒪??
		boolean array[] = new boolean[10];
		// 議곌굔1. ?ъ슜?먭? 醫뚯꽍???덉빟?섎젮?섎㈃ 
		//          ?꾩옱??醫뚯꽍 諛곗튂?쒕? 蹂댁뿬以??
		while(true) {
			for (int i = 0; i < array.length; i++) {
				if (array[i]) {
					System.out.println("醫뚯꽍" + (i + 1) + " : ?덉빟 遺덇???);
				} else {
					System.out.println("醫뚯꽍" + (i + 1) + " : ?덉빟媛??);
				}
			}
			System.out.print("?덉빟??醫뚯꽍踰덊샇??(1-10)");
			int number = s.nextInt();
			array[number - 1] = true;
			// 議곌굔2. ?덉빟??醫뚯꽍? '?덉빟 遺덇???, 
			//          ?덉빟?섏??딆? 醫뚯꽍? '?덉빟媛???쇰줈 ?쒖떆?쒕떎.
		}
	}
}