package atividadeII;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		System.out.println("Digite a temperatura:");
		int numero=entrada.nextInt();
		if(numero<=18) {
			System.out.println("Hoje está frio");
		}else {
			if(numero>18 && numero<=23) {
				System.out.println("Hoje está um clima agradável");
			} else {
				if(numero>23 && numero <=35){
					System.out.println("Hoje está um clima quente");
				}
				else {
					if(numero>35) {
						System.out.println("Hoje esta muito quente");
					}
				}
			}
		}
		entrada.close();
	}
}
