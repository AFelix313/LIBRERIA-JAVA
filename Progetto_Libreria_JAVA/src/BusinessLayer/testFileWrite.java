package BusinessLayer;

import java.io.File;
import java.util.Scanner;
import Entity.Book; // Per importare il package 

import Entity.*;

public class testFileWrite {

	
	// Restituisce in uscita l'oggetto User e per questo motivo mett� return
	// l'oggetto user appena creato:
	
	public User writeUsers() {
		
	
	User user = new User();
	Scanner scanner = new Scanner(System.in);
		
	System.out.print("Inserisci ID: ");
	int id = scanner.nextInt();		
	user.setUserld(id);
	
	
	System.out.print("Inserisci Role: ");
	String name = scanner.next();
	user.setUsername(name);
	
	System.out.print("Inserisci Username: ");
	String eta = scanner.next();
	user.setUsername(eta);
	
	System.out.print("Inserisci Password: ");
	int password = scanner.nextInt();
	user.setPassword(password);
	
	
	return user;
	
	}
	
	public void writeBooks() {
		
		
		Book book = new Book();
		Scanner scanner1 = new Scanner(System.in);
			
		
		System.out.print("BookId: ");
		int bookId = scanner1.nextInt();		
		book.setBookld(bookId);
		
		
		System.out.print("Inserisci autore: ");
		String titolo = scanner1.next();
		book.setTitle(titolo);
		
		System.out.print("Inserisci editore: ");
		String editore = scanner1.next();
		book.setPublishingHouse(editore);
		
		
		}
		
	
	public void Login() {
		
		Scanner scanner1 = new Scanner(System.in);
		
		String userld;
		String Password;
		String Username;
		
		System.out.println("LOGIN");
		System.out.println("Username:");
		
		Username = scanner1.next();
		
		System.out.println("Password:");
		
		Password = scanner1.next();
		
		if(Username.equals(Username) && Password.equals(Password)) 
		System.out.println("You are Login!");
	
		else if (Password.equals(Password)) {
			System.out.println("Invalid Password");
		} else {
			System.out.println("User name and Password");
		}
		
		
		
	}
	
}
