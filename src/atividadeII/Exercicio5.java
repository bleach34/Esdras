package atividadeII;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		System.out.println("Digite o 1� valor:");
		int n1= entrada.nextInt();
		System.out.println("Digite o 2� valor:");
		int n2=entrada.nextInt();
		System.out.println("Digite o 3� valor:");
		int n3=entrada.nextInt();

		if(n1>n2 && n1>n3) {
			System.out.printf("%d � o maior numero",n1);
		}else {
			if(n2>n1&& n2>n3) {
				System.out.printf("%d � o maior numero",n2);
			}else {
				if(n3>n1&& n3>n2){
					System.out.printf("%d � o maior numero",n3);
				}
			}
		}entrada.close();
	}
}
