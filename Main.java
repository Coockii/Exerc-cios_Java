import java.util.*;
import java.lang.*;
import java.io.*;


public class Main
{
	public static void main(String[] args) {
	    float n1,n2,media;
	    Scanner ler = new Scanner (System.in);
        
        n1 = ler.nextInt();

	    n2= ler.nextInt();
	    
	    
	    media = (n1+n2)/2;
	    System.out.printf("MEDIA = %.5f",media);
		
		
	}
}