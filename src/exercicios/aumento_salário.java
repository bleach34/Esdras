package exercicios;

import java.util.Scanner;

public class aumento_salário {
	public static void main(String[] args) {
		
	Scanner entrada = new Scanner (System.in);
	System.out.println("Digite o valor do salário atual:");
	int salario = entrada.nextInt();
	
	System.out.println("Digite a porcentagem desejada:");
	int aumento = entrada.nextInt();
	
	float porcentagem = (salario*aumento)/100;
    System.out.println("Valor do aumento:" +porcentagem);
    
    float soma = (salario + porcentagem);
    System.out.println("Valor do novo salario:" + soma);
    
    }
	
		

}
