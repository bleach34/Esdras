package exercicios2;

import java.util.Scanner;

public class dia_da_semana {

	public static void main(String[] args) {
		System.out.println("Digite um n�mero de 1 a 7..");
		Scanner in = new Scanner(System.in);

		int valor = in.nextInt();
		switch (valor) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-feira");
			break;
		case 3:
			System.out.println("Ter�a-feira");
			break;
		case 4:
			System.out.println("Quarta-feira");
			break;
		case 5:
			System.out.println("Quinta-feira");
			break;
		case 6:
			System.out.println("Sexta-feira");
			break;
		case 7:
			System.out.println("S�bado");
			break;
		default:
			System.out.println("Este n�o � um dia v�lido!");

		}


	}

}
