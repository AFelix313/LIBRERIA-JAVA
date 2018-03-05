package BusinessLayer;
import BusinessLayer.GestioneBiblioteca;
import DataLayer.XML_Library;
import Entity.User;



import java.io.Console;


public class MainBiblioteca {

	
		public static void main(String[] args) {
			
			int choise;
			
			// Creo un ciclo While cos� da mantenere vera la condizione di funzionamento:
			
			//while(choise != 4);
			
			GestioneBiblioteca l = new GestioneBiblioteca();
			int starterChoice= l.menuStarter();
			
			User user1 = new User(443,"a","f", 44 );
			
			XML_Library a = new XML_Library(); // Inizializarlo
			
			a.XML_Write(user1);
			
			switch(starterChoice) {
			
			case 1: 
				l.firstLogin();
				break;
			case 2:
				l.login();
				break;
			case 3: 
				l.exit();
				return;     // Interrompo il programma ed esco!
			default: 
				System.out.println("------------------\n");
				System.out.println("Scelta non ammissibile!"); 
				System.out.println("------------------\n");
				l.menuStarter();
			}
			
			// l.menuStarter();	
			// l.insertBook();
		
		
		}

	
		
		
		

}
