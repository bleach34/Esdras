package exercicios;
import java.util.Scanner;

public class opera��es_matem�ticas {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite um valor para A");
		int a = entrada.nextInt();
		
		System.out.println(" Digite um valor para B");
		int b = entrada.nextInt();
		
		System.out.println(" Digite um valor para C");
		int c = entrada.nextInt();
		
     
		double resultado1=(b+c);
        System.out.println("A soma de B + C �: "+resultado1);
	    
	    
	    double resultado2 =(a*c);
	    System.out.println("O produto de A * C �: "+resultado2);
		
	
        double resultado3 =((a*a)+(b*b)+(c*c));
		System.out.println("O quadrado da soma de A,B,C �: "+resultado3);
		
		
		}

}
