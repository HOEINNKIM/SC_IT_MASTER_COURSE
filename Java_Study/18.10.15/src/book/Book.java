package book;

public class Book {

	String title;
	int page;
	int price;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
/*	@Override
	public String toString() {
		return "Title : " + title + ", Page : " + page + ", Price : " + price;
		}*/

	public void printBookInfo() {
		System.out.println("[Title : " + title + ", Page : " + page + ", Price : " + price + "]");
		}


}
