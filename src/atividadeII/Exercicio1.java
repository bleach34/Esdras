package atividadeII;
import java.util.Scanner;

public class Exercicio1 {


public static void main(String[] args) {
	 Scanner entrada = new Scanner(System.in);
	 System.out.println("Digite um número:");
	 int numero= entrada.nextInt();
	
	 if(numero%4==0 && numero%5==0) {
      System.out.println("É divisivel por 4 e 5 o numero "+numero);
		 } 
	 else { System.out.println("O numero digitado não é divisivel por 4 e 5");}
		
     entrada.close();
  }
}
