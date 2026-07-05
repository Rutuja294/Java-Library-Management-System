package LibraryManagementSystem;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Library library = new Library();

		int choice;

		do {

		    System.out.println("1. Add Book");
		    System.out.println("2. View Books");
		    System.out.println("3. Search Book");
		    System.out.println("4. Exit");

		    System.out.print("Enter Choice : ");
		    choice = sc.nextInt();

		    switch(choice) {

		    case 1:
		        library.addBook();
		        break;

		    case 2:
		        library.viewBooks();
		        break;
		    case 3:
		    	library.searchBook();
		    	break;
		    
		        

		    case 4:
		        System.out.println("Thank You!");
		        break;

		    default:
		        System.out.println("Invalid Choice");
		    }

		} while(choice != 4);
	}
}


