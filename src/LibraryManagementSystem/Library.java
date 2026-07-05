package LibraryManagementSystem;

import java.util.Scanner;

public class Library {
	Book[] books=new Book[100];
	int count=0;
	Scanner sc=new Scanner(System.in);
	public void addBook() {
		Book book=new Book();
		System.out.println("Enter BookId: ");
		int bookId=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter BookName: ");
		String bookName=sc.nextLine();
		System.out.println("Enter AuthorName: ");
		String authorName=sc.nextLine();
		System.out.println("Enter Category: ");
		String category=sc.nextLine();
		System.out.println("Enter Price: ");
		double price=sc.nextDouble();
//		System.out.println("Is Issued: ");
//		boolean isIssued=sc.nextBoolean();
		
		book.setBookId(bookId);
		book.setBookName(bookName);
		book.setAuthorName(authorName);
		book.setCategory(category);
		book.setPrice(price);
		book.setIssued(false);
		
		books[count]=book;
		count++;
		System.out.println("Book Added Successfully");
	}
	
	public void viewBooks() {
		if(count==0) {
			System.out.println("No Books AvailAble");
		}
		else {
			for(int i=0;i<count;i++) {
				System.out.println(books[i].getBookId());
				System.out.println(books[i].getBookName());
				System.out.println(books[i].getAuthorName());
				System.out.println(books[i].getCategory());
				System.out.println(books[i].getPrice());
				System.out.println(books[i].isIssued());
				
			}
		}
		
	}
	public void searchBook() {
		System.out.println("Enter BookId: ");
		int bookId=sc.nextInt();
		boolean found=false;
		for(int i=0;i<count;i++) {
			if(books[i].getBookId()==bookId) {
				
				System.out.println("Book Found");
				System.out.println("Details: ");
				System.out.println(books[i].getBookId());
				System.out.println(books[i].getBookName());
				System.out.println(books[i].getAuthorName());
				System.out.println(books[i].getCategory());
				System.out.println(books[i].getPrice());
				System.out.println(books[i].isIssued());
				found=true;
				break;
			}
			
		}
		if(!found) {
			System.out.println("Book Not Found");
		}
	}

}
