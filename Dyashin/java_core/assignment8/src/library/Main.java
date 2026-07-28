package library;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library library = new Library();
		library.setBookId(10);
		library.setTitle("Warmth");
		library.setIssued(true);
		
		library.bookIssued();
		library.returnBook();
	}

}
