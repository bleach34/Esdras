package usuario;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {   
	Scanner entrada= new Scanner(System.in);
    System.out.println("Digite o salario:");
	int salario=entrada.nextInt();
    float Inss= salario*8/100F;
    float imposto= salario*11/100F;
    float salariol=salario-Inss-imposto;
    
    System.out.printf("O desconto de Inss é de: %.2f\n", Inss);
    System.out.printf("O desconto de imposto é de %.2f\n", imposto);
    System.out.printf("O sálario liquido é de %.2f reais", salariol);
    
    entrada.close();
    }
}
