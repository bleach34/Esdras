package repeti��o;

import java.util.Scanner;

public class menor_valor {

	public static void main(String[] args) {
		int valor= 0;
		Scanner entrada = new Scanner (System.in);
		int menorvalor = Integer.MAX_VALUE;
		//Estrutura de repeti��o FOR
		for(int contador = 0; contador<10; contador++) {

			System.out.println("Digite o "+(valor+1)+"valor");
			valor = entrada.nextInt();
			//comparar o maior valor
			if(valor>menorvalor) {
				menorvalor=valor;
				System.out.println("Entrou um novo menor valor:"+menorvalor);
			}
			System.out.println("Maior:" +menorvalor);
		}	
		entrada.close();
		System.out.println("O menor valor foi"+menorvalor);
	}


}


