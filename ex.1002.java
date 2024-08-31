

import java.util.*;
import java.lang.*;
import java.io.*;


public class Main
{
	public static void main(String[] args) {
        double pi = 3.14159265359;
        double raio,area;

        Scanner ler = new Scanner (System.in);

        raio = ler.nextFloat();
        area = pi * (raio * raio);

        System.out.println("A=" + area);
	}
}

















