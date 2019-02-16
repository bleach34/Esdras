package vetores;

import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Random random = new Random();
		for (int i = 0; i < 9; i++) { 
			int escolha = random.nextInt(10)+1;
			Scanner in = new Scanner(System.in);
			int escolhausuario = 0;
			while(escolhausuario != escolha) {
				System.out.println("Digite um valor...");
				escolhausuario = in.nextInt();
				
			}
			System.out.println("Você acertou!");
			in.close();
		}

	}

}
