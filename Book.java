
public class Book {
       private String nameOfTheBook;
       private int nrOfPages;
       
public Book() {
          }

public Book(String nameOfTheBook, int nrOfPages) {
	   this.nameOfTheBook = nameOfTheBook;
	   this.nrOfPages = nrOfPages;
       }
// CODE REVIEW - Attention to camel-case -> it should be getNameOfTheBook
public String getnameOfTheBook() {
	   return nameOfTheBook;
	   }

// CODE REVIEW - same as above
public int getnrOfPages() {
	   return nrOfPages;
       }
}
