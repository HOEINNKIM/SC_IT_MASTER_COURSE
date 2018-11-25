package step10_Answer.UI;

import java.util.Scanner;

import step10_Answer.Manager.BookMgr;
import step10_Answer.VO.AudioBook;
import step10_Answer.VO.Book;
import step10_Answer.VO.TextBook;

public class BookUI {

	private Scanner sc = new Scanner(System.in);
	private BookMgr mgr = new BookMgr();

	public BookUI() {// ?꾨줈洹몃옩 ?쒖옉

		while (true) {

			mainMenu();
			int choice = sc.nextInt();

			switch (choice) {
				case 1:// ?꾩꽌?낅젰
					System.out.println("?꾩꽌????낆쓣 ?좏깮?댁＜?몄슂. (1.Text 2.Audio)");
					int choice2 = sc.nextInt();
					Book book = null;
					String bookId;
					String title;
					String content;
					
					switch (choice2) {
						case 1:
							System.out.println("?꾩꽌踰덊샇瑜??낅젰?댁＜?몄슂.");
							bookId = sc.next();
							System.out.println("?꾩꽌?쒕ぉ???낅젰?댁＜?몄슂.");
							title = sc.next();
							System.out.println("?꾩꽌?댁슜???낅젰?댁＜?몄슂.");
							content = sc.next();
							System.out.println("?꾩꽌???섏씠吏?섎? ?낅젰?댁＜?몄슂.");
							String pageNum = sc.next();
			
							book = new TextBook(bookId, title, content, pageNum);
							break;
						case 2:
							System.out.println("?꾩꽌踰덊샇瑜??낅젰?댁＜?몄슂.");
							bookId = sc.next();
							System.out.println("?꾩꽌?쒕ぉ???낅젰?댁＜?몄슂.");
							title = sc.next();
							System.out.println("?꾩꽌?댁슜???낅젰?댁＜?몄슂.");
							content = sc.next();
							System.out.println("?꾩꽌???ъ깮?쒓컙???낅젰?댁＜?몄슂.");
							int playTime = sc.nextInt();
			
							book = new AudioBook(bookId, title, content, playTime);
							break;
						default:
							break;
					}
					
					mgr.addBook(book);
					break;
					
				case 2:// ?꾩꽌寃??
					System.out.println("?꾩꽌踰덊샇瑜??낅젰?댁＜?몄슂.");
					bookId = sc.next();
	
					Book result = mgr.searchBook(bookId);
	
					if (result == null) {
						System.out.println("李얜뒗 ?꾩꽌媛 ?놁뒿?덈떎.");
					} else {
						System.out.println(result);
					}
					break;
					
				case 3:// ?꾩껜異쒕젰
					mgr.printAll();
					break;
					
				default:
					System.out.println("1~3 ?댁쇅???ㅺ? ?낅젰?섏뿀?듬땲??\n?ㅼ떆 ?낅젰?댁＜?몄슂.\n");
			}

		}

	}

	public void mainMenu() {
		System.out.println("====LIBRARY====");
		System.out.println("1.?꾩꽌?낅젰");
		System.out.println("2.?꾩꽌寃??);
		System.out.println("3.?꾩꽌?꾩껜異쒕젰");
		System.out.println("==============");
	}

}
