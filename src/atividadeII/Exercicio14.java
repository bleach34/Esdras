package atividadeII;

import java.util.Scanner;

public class Exercicio14 {


	public static void main(String [] args) {
	Scanner entrada= new Scanner(System.in);
	System.out.println("Digite o valor A:");
	int A= entrada.nextInt();
	System.out.println("Digite o valor B:");
	int B= entrada.nextInt();
	System.out.println("Digite o valor C:");
	int C= entrada.nextInt();
	
	
	double equa��osegundograu = Math.pow(B, 2)-4*A*C;
	
	System.out.println("A equa��o vale:"+equa��osegundograu);
    entrada.close();
	}	
}
