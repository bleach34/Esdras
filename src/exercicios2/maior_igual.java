package exercicios2;

import java.util.Scanner;

public class maior_igual {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("digite um valor qualquer...");
		int valor = entrada.nextInt();
		
		if(valor>=1 & valor<=9) 
		{
			System.out.println("O valor esta na faixa permitida");
		}
		else
		{
		System.out.println("O valor esta fora da faixa permitida ");	
		}
	}
	
}
