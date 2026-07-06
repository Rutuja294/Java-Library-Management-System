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
			if(books[i].getBookId()==bookId){
				
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
	
	public void issueBook() {
		System.out.println("Enter Book Id: ");
		int bookId=sc.nextInt();
		boolean found=false;
		for(int i=0;i<count;i++) {
			if(books[i].getBookId()==bookId) {
				found=true;
				if(books[i].isIssued()==true) {
					System.out.println("Book Is Already Issued");
					break;
				}
				else {
					books[i].setIssued(true);
					System.out.println("Book Issued SucessFully");
					
					break;
				}
			}
		}
		if(!found) {
			System.out.println("Book Not Found");
		}
		
		
	}
	
	public void returnBook() {
		System.out.println("Enter BookId: ");
		int bookId=sc.nextInt();
		boolean found=false;
		for(int i=0;i<count;i++) {
			if(books[i].getBookId()==bookId) {
				found=true;
				if(books[i].isIssued()==true) {
					books[i].setIssued(false);
					System.out.println("Book Returned Successfully");
					break;
				}
				else {
					System.out.println("Book Already Returned");
					break;
				}
			}
		}
		if(!found) {
			System.out.println("Book Not Found");
		}
	}
	
	public void removeBook() {
	    System.out.println("Enter Book ID: ");
	    int bookId = sc.nextInt();

	    boolean found = false;

	    for (int i = 0; i < count; i++) {

	        if (books[i].getBookId() == bookId) {

	            found = true;

	           
	            for (int j = i; j < count - 1; j++) {
	                books[j] = books[j + 1];
	            }

	            
	            books[count - 1] = null;

	            count--;

	            System.out.println("Book Removed Successfully.");
	            break;
	        }
	    }

	    if (!found) {
	        System.out.println("Book Not Found.");
	    }
	}
	
	public void statistics() {
		int issuedBooks = 0;
		int availableBooks = 0;
		System.out.println("Total books: "+count);
		for(int i=0;i<count;i++) {
			if(books[i].isIssued()==true) {
				issuedBooks++;
			}
			else {
				availableBooks++;
			}
		}
		
		System.out.println("Issued Books: "+issuedBooks);
		System.out.println("Available Books: "+availableBooks);
	}

}
