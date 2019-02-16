package atividadeII;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		System.out.println("Digite um numero de 1 à 7:");
		int n=entrada.nextInt();
		if(n>=1 && n<=7) {
			if(n==1){System.out.println("Domingo");}
			else {
				if(n==2){System.out.println("Segunda");}
				else {
					if(n==3) {System.out.println("Terça");}
					else {
						if(n==4) {System.out.println("Quarta");}
						else {
							if(n==5) {System.out.println("Quinta");}
							else {
								if(n==6) {System.out.println("Sexta");}
								else {
									if(n==7) {System.out.println("Sábado");}
								}}}}}} 
		}System.out.println("Valor invalido");
		entrada.close();
	}
}
