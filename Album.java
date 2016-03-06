
public class Album extends Book{
       String pageQuality;
       
public Album(){
    }

public Album(String nameOfTheAlbum, int nrOfPages, String pageQuality)  {
	    super(nameOfTheAlbum, nrOfPages);
	    this.pageQuality = pageQuality;
    }

public String getPageQuality(){
	return pageQuality;
	}
}
