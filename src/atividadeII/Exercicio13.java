package atividadeII;
import java.util.Scanner;
public class Exercicio13 {
	public static void main(String [] args) {
		Scanner entrada= new Scanner(System.in);
		System.out.println("Digite o 1� lado do tri�ngulo:");
		int A= entrada.nextInt();
		System.out.println("Digite o 2� lado do tri�ngulo:");
		int B= entrada.nextInt();
		System.out.println("Digite o 3� lado do tri�ngulo:");
		int C= entrada.nextInt();

		Boolean verificar = verificarValidade(A, B, C);
		System.out.println(""+verificar);
		entrada.close();
	}
	public static Boolean verificarValidade(int A,int B,int C) {

		if (A<B+C && B < A+B && C< A+B)
		{
			if (A == B && B == C)
			{
				System.out.println(" O tri�ngulo � equil�tero ");
				return true;
			}
			else
			{
				if (A == B || A == C || B == C)
				{
					System.out.println(" O tri�ngulo � is�sceles");
					return true;
				}
				else
				{
					System.out.println("o tri�ngulo ser� escaleno");
					return true;
				}
			} } return false;
	}
}
