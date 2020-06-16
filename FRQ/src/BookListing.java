import java.util.ArrayList;
public class BookListing {
	private Book book;
	private double price; 
	public BookListing(Book story, double pay) {
		book=story;
		price=pay;
		
		
	}
	
	public void printDescription() {
		book.printBookInfo();
		System.out.print(", " + "$" + price);
		
	}

}
