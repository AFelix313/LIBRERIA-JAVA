package DataLayer;
import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


import Entity.*;


public class XML_Library implements Layer_Access_Dati {
	
	
	public static void XML_Read() {
	
	}
	
	
	public  void XML_Write(User utente) {
	
		
		try {

			
			
			DocumentBuilderFactory document_new = DocumentBuilderFactory.newInstance();

			DocumentBuilder documentBuilder = document_new.newDocumentBuilder();

			// Creo un Oggetto di tipo Document:
			Document document = documentBuilder.newDocument();


			Element library = document.createElement("Library");
			document.appendChild(library);
			
			Element users = document.createElement("Users");
			library.appendChild(users);
			
			Element user = document.createElement("User"); 
			
			// Imposto l'attributo di user, impostando l'attributo:
			user.setAttribute("UserId", String.valueOf(utente.getUserld())); // Accetta solo attributi
			                                                                 //e perci� uso il metodo di String
			user.setAttribute("Role", String.valueOf(utente.getRole()));
			user.setAttribute("Username", utente.getUsername());
			user.setAttribute("Password", String.valueOf(utente.getPassword()));
			
			users.appendChild(user); // appendo user
			
			// Decido io dove salvare il file XML:
			
			String xmlFilePath = "C:\\Users\\andrea.felici\\Desktop\\Libreria2.xml";
			
			// create the xml file:
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			//transform the DOM Object to an XML File:
			DOMSource domSource = new DOMSource(document);
			StreamResult streamResult = new StreamResult(new File(xmlFilePath));

	
			transformer.transform(domSource, streamResult);

			System.out.println("Done creating XML File");

		} catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		} catch (TransformerException tfe) {
			tfe.printStackTrace();
		}
	}

	@Override
	public void Login(String Userld, String Username) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Book> listBook(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Book> recoverySpecificBook(Book book) {
		// TODO Auto-generated method stub
		return null;
	}


	

	@Override
	public void newReservation(User u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delateReservatio(User u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean insertBook(Book book, User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateBook(Book book, User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delateBook(Book book, User user) {
		// TODO Auto-generated method stub
		return false;
	}
}

/*
 
public class {
	
	String file="XML";
	String path=System.getProperty("user.home")+"\\";
	File fileOut= new File(path+file);
	Library library;

public Store readStore() throws Exception{

 * 	Legge le informazioni serializzate e restituisce un oggetto Store che le contiene.		

		FileInputStream fileReader = new FileInputStream(path+file);
		ObjectInputStream objReader = new ObjectInputStream(fileReader);
		Store myStore = (Store)objReader.readObject();
		Store=myStore;
		objReader.close();
		return Store;
	}
	
	public void saveStore(Store s) throws Exception{

 * 	Serializza un oggetto Store preso in ingresso.		

		FileOutputStream fileWriter = new FileOutputStream(path+file);
		ObjectOutputStream objWriter = new ObjectOutputStream(fileWriter);
		objWriter.writeObject(Store);
		objWriter.close();
	}
	
}



*/
