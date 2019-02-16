package tipodedados;

import java.util.Scanner;


public class Exercicio5 {





	public static void main(String[] args)
	{

		Scanner entradaA = new Scanner(System.in);

		System.out.println("Digite um valor:");
		int valorA = entradaA.nextInt();


		System.out.println("Digite um valor:");
		int valorB = entradaA.nextInt();


		System.out.println("Digite um valor:");
		int valorC=entradaA.nextInt();
		System.out.println("você digitou:"+valorA +valorB +valorC);

		int final1= valorB + valorC;
		int final2= valorA * valorC;
		int final3= (valorA*valorA) + (valorB*valorB) + (valorC*valorC);
		int final4= (valorA+valorB+valorC) * (valorA+valorB+valorC);
		System.out.printf("\nA soma de %d + %d=%d", valorB,valorC,final1);
		System.out.printf("\nO produto de %d * %d=%d", valorA,valorC,final2);
		System.out.printf("\nA soma dos quadrados de %d, %d, %d =%d", valorA,valorB,valorC,final3);
		System.out.printf("\nO quadrado da soma de %d, %d, %d =%d", valorA,valorB,valorC,final4);

		//
		System.out.println("\n\nA soma de b+c: "+(valorB+valorC));
		System.out.println("O produto de a*c: "+(valorA*valorC));
		System.out.println("A soma dos quadrados de a,b e c: "+(Math.pow(valorA, 2)+ Math.pow(valorB, 2)+Math.pow(valorC, 2)));
		System.out.println("O quadrado da soma de a,b,c:"+(Math.pow(valorA+valorB+valorC, valorA+valorB+valorC)));

		entradaA.close();
	}
}
