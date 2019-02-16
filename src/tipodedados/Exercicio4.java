package tipodedados;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in );
      System.out.println("Digite um valor:");
      int valor= entrada.nextInt() ;
      int  antecessor = valor-1;
      int  sucessor = valor+1;
      System.out.println("Você digitou:"+ valor);      

      System.out.printf("O antecessor de %d é %d, seu sucessor é %d.\n",valor,antecessor,sucessor);

      //Expressões
      System.out.println("\nAntecessor:" + (valor-1));
      System.out.println("Sucessor:" + (valor+1));
      
      //Incrementos
      System.out.println("\nAntecessor:" + --valor);
      System.out.println("Antecessor:" + (valor+=2));
      entrada.close();
	}

}
