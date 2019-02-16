package AtividadeIII;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);


		int soma =0;

		for(int contador=0; contador<10;contador++) 
		{
			System.out.println("digite um valor...");
			int valor = entrada.nextInt();
			if(valor%2==0) { 
				valor=1;
				soma=soma+valor;

				
			}
			
		}System.out.println(soma);

		entrada.close();
	}	

}
