package atividadeII;
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		System.out.println("Digite o primeiro valor");
		int numero= entrada.nextInt();
		System.out.println("Digite o segundo valor");
		int numero2=entrada.nextInt();

		if(numero>numero2)  {

			System.out.printf("O %d é maior que %d",numero,numero2);

		}else {
			if(numero2>numero){
				System.out.printf("O %d é maior que %d",numero2,numero);
			}   else {System.out.println("O numero é igual");}
		}entrada.close();
	}
}
