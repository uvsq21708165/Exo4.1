import java.util.Scanner;

public class Main {
	private final static Scanner CLAVIER = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	String chainecryptee; int decalage;

			System.out.print("Quelle est le message en claire ? ");
			chainecryptee = CLAVIER.nextLine();
			
	        System.out.print("Quelle est la valeur du décalge? ");
			decalage = CLAVIER.nextInt();
			
			
			EncryptedString c1= new EncryptedString(decalage,chainecryptee);
		
			   System.out.println(EncryptedString.FromDecrypted(chainecryptee, decalage));
		        System.out.println(EncryptedString.FromCrypted(chainecryptee, decalage));
				
	        System.out.println(c1.encrypt());
	        System.out.println(c1.Decrypt());
	     
	}

}
