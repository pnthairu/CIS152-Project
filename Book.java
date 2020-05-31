public class Book 
{
	// Declaring variables
    private String title;
    private String author;
    
   //Default constructor
    public Book(String a, String t) {
    	author = a;
    	title = t;
    }
    
    //Getter method to get title of the book
    public String getTitle() {
    	return title;
    }
    
    //Getter method to get the name of the book author
    public String getAuthor() {
    	return author;
    }
    
}

