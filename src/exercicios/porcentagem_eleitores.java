package exercicios;

import java.util.Scanner;

public class porcentagem_eleitores {
	public static void main (String[] args){
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor total de eleitores.");
		int totalEleitores = entrada.nextInt();
		
		System.out.println("Digite a quantidade de votos nulos.");
		int votosNulos = entrada.nextInt();
		
		System.out.println("Digite a quantidade de votos brancos.");
		int votosBrancos = entrada.nextInt();
		
		double porcentagemvotosBrancos = (votosBrancos * 100D)/totalEleitores;
		double porcentagemvotosNulos = (votosNulos * 100D)/totalEleitores;
		int votosValidos =totalEleitores - (votosBrancos+votosNulos);
		double porcentagemVotosValidos = (votosValidos * 100D)/totalEleitores;
		
		System.out.println("\nTotal de eleitores: "+totalEleitores);
		System.out.printf("Votos brancos: \t%d - %.2f%%\n",votosBrancos, porcentagemvotosBrancos);
		System.out.printf("Votos nulos: \t%d - %.2f%%\n",votosNulos, porcentagemvotosNulos);
		System.out.printf("Votos validos: \t%d - %.2f%%\n",votosValidos,porcentagemVotosValidos);
		
		
		}

}
