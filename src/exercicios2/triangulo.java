package exercicios2;

import java.util.Scanner;

public class triangulo {
	public static void main(String [] args) {
		Scanner entrada= new Scanner(System.in);
		System.out.println("Digite o 1º lado do triângulo:");
		int A= entrada.nextInt();
		System.out.println("Digite o 2º lado do triângulo:");
		int B= entrada.nextInt();
		System.out.println("Digite o 3º lado do triângulo:");
		int C= entrada.nextInt();

		Boolean verificar = verificarValidade(A, B, C);
		System.out.println(""+verificar);
	}
	public static Boolean verificarValidade(int A,int B,int C) {

		if (A <B+C && B < A+B && C < A+B)
		{
			if (A == B && B == C)
			{
				System.out.println(" O triângulo é equilátero ");
				return true;
			}
			else
			{
				if (A == B || A == C || B == C)
				{
					System.out.println(" O triângulo é isósceles");
					return true;
				}
				else
				{
					System.out.println("o triângulo é escaleno");
					return true;
				}
			} } return false;
	}
}

	

