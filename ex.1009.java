

import java.io.IOException;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) throws IOException {
			Scanner ler = new Scanner (System.in);

			String nome;
			double vendas,salario,total;
	
			nome = ler.next();
			salario = ler.nextDouble();
			vendas = ler.nextDouble();
	
			total = salario + (vendas/100 * 15);
			
			  System.out.printf("TOTAL = R$ %.2f\n", total );
			  ler.close();
			
	  }
	}
	 

















