package atividadeII;
import java.util.Scanner;
public class Exercicio12 {
	public static void main(String[] args) {
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
		nF= nF*60/100;
		if(nF<60) {
			if(mediaa>=9.1&& mediaa<=10)
				System.out.println(nome+" tirou A");
			else {
				if(mediaa>=6.1 && mediaa<=9) System.out.println(nome+" tirou B");
				else {
					if(mediaa>=4.1&&mediaa<=6)System.out.println(nome+"tirou C \n Aluno em recuperação");
					else {
						if(mediaa>=3.1&&mediaa<=4)System.out.println(nome+"tirou D \n Aluno em recuperação");
						else {System.out.println(nome+"tirou E \n Aluno em recuperação");
						} 
					}
				}
			}
		}else System.out.println(nome+" esta retido(a) por faltas");
      entrada.close();
	}
}
