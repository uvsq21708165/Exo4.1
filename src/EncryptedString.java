
public class EncryptedString {
	private int decalage;
    private String chainecryptee;

  
    
    //Constructeur de la classe 
    
    public EncryptedString(int d, String c)
    {
        if(c==null) {chainecryptee="chainevide";}   //si la chaine est vide afficher chaine vide
        else    //sinon
        {
        this.decalage=d;
        int i;
        char ch;
        String decryptee="";
        
        for(i=0;i<c.length();i++)
        {
            ch=decaleCaractere(c.charAt(i),decalage);
            decryptee+=ch;
        }
        this.chainecryptee=decryptee;
     

        }
    }
    
  ////////////////////////////////////////////////////////////////////////////////////////////
     public static EncryptedString FromCrypted(String incrypted, int decal)
    {
         int i;
        char c;
        String clr="";
        
            
        
        for(i=0;i<incrypted.length();i++)
        {
            c=decaleCaractere(incrypted.charAt(i),(26-decal));
            clr+=c;
        }
        
        return new EncryptedString(decal,clr);
    }
     
  //////////////////////////////////////////////////////////////////////////////////////////////////
    
    public static EncryptedString FromDecrypted( String indecrypted, int decal)
    {
        return new EncryptedString (decal,indecrypted);
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////
    
    
    
    //methode decrypter
    
    public String Decrypt()
    {
        int i;
        char c;
        String decryptee="";
        
            
        
        for(i=0;i<chainecryptee.length();i++)
        {
            c=decaleCaractere(chainecryptee.charAt(i),(26-decalage));
            decryptee+=c;
        }
        return decryptee;
    }
    
    //methode crypter
    public String encrypt()
    {
        return chainecryptee;
    }
    
    private static char decaleCaractere (char c, int decalage)
    {
        return ( c < 'A' || c > 'Z') ? c : (char)(( (c - 'A' + decalage) % 26) + 'A');
    }
}




