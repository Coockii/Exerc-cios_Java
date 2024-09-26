
import java.io.IOException;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) throws IOException {
          Scanner ler = new Scanner (System.in);

          int maior=0,menor=0;
  
          int a = ler.nextInt();
          int b = ler.nextInt();
          int c = ler.nextInt();
  
          if (a > b && a > c && b > c){
              System.out.printf("%d\n%d\n%d\n",c,b,a);
              System.out.printf("\n");
              System.out.printf("%d\n%d\n%d\n",a,b,c);
          }
          if (a > b && a > c && c > b){
              System.out.printf("%d\n%d\n%d\n",b,c,a);
              System.out.printf("\n");
              System.out.printf("%d\n%d\n%d\n",a,b,c);
          }
          if (b > a && b > c && a > c){
              System.out.printf("%d\n%d\n%d\n",c,a,b);
              System.out.printf("\n");
              System.out.printf("%d\n%d\n%d\n",a,b,c);
          }
          if (b > c && b > a && c > a){
              System.out.printf("%d\n%d\n%d\n",a,c,b);
              System.out.printf("\n");
              System.out.printf("%d\n%d\n%d\n",a,b,c);
          }
          if (c > b && c > a && a > b){
              System.out.printf("%d\n%d\n%d\n",b,a,c);
              System.out.printf("\n");
              System.out.printf("%d\n%d\n%d\n",a,b,c);
          }
          if (c > b && c > a && b > a){
              System.out.printf("%d\n%d\n%d\n",a,b,c);
              System.out.printf("\n");
              System.out.printf("%d\n%d\n%d\n",a,b,c);
          }
          
        
          ler.close();
      }
  }