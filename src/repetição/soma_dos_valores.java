package repeti��o;

import java.util.Scanner;

public class soma_dos_valores {

	public static void main(String[] args) {
		int valor;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite um valor...");
		valor = entrada.nextInt();

		for(int i =valor; i<valor+10;i++) {

			System.out.println("Os dez pr�ximos valores s�o:"+i);
		}
	}	

}


