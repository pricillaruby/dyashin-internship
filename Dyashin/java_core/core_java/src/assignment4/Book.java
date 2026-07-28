package assignment4;

public class Book {
	String bookTitle;
	String bookAuthor;
	int bookPrice;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book();
		book1.bookTitle="Atomic Habits";
		book1.bookAuthor = "James Clear";
		book1.bookPrice = 250;
		
		Book book2 = new Book();
		book2.bookTitle="Can we Strangers Again?";
		book2.bookAuthor = "Shrijeet";
		book2.bookPrice = 300;
		System.out.println("Book1: "+book1.bookTitle+" , "+"Book1 Author: "+book1.bookAuthor+" , "+"Book1 Price: "+book1.bookPrice+"\n"+"Book2: "+book2.bookTitle+" , "+"Book2 Author: "+book2.bookAuthor+" , "+"Book2 Price: "+book2.bookPrice);
	}

}
