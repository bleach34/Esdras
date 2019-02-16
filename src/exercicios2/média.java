package exercicios2;

import java.util.Scanner;

public class média {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite um nome...");
		String nome = entrada.nextLine();

		System.out.println("Digite as notas:");
		int n1 = entrada.nextInt();
		int n2 = entrada.nextInt();
		int n3 = entrada.nextInt();
		int n4 = entrada.nextInt();

		double media = (n1+n2+n3+n4)/4;

		System.out.println("Digite as faltas:");
		int faltas = entrada.nextInt();
		if(faltas<60) {
			if(media>=7)
				System.out.println(nome+"\nsua média é "+media+"\nVocê tem "+faltas+"\nVocê está aprovado!");

			else {
				if(media>=5 && media<=7)System.out.println(nome+"\nsua média é"+media+"\nVocê tem "+faltas+"\nVocê está em exame!");
				else {
					System.out.println(nome+"\nsua média é "+media+"\nVocê tem "+faltas+"\nVocê está reprovado!");
					}
			}
		}else System.out.println(nome+"\nsua média é "+media+"\nVocê tem "+faltas+"\nVocê está reprovado por faltas!");

	}
}
