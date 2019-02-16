package atividadeII;
import java.util.Scanner;
public class Exercicio11 {
	public static void main(String [] args) {
		Scanner entrada= new Scanner(System.in);
		System.out.println("Digite seu nome");
		String nome=entrada.nextLine();
		System.out.println("Digite 4 notas:");    int n1=entrada.nextInt();
		int n2=entrada.nextInt();
		int n3=entrada.nextInt();
		int n4=entrada.nextInt();

		double mediaa= (n1+n2+n3+n4)/4;

		System.out.println(nome+"\nDigite suas faltas:");
		int nF=entrada.nextInt();

		if(nF<60) {
			if(mediaa>=7)
				System.out.println(nome+" esta aprovado");
			else {
				if(mediaa>=5 && mediaa<7) System.out.println(nome+" esta em exame");
				else {
					System.out.println(nome+" esta reprovado");
				}
			}
		}else System.out.println(nome+"esta reprovado");

		entrada.close();
	}

}