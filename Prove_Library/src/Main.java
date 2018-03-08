
public class Main {

	public static void main(String[] args) {
		
		
		int a = 10;
		int b = 0;
		
		try {
			
			int c = a/b;
			System.out.println("Il risultato è :" + c);
			
		} catch (ArithmeticException exc) {
			System.out.println("Divisione per Zero...");
		}

	}

}
