package repetição;

import java.util.Scanner;

public class PrimeiroExer {
	public static void main(String[] args) {
		int valor=0;
		Scanner entrada= new Scanner(System.in);
		int maiorValor=0;

		for(int contador=0; contador<10;contador++) {
			System.out.println("Digite um valor...");
			valor=entrada.nextInt();	
			if(valor>maiorValor) {
				maiorValor=valor;
			}
			System.out.println("Maior:"+maiorValor);
		}
		System.out.println("O maior foi "+maiorValor);
		entrada.close();

	}
}

