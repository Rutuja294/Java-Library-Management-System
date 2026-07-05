package LibraryManagementSystem;

public class Book {
	private int bookId;
	private String bookName;
	private String authorName;
	private String category;
	private double price;
	private boolean isIssued;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isIssued() {
		return isIssued;
	}
	public void setIssued(boolean isIssued) {
		this.isIssued = isIssued;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", authorName=" + authorName + ", category="
				+ category + ", price=" + price + ", isIssued=" + isIssued + "]";
	}
	public Book(int bookId, String bookName, String authorName, String category, double price, boolean isIssued) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.category = category;
		this.price = price;
		this.isIssued = isIssued;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
