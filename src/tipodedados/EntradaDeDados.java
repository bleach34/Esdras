package tipodedados;

import java.util.Scanner;

public class EntradaDeDados {
	public static void main(String[] args ) {
		//Entrada de dados em Java

		//Cria��o de objeto da Classe Scanner
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um valor");
		//Leitura  de dados
		int valor = entrada.nextInt();

		System.out.println("Voc� digitou:" + valor);
		entrada.close();
	}
}
