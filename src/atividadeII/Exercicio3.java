package atividadeII;
import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		System.out.println("Digite um numero");
		int numero= entrada.nextInt();
		if(numero%2==0) {
			System.out.println("O numero digitado � par");
		}else System.out.println("O numero digitado � �mpar");
		entrada.close();
	}
}
