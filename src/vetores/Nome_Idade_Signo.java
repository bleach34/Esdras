package vetores;

import java.util.Scanner;

public class Nome_Idade_Signo {

	public static void main(String[] args) {
		//Declarar o vetores/arrays
		String nome[] = new String[3];
		String idade[] = new String[3];
		String signo[] = new String[3];
		
		
		
		Scanner in = new Scanner(System.in);
		
		//Armazenamento de dados nos vetores
		
		for (int i = 0; i < signo.length; i++) {
			System.out.println("Digite o "+(i+1)+"° nome.");
			nome[i] = in.nextLine();
			System.out.println("Digite a idade de "+nome[i]);
			idade[i] = in.nextLine();
			System.out.println("Digite signo de "+ nome[i]);
			signo[i] = in.nextLine();
			
		}
		
		//Exibir os dados armazenados nos vetores
		System.out.println("\nDados armazenados\n");
		for (int i = 0; i< signo.length; i++) {
			System.out.printf("nome[%d] = %S\tidade[%d] = %S\tsigno[%d] = %S\n",
					i,nome[i],i,idade[i],i,signo[i]);
		}
         in.close();
	}

}
