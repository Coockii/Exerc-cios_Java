

import java.io.IOException;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) throws IOException {
          Scanner ler = new Scanner (System.in);

          int cod,qtd,cod2,qtd2;
          float valor,valor2,total;
  
          // Produto 1 - codigo, qtd e valor(por peça)
          cod = ler.nextInt();
          qtd = ler.nextInt();
          valor = ler.nextFloat();
  
           // Produto 2 - codigo, qtd e valor(por peça)
          cod2 = ler.nextInt();
          qtd2 = ler.nextInt();
          valor2 = ler.nextFloat();
  
          total = (valor*qtd) + (valor2*qtd2);
  
          System.out.printf("VALOR A PAGAR: R$ %.2f\n",total);
          
          ler.close();
    }
  }

















