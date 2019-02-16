package exercicios2;

import java.util.Scanner;

public class media_ponderada {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		System.out.println("Digite o nome");
		String nome=entrada.nextLine();
		System.out.println("Digite 4 notas:");    
		double n1=entrada.nextInt();
		double n2=entrada.nextDouble();
		double n3=entrada.nextDouble();
		double n4=entrada.nextDouble();

		double media= (n1+n2+n3+n4)/4;

		System.out.println(nome+"\nDigite as faltas:");
		int nF=entrada.nextInt();
		nF= nF*60/100;
		if(nF<60) {
			if(media>=9.1 && media<=10)
				System.out.println(nome+"\nTirou A");
			else {
				if(media>=6.1 && media<=9) System.out.println(nome+"\nTirou B");
				else {
					if(media>=4.1 && media<=6)System.out.println(nome+"\nTirou C \nAluno em recuperação");
					else {
						if(media>=3.1 && media<=4)System.out.println(nome+"\nTirou D \nAluno em recuperação");
						else {System.out.println(nome+"\nTirou E \nAluno em recuperação");
						} 
					}
				}
			}
		}else System.out.println(nome+" O aluno esta retido por faltas");

	}
}

