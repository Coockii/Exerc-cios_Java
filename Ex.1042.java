import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    public static void main(String[] args) {
    int maior=0,menor=0,meio=0,n1,n2,n3;
        Scanner ler = new Scanner (System.in);
   
        System.out.println("Digite 3 numeros inteiros");
        System.out.printf("Digite o 1º número:\n ");
        n1= ler.nextInt();
        System.out.printf("Digite o 2º número:\n ");
        n2= ler.nextInt();
        System.out.printf("Digite o 3º número:\n ");
        n3= ler.nextInt();
    

    if(n1>n2 && n1>n3 && n2>n3){
    maior=n1;
    meio=n2;
    menor=n3;
    }
    else if (n1>n2 && n1>n3 && n3>n1){
      maior=n1;
      meio=n3;
      menor=n2;
    }
    else if (n3>n2 && n3>n1 && n2>n1 ){
      maior=n3;
      meio=n2;
      menor=n1;
    }
     else if(n3>n2 && n3>n1 && n1>n2){
      maior=n3;
      meio=n1;
      menor=n2;
    }
    
    else if (n2>n1 && n2>n3 && n3>n1){
      maior=n2;
      meio=n3;
      menor=n1;
    }
   
    else if (n2>n1 && n2>n3 && n1>n3){
    maior=n2; 
    meio=n1;
    menor=n3;
    }
    System.out.printf(" %d\n %d\n %d",menor,meio,maior);
    }
}