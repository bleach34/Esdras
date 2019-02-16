package repetição;

import java.util.Scanner;

public class próximos_pares {

	public static void main(String[] args) {
	 int valor;
	 Scanner entrada = new Scanner(System.in);
	 System.out.println("Digite um valor..");
	 valor = entrada.nextInt();
	 if(valor % 2 == 0) 
		 for(int i = 0; i<5;i++) {
				System.out.println("Os próximos cinco pares são:"+(valor+=2));
		 }else {
			 System.out.println("Este número é ímpar...");
		 }
	}

}
