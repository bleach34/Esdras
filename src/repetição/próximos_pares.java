package repeti��o;

import java.util.Scanner;

public class pr�ximos_pares {

	public static void main(String[] args) {
	 int valor;
	 Scanner entrada = new Scanner(System.in);
	 System.out.println("Digite um valor..");
	 valor = entrada.nextInt();
	 if(valor % 2 == 0) 
		 for(int i = 0; i<5;i++) {
				System.out.println("Os pr�ximos cinco pares s�o:"+(valor+=2));
		 }else {
			 System.out.println("Este n�mero � �mpar...");
		 }
	}

}
