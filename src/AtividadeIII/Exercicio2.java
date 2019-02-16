package AtividadeIII;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int valor;
		Scanner entrada= new Scanner(System.in);
		System.out.println("Digite um valor...");
   	    valor=entrada.nextInt();

         for(int contador=valor; contador<valor+10; contador++) {
        	 
        	// valor=valor+1;
        	 System.out.println(contador);
         }
         entrada.close();

	}

}
