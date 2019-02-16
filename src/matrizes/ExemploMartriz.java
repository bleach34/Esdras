package matrizes;

import java.util.Random;
import java.util.Scanner;

public class ExemploMartriz {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int notas[][]=new int[5][3];
		String aluno[]= new String[notas.length];
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite o nome do aluno.:");
			aluno[i]=entrada.nextLine();
			for (int j = 0; j < notas[0].length; j++) {/*
				System.out.printf("notas[%d][%d]=",(i+1),(j+1));
				notas[i][j]=entrada.nextInt();*/
				notas[i][j]=new Random().nextInt(10)+1;			
			}
		}
		for (int i = 0; i < notas.length; i++) {
			System.out.print(aluno[i]+":\t");
			for (int j = 0; j < notas[0].length; j++) {
				System.out.print(notas[i][j]+"   ");
			}
			System.out.println();
		}		
		entrada.close();
	}
}
