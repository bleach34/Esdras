package exercicios2;

import java.util.Scanner;

public class mostrar_maior_valor {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("digite primeiro valor...");
		int valor1 = entrada.nextInt();
		System.out.println("digite segundo valor...");
		int valor2 = entrada.nextInt();

		if(valor1 == valor2) {
			System.out.println("\nOs valores são iguais...");
		}else{
			if(valor1 > valor2)	{
				System.out.println("\nO valor "+valor1+" é maior que "+valor2);	
			}else{ 
				System.out.println("\nO valor "+valor2+" é maior que "+valor1);
			}

		}
	}
}




