package matrizes;

import java.util.Random;
import java.util.Scanner;

public class media {



	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int notas[][]=new int[2][8];
		String aluno[]=new String[notas.length];
		int soma=0;



		for (int i = 0; i < notas.length; i++) {			
			System.out.printf("Digite %d nomes:",i);
			aluno[i]=entrada.nextLine();

			for (int j = 0; j < notas[0].length-1; j++) {

				notas[i][j]=new Random().nextInt(10)+1;
				soma+=notas[i][j];					
			}
			notas[i][7]=soma/7;			
			soma=0;
		}

		for (int i = 0; i < notas.length; i++) {
			System.out.println(aluno[i]+":\t");

			for (int j = 0; j < notas[0].length-1; j++) {				
				System.out.print(notas[i][j]+"\t");
			}
			System.out.printf("MEDIA: %.1f\n", Float.valueOf(notas[i][7]));
		}
		entrada.close();
	}

}
