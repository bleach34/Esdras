package atividadeII;
import java.util.Scanner;
public class Exercicio15 {

	public static void main(String[] args) {
		double valor;

		Scanner entrada= new Scanner(System.in);
		System.out.println("Digite seu sal�rio:");
		valor= entrada.nextDouble();
	    Resultado(valor);
		entrada.close();
	}
	public static double Resultado(double valor) {
		double desconto;
		if(valor<=1903.98)
			System.out.println("N�o possui Aliquota");

		else

			if(valor>=1903.99 && valor<=2826.65) {

				desconto= (valor*7.5)/100;
				System.out.println("O valor da Aliquota � 7.5%");
				System.out.println("O valor da parcela � "+desconto);}
			else {
				if(valor>=2826.66 && valor<=3751.05) {
					desconto= (valor*15)/100;
					System.out.println("O valor da Aliquota � 15%");
					System.out.println("O valor da parcela � "+desconto);;
				}
				else {
					if(valor>=3751.06 && valor<=4664.68) { 
						desconto=(valor*22.5)/100;
						System.out.println("O valor da Aliquota � 22.5%");
						System.out.println("O valor da parcela � "+desconto);;
					}	
						else {

							if(valor>4664.68) {
								desconto=(valor*27.5)/100;
								System.out.println("O valor da Aliquota � 27.5%");
								System.out.println("O valor da parcela � "+desconto);;
							}
						}
					}
				}
		return valor;


	}

}
