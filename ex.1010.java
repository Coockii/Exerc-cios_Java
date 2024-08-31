

import java.util.*;
import java.lang.*;
import java.io.*;


public class Main
{
	public static void main(String[] args) {
	    int cod,qtd;
        float vpeca,total;
	  
	  Scanner ler = new Scanner (System.in);
	  
	  
        cod = ler.nextInt();
        qtd = ler.nextInt();
        ler.nextLine();
        vpeca = ler.nextFloat();
        total =  vpeca * qtd;

        
	  System.out.printf("VALOR A PAGAR: R$ %.2f " , total); 
	}
}

















