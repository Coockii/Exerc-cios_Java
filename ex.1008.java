

import java.util.*;
import java.lang.*;
import java.io.*;


public class Main
{
	public static void main(String[] args) {
	 int number,horas; 
        float salario,result;
	  
	  Scanner ler = new Scanner (System.in);
	  
	  number = ler.nextInt();
	  horas = ler.nextInt();
        ler.nextLine();
	  salario = ler.nextInt();
	  
	  
	  result = salario * horas;
	  System.out.printf("SALARY = U$ %.2f " , result); 
	}
}

















