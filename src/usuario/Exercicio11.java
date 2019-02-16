package usuario;

import java.util.Scanner;

public class Exercicio11 {
     public static void main (String[] args) {
     Scanner entrada = new Scanner(System.in);
     System.out.println("Digite o valor de seu salario:");
     float salario= entrada.nextInt();
     System.out.println("O salario digitado foi:"+salario);
     
     System.out.println("Digite o aumento:");
     int aumento=entrada.nextInt();
     float porcentagem= aumento/100F;
     float acrescimo = salario * porcentagem;
     
     float salariof= acrescimo+salario;
     System.out.printf("O valor do acrescimo é de %.2f\n",acrescimo);
     System.out.printf("O valor do novo salario é de %.2f\n", salariof);
     entrada.close();
     }
}
