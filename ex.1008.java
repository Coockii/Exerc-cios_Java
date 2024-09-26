

import java.io.IOException;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) throws IOException {
			int number,horas; 
			float salario,result;
		  
		  Scanner ler = new Scanner (System.in);
		  
		  number = ler.nextInt();
		  horas = ler.nextInt();
		  salario = ler.nextFloat();
		  
		  
		  result = salario * horas;
		  System.out.printf("NUMBER = %d\n",number);
		  System.out.printf("SALARY = U$ %.2f\n" , result); 
		  ler.close();
		}
	}















