package AtividadeIII;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
	int valor;
    Scanner entrada=new Scanner(System.in);
    System.out.println("Digite um valor...");
    valor=entrada.nextInt();
    if(valor%2==0) {
    	for(int contador=0;contador<5;contador++) {   		
//    		valor=valor+1;
//    		if(valor%2==0)
    		valor+=2;
    		System.out.println(valor);
    	}
    }
    entrada.close();
	}

}
