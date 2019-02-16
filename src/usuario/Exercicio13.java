package usuario;

import java.util.Scanner;

public class Exercicio13 {
       public static void main(String[] args) {
    	   Scanner entrada= new Scanner(System.in);
    	   System.out.println("Digite o primeiro valor:");
    	   int valor1=entrada.nextInt();
    	   
    	   System.out.println("Digite o segundo valor:");
    	   int valor2=entrada.nextInt();
    	   
    	   int soma= valor1+valor2;
    	   int subtracao=valor1-valor2;
    	   float divisao=valor1/valor2;
    	   int multiplicacao=valor1*valor2;
    	   System.out.printf("%d + %d = %d \n", valor1, valor2, soma);
    	   System.out.printf("%d - %d = %d \n", valor1, valor2, subtracao);
    	   System.out.printf("%d / %d = %d \n", valor1, valor2, divisao);
    	   System.out.printf("%d * %d = %d \n", valor1, valor2, multiplicacao);
    	   entrada.close();
       }
}
