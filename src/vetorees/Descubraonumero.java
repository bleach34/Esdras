/* 1º Gerar nº vandomico;
		2ºLer uma entrada;
		3ºverificar se a entrada é quente ou fria, muito quente ou fria se a diferença estiver entre +5 ou -5;
		4ºParabenizar o usuário quando ele acertar*/
package vetorees;

import java.util.Random;
import java.util.Scanner;

public class Descubraonumero {

	public static void main(String[] args) {
		Random random= new Random();
		int escolha=random.nextInt(10)+1;
		Scanner entrada= new Scanner(System.in);
		int escolhaUsuario=0;
		System.out.println("Valor:"+escolha);
		while(escolhaUsuario!=escolha) {
			System.out.println("Digite um valor...");
			escolhaUsuario=entrada.nextInt();
			if(escolhaUsuario>escolha) {
				if((escolhaUsuario-escolha)<5) {
					System.out.println("Esta muito perto, um pouco mais frio");
				}	
				else {
					System.out.println("Esta quente demais");
				}
			}
			if(escolhaUsuario<escolha) 
				if((escolha-escolhaUsuario)<5) {
					System.out.println("Esta muito perto, um pouco mais quente");
				}
				else {
					System.out.println("Esta frio demais");
				}

		}
		System.out.println("Você acertou");
		entrada.close();
	}

}
