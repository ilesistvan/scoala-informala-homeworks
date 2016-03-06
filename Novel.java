
public class Novel  extends Book{
        String typeOfTheBook;
 
public Novel(){
	}

public Novel(String typeOfTheBook, int nrOfPages, String nameOfTheBook) {
	super(nameOfTheBook, nrOfPages);
	this.typeOfTheBook = typeOfTheBook;
    }

public String gettypeOfTheBook(){
	 return typeOfTheBook;
    }
}
