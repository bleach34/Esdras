package exercicios2;
import java.util.Scanner;

public class menor_de_tres {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("digite primeiro valor...");
		int valor1 = entrada.nextInt();
		System.out.println("digite segundo valor...");
		int valor2 = entrada.nextInt();
        System.out.println("Digite terceiro valor...");
        int valor3 = entrada.nextInt();
		
			if(valor1 < valor2 && valor1< valor3)	{
				System.out.println(valor1+" é o menor valor");	
		}else {
			if(valor2 < valor1 && valor2 < valor3) {
				System.out.println(valor2+" é o menor valor");
			}else {
				if(valor3 < valor1 && valor3 < valor2) {
					System.out.println(valor3+" é o menor valor");
				}else {
					System.out.println("\nOs valores são iguais");
				}
			}
			
			
		
		}
			
		}
}
