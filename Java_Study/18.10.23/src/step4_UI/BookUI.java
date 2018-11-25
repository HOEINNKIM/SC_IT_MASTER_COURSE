package step4_UI;

import java.util.Scanner;

import step4_Manager.BookMgr;
import step4_VO.Book;

public class BookUI {

	private Scanner sc = new Scanner(System.in);
	private BookMgr mgr = new BookMgr();

	public BookUI() {// 占쎈늄嚥≪뮄?뉛옙??占쎈뻻占쎌삂

		while (true) {

			mainMenu();
			int choice = sc.nextInt();

			switch (choice) {

			case 1:// 占쎈즲占쎄퐣占쎌뿯占쎌젾

				System.out.println("占쎈즲占쎄퐣甕곕뜇?뉒몴占?占쎌뿯占쎌젾占쎈퉸雅뚯눘苑?옙??");
				String bookId = sc.next();
				System.out.println("占쎈즲占쎄퐣占쎌젫筌뤴뫗??占쎌뿯占쎌젾占쎈퉸雅뚯눘苑?옙??");
				String title = sc.next();
				System.out.println("占쎈즲占쎄퐣占쎄땀占쎌뒠占쎌뱽 占쎌뿯占쎌젾占쎈퉸雅뚯눘苑?옙??");
				String content = sc.next();

				Book book = new Book(bookId, title, content);
				mgr.addBook(book);

				break;
			case 2:// 占쎈즲占쎄퐣野껓옙占쎄퉳

				System.out.println("占쎈즲占쎄퐣甕곕뜇?뉒몴占?占쎌뿯占쎌젾占쎈퉸雅뚯눘苑?옙??");
				bookId = sc.next();

				Book result = mgr.searchBook(bookId);

				if (result == null) {
					System.out.println("筌≪뼔??占쎈즲占쎄퐣揶쏉옙 占쎈씨占쎈뮸占쎈빍占쎈뼄.");
				} else {
					System.out.println(result);
				}

				break;
			case 3:// 占쎌읈筌ｋ똻?㏆옙??
				mgr.printAll();

				break;
			}

		}

	}

	public void mainMenu() {
		System.out.println("====LIBRARY====");
		System.out.println("1.占쎈즲占쎄퐣占쎌뿯占쎌젾");
		System.out.println("2.占쎈즲占쎄퐣野껓옙占쎄퉳");
		System.out.println("3.占쎈즲占쎄퐣占쎌읈筌ｋ똻?㏆옙??);
		System.out.println("==============");
	}

}
