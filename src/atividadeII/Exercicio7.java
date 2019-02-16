package atividadeII;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		System.out.println("Digite o 1º valor:");
		int n1= entrada.nextInt();
		System.out.println("Digite o 2º valor:");
		int n2=entrada.nextInt();
		System.out.println("Digite o 3º valor:");
		int n3=entrada.nextInt();

		if(n1 != n2 && n1!=n3 && n2!=n3) {
			if(n1<n2 && n2<n3) {System.out.println("Numeros em ordem crescente:"+n1+n2+n3);} 
			else {
				if(n2<n1 && n1<n3) {System.out.println("Numeros em ordem crescente:"+n2+n1+n3);}

				else {
					if(n3<n1 && n1<n2) {System.out.println("Numeros em ordem crescente:"+n3+n1+n2);} 

					else { if(n1<n2 && n3<n2) {System.out.println("Numeros em ordem crescente:"+n1+n3+n2);} 

					else { if(n3<n2 && n2<n1) {System.out.println("Numeros em ordem crescente:"+n3+n2+n1);}
					else
					{System.out.println("Numeros em ordem crescente:"+n2+n3+n1);}

					}
					}
				}
			}
		}
		entrada.close();


	}
}
