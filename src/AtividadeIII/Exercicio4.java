package AtividadeIII;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);

		int soma = 0, valor = 0;

		for(int contador=0; contador<10;contador++) {
			System.out.println("digite um valor...");
			valor = entrada.nextInt();
			soma += valor;

		}
		System.out.println("Soma: "+soma);

		entrada.close();}
}


