package tipodedados;
import java.util.Scanner;

public class EntradaDeDado {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um valor:");
		int valor = entrada.nextInt();
		System.out.println("você digitou:"+valor);
		entrada.close();   
	}
}
