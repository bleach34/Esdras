package exercicios2;

import java.util.Scanner;

public class temperatura {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a temperatura atual:");
		float temperatura = entrada.nextFloat();

		if(temperatura <=18 ) {
			System.out.println("\nO clima � frio.");
		}else {
			if(temperatura >=19 && temperatura <=23) {
				System.out.println("\nO clima � agrad�vel.");
			}else {
				if(temperatura >=19 && temperatura <=23) {
					System.out.println("\nO clima � agrad�vel.");

				}else {
					if(temperatura >=24 && temperatura <=35) {
						System.out.println("\nO clima � quente.");
					}else {
						if(temperatura>35) {
							System.out.println("\nO clima � muito quente.");	
						}
					}

				}
			}
		}
	}
}
