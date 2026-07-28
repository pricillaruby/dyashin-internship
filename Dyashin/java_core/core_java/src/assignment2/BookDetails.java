package assignment2;
import java.util.Scanner;

public class BookDetails {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//bookname
		System.out.println("Enter Book Name:");
		String bookName = in.nextLine();
		
		//authorname
		System.out.println("Enter Author Name:");
		String authorName = in.nextLine();
		
		//isbnnumber
		System.out.println("Enter ISBN Number:");
		long isbnNumber = in.nextInt();

		//publisher
		System.out.println("Enter Publisher Name:");
		String publisherName = in.next();
		
		//price
		System.out.println("Enter Price:");
		float bookPrice = in.nextFloat();
		
		//numberofpages
		System.out.println("Enter Number of Pages:");
		int noOfPages = in.nextInt();
		
		System.out.println("Book Details");
		System.out.println("Book:"+bookName);
		System.out.println("Author:"+authorName);
		System.out.println("ISBN Number:"+isbnNumber);
		System.out.println("Publisher:"+publisherName);
		System.out.println("Book Price:"+bookPrice);
		System.out.println("Number of Pages:"+noOfPages);
	}

}
