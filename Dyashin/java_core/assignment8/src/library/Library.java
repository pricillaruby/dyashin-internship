package library;

public class Library {
	private long bookId;
	private String title;
	private boolean isIssued;
	
	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isIssued() {
		return isIssued;
	}
	public void setIssued(boolean isIssued) {
		this.isIssued = isIssued;
	}
	
	public void bookIssued() {
		if(!isIssued) {
			isIssued = true;
			System.out.println("Book has been issued");
		}else {
			System.out.println("Book has been already issued");
		}
	}
	
	public void returnBook() {
		if(isIssued) {
			isIssued = false;
			System.out.println("Book has been returned");
		}else {
			System.out.println("Book has been not issued");
		}
	}
	
}
