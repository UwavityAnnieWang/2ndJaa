import java.util.ArrayList;

public class PictureBook extends Book{
	
	private String illustrator;
	public PictureBook(String title, String author, String illustrate) {
		super(title, author);
		illustrator = illustrate; 
	}
	
	public void printBookInfo() {
		super.printBookInfo();
		System.out.print("and illustrated by " + illustrator);
		
		
	}
	
	public static void main(String[]args) {
		ArrayList<Book> myLibrary = new ArrayList<Book>();
		Book book1 = new Book("Frankenstein", "Mary Shelley");
		PictureBook book2 = new PictureBook("The Wonderful Wizard of Oz", 
				"L. Frank Baum", "W. W Denslow");
		myLibrary.add(book1);
		myLibrary.add(book2);
		BookListing one = new BookListing (book1, 10.99);
		one.printDescription();
		
		
		
	}
}
