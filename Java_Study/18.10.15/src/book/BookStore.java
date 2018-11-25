package book;

public class BookStore {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.toString();
		System.out.println(b1.toString());
		b1.setPrice(5000);
		System.out.println(b1.getPrice());
		b1.printBookInfo();
		
		Book b2 = new Book();
		b2.setTitle("김회인");
		/*b1.printBookInfo();
		b2.printBookInfo();		
		*/
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		b2=b1;
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		b2.setPage(7);
		b1.printBookInfo();
		b2.printBookInfo();		
	}
}