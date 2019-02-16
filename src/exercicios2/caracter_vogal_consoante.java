package exercicios2;

import java.util.Scanner;

public class caracter_vogal_consoante {

	public static void main(String[] args) {
		
		System.out.println("Digite um caracter..");
		Scanner in = new Scanner(System.in);

		String valor = in.nextLine();
		char caracter = valor.charAt(0);
		
		switch(caracter) {
		case'a':
		case'e':
		case'i':
		case'o':
		case'u':
			System.out.println(caracter+ "É uma vogal.");
			break;
		case'0':
		case'1':
		case'2':
		case'3':
		case'4':
		case'5':
		case'6':
		case'7':
		case'8':
		case'9':
			System.out.println(caracter+ "É um algarismo.");
			break;
			default:
				System.out.println(caracter+ "É uma consoante ou caracter especial.");
				break;
		}
	}

}
