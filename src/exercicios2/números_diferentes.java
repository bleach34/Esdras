package exercicios2;

import java.util.Scanner;

public class n�meros_diferentes {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite tr�s valores diferentes...");
		int valor1 = in.nextInt();
		int valor2 = in.nextInt();
		int valor3 = in.nextInt();
		
		if(valor1 != valor2 && valor1 != valor3 && valor2 != valor3) {
			System.out.println("Diferentes");
		}else {
			System.out.println("Alguns s�o iguais...");
		}

	}

}
