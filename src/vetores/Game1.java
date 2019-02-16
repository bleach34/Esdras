package vetores;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Game1 {

	public static void main(String[] args) {
		Random random = new Random();
		int valor = random.nextInt(1000)+1, escolha = 0;
		System.out.println("Valor:"+valor);
		Scanner in = new Scanner(System.in);
		while(escolha != valor) {
			System.out.println("Chute um valor agora...");
			escolha = in.nextInt();
			if (escolha > valor) {
				if((escolha - valor) < 5) {
					System.out.println("Chute passou muito perto, um pouco menos");
				}else {
					System.out.println("Chute alto");
				}
			}else if (escolha < valor) {
				if((valor - escolha) < 5) {
					System.out.println("Chute passou muito perto, um pouco mais");
				}else {
					System.out.println("Chute baixo");
				}
			}else {
				System.out.println("Chute certeiro!\n\nFim de jogo!");
				JOptionPane.showMessageDialog(null,"Chute certeiro!\nFim de jogo!");
			}
		}
		in.close();

	}

}
