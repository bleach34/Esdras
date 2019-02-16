package matrizes;
import java.util.Random;
import java.util.Scanner;
public class ExemploMatriz {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int notas[][] = new int[5][7];
		String aluno[] = new String[notas.length];
		
//System.out.printf("notas[] []	tem %d linhas e %d colunas.\n", notas.lenght,notas[0].lenght);
		
		
//Leitura de matriz
		for(int i = 0; i<notas.length;i++) { //controle de linhas
			System.out.println("Digite o nome do aluno:");
			aluno[i] = in.nextLine();
		for(int j = 0; j<notas[0].length;j++) { // controle de colunas
		//		System.out.printf("notas[%d][%d]=",(i+1),(j+1));
		//		notas[i][j]= in.nextInt();
			
			//Entrada aleatoria entre 1 e 10
			notas[i][j] = new Random().nextInt(10)+1;
			

			}
		}
		//Escrita de matriz
		for (int i = 0; i<notas.length; i++) {
			System.out.print(aluno[i]+":\t");
			for(int j = 0; j<notas[0].length; j++) {
				System.out.print(notas[i][j]+"\t");
			}
			System.out.println();
		}
		
		in.close();
	}
}


