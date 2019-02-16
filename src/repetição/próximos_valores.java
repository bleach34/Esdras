package repetição;

import java.util.Scanner;

public class próximos_valores {

	public static void main(String[] args) {
	  int valor;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite um valor...");
		valor = entrada.nextInt();
		
	for(int i =valor; i<valor+11;i++) {
	System.out.println("Os dez próximos valores são:"+i);
	}
 }
}
