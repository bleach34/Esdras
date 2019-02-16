package atividadeIV;

import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
		int vetor[]=new int[15];
		Scanner entrada=new Scanner(System.in);
		for (int j = 0; j < vetor.length; j++) {
			System.out.println("Digite os valores:");
			vetor[j]=entrada.nextInt();
		}
		for (int j = 0; j < vetor.length; j++) {
			System.out.println(vetor[j]+"\t");
		}
		entrada.close();
	}
}