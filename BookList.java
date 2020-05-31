import java.util.ArrayList;

public class BookList {
	
	// Declaring array list with the names of the books authors
	 private static final String[] authors = {"Andrew Johnson", "Bob Hilfer", "Mia Loggs", "Paul Baker", "Angela Dawnson", 
	    		"Rupi Gupta", "Yi Noi", "Zaeb Collins", "Michael Miller", "Nia Gibson"};
	 
	// Declaring array list with the names of the books
	 private static final String[] titles = {"Chemistry for Kids", "Organic Chemistry", "Medicine & Chemistry", "Biology 7", "Modern Biology", "Sea World Deluxe", "Planet Plants", "Advanced Physics",  
			 "Nuclear Physics",  "College Mechanics"};
	 
	 private ArrayList<Book> arr;
	 
	 // Method to loop through books and authors
	 public BookList()
	 {
		 arr = new ArrayList<Book>();
		 for(int i = 0; i < titles.length; i++) 
			 arr.add(new Book(authors[i], titles[i]));
	 }
	 
	 //Method to store books in an arryList
	 public ArrayList<Book> getBooks()
	 {
		 return arr;
	 }
}