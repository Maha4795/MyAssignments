package week1.day1;

public class LibraryManagement {

	public static void main(String[] args) {
		// Create object of library class
		Library lib = new Library();
		
		// Call addBook method
		String bookName = lib.addBook("Java Programming");
		
		//Display returned value
		System.out.println("Book Title: " + bookName);
		
		//Call issueBook method
		lib.issueBook();

	}

}
