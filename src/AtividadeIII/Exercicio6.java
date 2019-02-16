package AtividadeIII;

import java.util.Scanner;


public class Exercicio6 {
	public static void main(String args[]) {
		Scanner entrada= new Scanner(System.in);

		int pares=0;
		int multiplo3=0;
		for(int i=0; i<10;i++) {
			System.out.println("Digite um valor:");
			int valor=entrada.nextInt();
			
			if(valor%3==0) {
				multiplo3=valor;
				System.out.println("Os multiplos de 3 sâo "+multiplo3);
			}
			if(valor%2==0) {
				pares+=valor;
			}
			
		}
		
		System.out.println("A soma dos pares é:"+pares);

		entrada.close();	
	}
}


