package exercicios2;

import java.util.Scanner;

public class divisao_por_4_e_5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("digite um valor qualquer...");
		int valor = entrada.nextInt();
		
		if(valor % 4 == 0 && valor % 5 ==0) 
		{
			System.out.println("O valor é divisível poe 4 e 5");
		}
		else
		{
		System.out.println("O valor não é divisível por 4 e 5");	
		}
		
	}
	
}
