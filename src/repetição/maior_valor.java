package repetição;

import java.util.Scanner;

public class maior_valor {

	public static void main(String[] args) {
		int valor= 0;
		Scanner entrada = new Scanner (System.in);
		int maiorvalor = 0;
		//Estrutura de repetição FOR
		for(int contador = 0; contador<10; contador++) {
			
		System.out.println("Digite um valor:");
		valor = entrada.nextInt();
		//comparar o maior valor
		if(valor>maiorvalor) {
			maiorvalor=valor;
			System.out.println("Entrou um novo maior valor:"+maiorvalor);
			}
		System.out.println("Maior:" +maiorvalor);
		}	
	entrada.close();
 System.out.println("O maior valor foi"+maiorvalor);
  }
}


