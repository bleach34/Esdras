package tipodedados;

import java.util.Scanner;
public class Exercicio6 {
static public void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	System.out.println("Digite o valor total de votos:");
	int votosbrancos= entrada.nextInt();
	System.out.println("Digite a quantidade de votos nulos:");
	int votosnulos=entrada.nextInt();
	System.out.println("Digite numero total de eleitores:");
	int totalEleitores = entrada.nextInt();
	
	double porcentagemVotosBrancos=(votosbrancos*100D)/totalEleitores;
	double porcentagemVotosNulos=(votosnulos*100D)/totalEleitores;
	int votosValidos=totalEleitores-(votosbrancos+votosnulos);
	double porcentagemDeVotosValidos=(votosValidos*100)/totalEleitores;
	
	System.out.println("\n Total de eleitore:"+totalEleitores);
	System.out.printf("Votos brancos:\t%d-%.2f%%\n",votosbrancos, porcentagemVotosBrancos);
	System.out.printf("Votos nulos: \t%d-%.2f%%\n",votosnulos,porcentagemVotosNulos);
	System.out.printf("Votos válidos:\t%d-%.2f%%\n", votosValidos, porcentagemDeVotosValidos);
	
	entrada.close();
}
}
