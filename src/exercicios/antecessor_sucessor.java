package exercicios;

import java.util.Scanner;


public class antecessor_sucessor {
	public static void main(String[] args) {
	//leitura de dados
	Scanner entrada = new Scanner (System.in);
	System.out.println("digite um valor qualquer...");
	int valor = entrada.nextInt();
	System.out.println("Voce digitou: "+valor);
	
	System.out.println("Antecessor:"+ --valor);
	System.out.println("Sucessor: " +(valor+=2));
	System.out.println("Valor: "+(valor));
	

}
	
}