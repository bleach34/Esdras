package vetores;

import java.util.Scanner;

public class Nome_Idade_Signo1 {
	public static void main(String[] args) {
		//Declarar o vetores/arrays
		
		
		String nome[] = {"Lucas","David","Elivelton","Jackson","Victor"};
		int idade[] = {18,22,21,18,19};
		String signo[] = {"Cancer","Peixes","Leão","Aquário","Libra"};
		
		
		Scanner in = new Scanner(System.in);
	
	
		
		//Exibir os dados armazenados nos vetores
		System.out.println("\nDados armazenados\n");
		for (int i = 0; i< signo.length; i++) {
			System.out.printf("nome = %S \tidade = %S \tsigno= %S\n",
				nome[i],idade[i],signo[i]);

		}
         in.close();

	}
}




