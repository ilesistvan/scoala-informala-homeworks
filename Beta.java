import java.util.ArrayList;
import java.util.Scanner;

public class Beta {
	public static void main(String[] args){
		Beta test = new Beta();
	}
	
    ArrayList<Novel>Novels;
    ArrayList<Album>Albums;
    

    Novel n;
    Album a;
    Scanner sc;
    

public Beta(){
	   Novels = new ArrayList();
	   Albums = new ArrayList();
	   sc = new Scanner(System.in);
       boolean running = true;


while (running) {
	System.out.println("If you want to add a new novel press - 0");
	System.out.println("If you want to add a new album press - 1");
	System.out.println("If you want to delete a novel press - 2");
	System.out.println("If you want to delete an album press - 3");
	System.out.println("If you want to display list of books press - 4");
	    int answer = sc.nextInt();
	  switch (answer){
	  case 0:
		  addNovel();
		  	  break;
	  case 1: 
		  addAlbum();
	  	  break;
	  case 2:
		  deleteNovel();
		  break;
	  case 3:
		  deleteAlbum();
		  break;
	  case 4:
		  listBooks();
		  break;
	  }
	  	  }
}


private void listBooks() {
	System.out.println("Novels : \n");
	System.out.println("Number of novels: " +Novels.size()+ "\n");
	for (int i = 0; i<Novels.size(); i++){
		System.out.println("Name of the book: " +Novels.get(i).getnameOfTheBook());
		System.out.println("Number of pages: " +Novels.get(i).getnrOfPages());
		System.out.println("Type of the novel: " +Novels.get(i).gettypeOfTheBook());
		System.out.println(" ");
		System.out.println(" ");
			}
	System.out.println("Albums: ");
	System.out.println("Number of albums: " +Albums.size()+ "\n");
	for (int i = 0; i<Albums.size(); i++){
		System.out.println("Name of the album: " +Albums.get(i).getnameOfTheBook());
		System.out.println("Number of pages: " +Albums.get(i).getnrOfPages());
		System.out.println("Page quality: " +Albums.get(i).getPageQuality());
		System.out.println(" ");
		System.out.println(" ");
		
	}			
}


private void deleteAlbum() {
	System.out.println("The name of the album you wanna delete: ");
	String delete = sc.next();
	for ( int i= 0; i<Albums.size(); i++){
		if (delete.equals(Albums.get(i).getnameOfTheBook())){
			int indexof = Albums.indexOf(Albums.get(i));
			 Albums.remove(indexof);
		}
			
	}
}


private void deleteNovel() {
	System.out.println("The name of the novel you wanna delete: ");
	String delete = sc.next();
	for (int i = 0; i<Novels.size(); i++){
		if (delete.equals(Novels.get(i).getnameOfTheBook())) {
			int indexof = Novels.indexOf(Novels.get(i));
			Novels.remove(indexof);
		}
			
	}
	
}


private void addAlbum() {
	System.out.println("The album title: ");
	String title = sc.next();
	System.out.println("Number of pages: ");
	int pages = sc.nextInt();
	System.out.println("Quality of the paper: ");
	String quality = sc.next();
	a = new Album(title, pages, quality);
	Albums.add(a);
	}


private void addNovel() {
	System.out.println("The book title: ");
	String title = sc.next();
	System.out.println("Number of pages: ");
	int pages = sc.nextInt();
	System.out.println("Type of the book: ");
	String type = sc.next();
	n = new Novel(title, pages, type);
	Novels.add(n);
}       
}  




