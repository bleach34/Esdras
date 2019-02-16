package AtividadeIII;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int proximo_valor=0, valor_atual=0,valor_anterior=0; 
		System.out.println("Digite um valor:");
		valor_atual= entrada.nextInt();
		while(proximo_valor<=100) {
			proximo_valor=valor_atual+valor_anterior;
			System.out.print(proximo_valor+",");
			valor_anterior=valor_atual;
			valor_atual=proximo_valor;
		}
		
		entrada.close();
		}

}