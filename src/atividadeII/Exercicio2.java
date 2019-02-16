package atividadeII;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {

		Scanner entrada= new Scanner(System.in);


		System.out.println("Digite um numero entre 1 e 9");
		int numero= entrada.nextInt();
		if(numero>=1 && numero<=9){
			System.out.printf("O  valor %d  está  na  faixa  permitida",numero);
		}else {
			System.out.printf("O valor %d está  fora  da  faixa  permitida", numero);
		}entrada.close();
	}
}
