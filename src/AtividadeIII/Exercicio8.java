package AtividadeIII;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
/*Receber valores referentes a temperaturas em um m�s, ao termino dos
		30 dias exibir a  temperatura  media  do  m�s  e  em  quantos
		dias  a  temperatura  foi  superior  a  40 graus.*/
		Scanner entrada= new Scanner(System.in);
		int temp=0;
		int dias=0;
		for(int i=0; i<30;i++) {
			System.out.println("Digite o valor da temperatura:");
			int valor=entrada.nextInt();
			temp+=valor;
			if(valor>40) {
				dias+=1;
				}
			
			}
			
			
		
		temp=temp/30;
		System.out.println("A m�dia da temperatura em um m�s � de: "+temp);
		System.out.printf("%d dias a temperatura foi superior a 40 graus", dias);
		entrada.close();
	}

}
