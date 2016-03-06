
public class Book {
       private String nameOfTheBook;
       private int nrOfPages;
       
public Book() {
          }

public Book(String nameOfTheBook, int nrOfPages) {
	   this.nameOfTheBook = nameOfTheBook;
	   this.nrOfPages = nrOfPages;
       }

public String getnameOfTheBook() {
	   return nameOfTheBook;
	   }

public int getnrOfPages() {
	   return nrOfPages;
       }
}
