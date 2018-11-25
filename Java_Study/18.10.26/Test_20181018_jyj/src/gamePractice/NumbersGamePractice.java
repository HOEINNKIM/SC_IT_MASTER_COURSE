package gamePractice;
import java.util.Scanner;
import java.util.Random;

public class NumbersGamePractice {
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
		
		while(true) {
			int rd = random.nextInt(101);
			System.out.print("?レ옄?낅젰(0~100) : ");
			while(true) {
				int number = input.nextInt();
				if (number == rd) {
					System.out.println("留욎븯??");
					break;
				} else if (number > rd) {
					System.out.println("???묒뒿?덈떎.");
				} else if (number < rd) {
					System.out.println("???쎈땲??");
				}
			}
			while(true) {
				System.out.print("怨꾩냽(y/n) : ");
				String yesOrNo = input.next();
				if(yesOrNo == "y") {
					break;
				} else if (yesOrNo != "y" && "n") {
					System.out.println("?섎せ?낅젰?섏뀲?듬땲??");
				} 
			}
			if(yesOrNo == "n") {
				System.out.println("??);
				break;
			}
			 
		}
			
			
	}
}
