package game;

import java.util.Random;
import java.util.Scanner;

public class NumbersGame {

	public static void main(String[] args) {
		// ?レ옄留욎텛湲?寃뚯엫
		// 0~100 ?ъ씠???꾩쓽???섎??섎굹 ?앹꽦
		// ?ㅽ뻾寃곌낵:
		// ?レ옄?낅젰(0~100) : 50
		// ?щ떎

		// ?レ옄?낅젰(0~100) : 60
		// ?묐떎

		// ?レ옄?낅젰(0~100) : 55
		// 留욎븯??3踰?

		// 怨꾩냽(y/n) : y
		// ?レ옄?낅젰(0~100) :
		Scanner input = new Scanner(System.in);
		Random random = new Random();

		String yesOrNo;

		while (true) {
			System.out.println("?レ옄?낅젰 : ");
			int rd = random.nextInt(101);
			while (true) {
				int susja = input.nextInt();

				if (susja == rd) {
					System.out.println("留욎븯??);
					break;

				} else if (susja > rd) {
					System.out.println("?щ떎");
				} else if (susja < rd) {
					System.out.println("?묐떎");
				}
			}
			System.out.println("怨꾩냽(y/n) : ");
			yesOrNo = input.next();
			if (yesOrNo.equals("y")) {
			} else if (yesOrNo.equals("n")) {
				break;
			} else {
				System.out.println("?섎せ??媛믪쓣 ?낅젰?섏??듬땲??");
			}
		}
	}
}
