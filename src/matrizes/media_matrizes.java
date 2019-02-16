package matrizes;
import java.util.Random;
import java.util.Scanner;
public class media_matrizes {

	public static void main(String[] args) {
		

				Scanner in = new Scanner(System.in);
		        int notas[][] = new int[4][5];
				String aluno[] = new String[notas.length];
			    double media[] = new double[notas.length];
	            double soma = 0;
	            
				for(int i = 0; i<notas.length;i++) { //controle de linhas
					System.out.println("Digite o nome do aluno:");//pede o nome dos alunos
					aluno[i] = in.nextLine();
				for(int j = 0; j<notas[0].length;j++) { // controle de colunas
			
				//Entrada aleatoria entre 1 e 10
					notas[i][j] = new Random().nextInt(10)+1;
					soma+= notas[i][j];
				}
				media[i] = soma/5; //soma dos muneros das lihas
					
				soma = 0;
			}
				//Escrita de matriz
				for (int i = 0; i<notas.length; i++) {
					System.out.print(aluno[i]+":\t");//mostra o nome dos alunos
					for(int j = 0; j<notas[0].length; j++) {
						System.out.print(notas[i][j]+"\t");
					}
					System.out.println("media: "+media[i]);
				
					System.out.println();
				}
				
				in.close();
			}

	
	}
		


	


