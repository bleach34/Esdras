package atividadeII;
import java.util.Scanner;

public class Exercicio1 {


public static void main(String[] args) {
	 Scanner entrada = new Scanner(System.in);
	 System.out.println("Digite um n�mero:");
	 int numero= entrada.nextInt();
	
	 if(numero%4==0 && numero%5==0) {
      System.out.println("� divisivel por 4 e 5 o numero "+numero);
		 } 
	 else { System.out.println("O numero digitado n�o � divisivel por 4 e 5");}
		
     entrada.close();
  }
}
