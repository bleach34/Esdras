package exercicios2;

import java.util.Scanner;

public class ordem_crescente {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro valor.");
		int valor1 = entrada.nextInt();

		System.out.println("Digite o segundo valor");
		int valor2 = entrada.nextInt();

		System.out.println("Digite o terceiro valor");
		int valor3 = entrada.nextInt();

		if(valor1<valor2 && valor2<valor3) {
			System.out.println("\nOrdem crescente:"+valor1+"-"+valor2+"-"+valor3+"");

		}else {
			if(valor2<valor1 && valor1<valor3) {
				System.out.println("\nOrdem crescente:"+valor2+"-"+valor1+"-"+valor3+"");
			}else {
				if(valor3<valor2 && valor2<valor1) {
					System.out.println("\nOrdem crescente:"+valor3+"-"+valor2+"-"+valor1+"");
				}else {
					if(valor2<valor3 && valor3<valor1) {
						System.out.println("\nOrdem crescente:"+valor2+"-"+valor3+"-"+valor1+"");
					}else {
						if(valor1<valor3 && valor3<valor2) {
							System.out.println("\nOrdem crescente:"+valor1+"-"+valor3+"-"+valor2+"");
						}else {
							if(valor3<valor1 && valor1<valor2) {
								System.out.println("\nOrdem crescente:"+valor3+"-"+valor1+"-"+valor2+"");
							}else {
							}
						}
					}


				}
			}

		}



	}

}
