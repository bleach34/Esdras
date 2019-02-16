package exercicios2;

import java.util.Scanner;

public class par_ou_impar {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("digite um valor qualquer...");
		int valor = entrada.nextInt();
		
		if(valor % 2==0) 
		{
			System.out.println("O valor é um número par");
		}
		else
		{
		System.out.println("O valor é um número ímpar");	
		}
   }
}
          