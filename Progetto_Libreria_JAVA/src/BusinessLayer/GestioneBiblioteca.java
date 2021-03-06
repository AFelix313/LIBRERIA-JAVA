package BusinessLayer;

import java.util.*;
import Entity.*;



public class GestioneBiblioteca {

	
	// Inizializzo lo scanner e la biblioteca:
	Scanner input = new Scanner (System.in);
	Library lazzerini=new Library();

	
	public int menuStarter() {
		
		int starterChoice;
		
		System.out.println("Welcome to Lazzerini! ");
		System.out.println("If a New User: select 1");
		System.out.println("Login: select 2");
		System.out.println("Exit: select 3");
		System.out.print("Choose what do you want to do:");
		
		starterChoice = input.nextInt();
	
		return starterChoice;
	}
	
	
	public int menuUser() {
		
		int userChoice;
		
		System.out.println("Hello User" + "Andrea");
		System.out.println("Create booking: select 1");
		System.out.println("Delete booking: select 2");
		System.out.println("Exit: select 3");
		System.out.print("Choose what do you want to do:");
		
		userChoice = input.nextInt();
	
		return userChoice;
	}
	
		
	
public int adminUser() {
		
		int adminChoice;
		
		System.out.println("Insert new book: select 1");
		System.out.println("Edit book: select 2");
		System.out.println("Delete book: select 3");
		System.out.println("Exit: select 4");
		System.out.print("Choose what do you want to do:");
		System.out.print("\n");
		
		adminChoice = input.nextInt();
	
		return adminChoice;
	}
	

	
	public void insertBook() {
		
		
		Book book = new Book();
		
		
		System.out.println("Inserisci BookId:");
		book.setBookld(input.nextInt());
		System.out.println(book.getBookld());
		if(lazzerini.checkBook(book.getBookld())==false) {
		
			System.out.println("Inserisci Title:");
			book.setTitle(input.next());
			System.out.println("Inserisci Casa di Pubblicazione:");
			book.setPublishingHouse(input.next());

			do {
				System.out.println("Inserisci Autore:");
				book.setAuthor(input.next());
				System.out.println("Ci sono altri autori (1 SI 2 NO):");	
			} while (input.nextInt()!=2);

			lazzerini.addBook(book);
		}	
		else 
		{ 
			lazzerini.addBook2(book.getBookld());
		}
		
	}
	


	public void login() {
		System.out.print("Username: ");
		String username = input.next().replace("\n", "");
		System.out.print("Password: ");
		String pass = input.next().replace("\n", "");
		
		// Faccio inserire nome e password, se vi sono presenti accedo altrimenti
		// da errore! 
		
		User user1 = new User();
		
		
		//User logged_in = my_libr.login(username, pass);
		//if ( logged_in!= null || logged_in instanceof User ) {
		//	System.out.println("Logged in! Welcome "+ logged_in.getUsername() + "!");
		//}else {
		//	System.out.println("Login failed! User of password incorrect.");
		//
		}


	public void firstLogin() {
		
		// Primo login con la creazione del nuovo utente!
		
		System.out.print("Username: ");
		String username = input.next().replace("\n", "");
		System.out.print("Password: ");
		String pass = input.next().replace("\n", "");
		System.out.print("userId: ");
		System.out.print("role: ");
	
		
	}


	public void exit() {
		
		System.out.println("\n");
		System.out.println("Have a Nice Day!");
		
	}
	
 
	
}
