
import java.io.IOException;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) throws IOException {
	    	Scanner ler = new Scanner (System.in);

			int x=0,i=0;
			float soma=0;
	
			while(x >= 0){
				x = ler.nextInt();
				if(x>0){
					soma = soma + x;
					i +=1;
				}
			}
			soma = soma/i;
			System.out.printf("%.2f\n",soma);
	
	
			ler.close();
		}
	}