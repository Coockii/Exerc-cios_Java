

import java.util.*;
import java.lang.*;
import java.io.*;


public class Main
{
	public static void main(String[] args) {
	  String nome;
        float salario,vendas,result;
	  
	  Scanner ler = new Scanner (System.in);
	  
	  nome = ler.next();
        ler.nextLine();
	  salario = ler.nextFloat();   
	  vendas = ler.nextFloat();
	  
	  
	  result = salario + (vendas/100 * 15);
	  System.out.printf("TOTAL = R$ %.2f " , result); 
	}
}

















