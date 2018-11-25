package step3_UI;

import java.util.Scanner;

import step3_Manager.BookMgr;
import step3_VO.AudioBook;
import step3_VO.Book;
import step3_VO.TextBook;

public class BookUI {

	private Scanner scanner = new Scanner(System.in);
	private BookMgr mgr = new BookMgr();
	
	public BookUI() { //프로그램 시작

		while(true) {
		
			
		
			mainMenu();		
			int choice = scanner.nextInt();
		
			System.out.println("도서타입을 선택해");
			System.out.println("(1.text / 2.audio");
			int choice0 = scanner.nextInt();

			switch(choice0) {
			case 1:
				switch(choice) {
				case 1:	//도서입력
					System.out.println("도서번호를 입력해주세요.");
					String bookId = scanner.next();
					System.out.println("도서제목을 입력해주세요.");
					String title = scanner.next();
					System.out.println("도서 내용을 입력해주세요.");
					String content = scanner.next();
					System.out.println("페이지 수를 입력해주세요.");
					String pageNum = scanner.next();
					
					TextBook textbook = new TextBook(bookId, title, content, pageNum);
					mgr.addBook(textbook);
					break;
				case 2: //도서검색
					System.out.println("도서번호를 입력해주세요.");
					bookId = scanner.next();
					
					Book result = mgr.searchBook(bookId);
					
					if(result == null) {
						System.out.println("도서정보가 없음");
					} else {
						System.out.println(result);
					}
					break;
				case 3: //전체출력
					mgr.printAll();
					break;
					
				}
				break;
			case 2:
				switch(choice) {
				case 1:	//도서입력
					System.out.println("도서번호를 입력해주세요.");
					String bookId = scanner.next();
					System.out.println("도서제목을 입력해주세요.");
					String title = scanner.next();
					System.out.println("도서 내용을 입력해주세요.");
					String content = scanner.next();
					System.out.println("플레이 시간를 입력해주세요.");
					int playTime = scanner.nextInt();
					
					AudioBook audioBook = new AudioBook(bookId, title, content, playTime);
					mgr.addBook(audioBook);
					break;
				case 2: //도서검색
					System.out.println("도서번호를 입력해주세요.");
					bookId = scanner.next();
					
					Book result = mgr.searchBook(bookId);
					
					if(result == null) {
						System.out.println("도서정보가 없음");
					} else {
						System.out.println(result);
					}
					break;
				case 3: //전체출력
					mgr.printAll();
					break;
					
				}
				break;

			}
/*			switch(choice) {
			case 1:	//도서입력
				System.out.println("도서번호를 입력해주세요.");
				String bookId = scanner.next();
				System.out.println("도서제목을 입력해주세요.");
				String title = scanner.next();
				System.out.println("도서 내용을 입력해주세요.");
				String content = scanner.next();
				
				Book book = new Book(bookId, title, content);
				mgr.addBook(book);
				break;
			case 2: //도서검색
				System.out.println("도서번호를 입력해주세요.");
				bookId = scanner.next();
				
				Book result = mgr.searchBook(bookId);
				
				if(result == null) {
					System.out.println("도서정보가 없음");
				} else {
					System.out.println(result);
				}
				break;
			case 3: //전체출력
				mgr.printAll();
				break;
				
			}
*/		}
	
	}
	
	public void mainMenu() {
		System.out.println("===Library===");
		System.out.println("1) 도서 입력");
		System.out.println("2) 도서 검색");
		System.out.println("3) 전체 도서 출력");
		System.out.println("=============");
	}
}