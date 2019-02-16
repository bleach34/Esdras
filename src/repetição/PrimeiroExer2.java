package repetição;
import java.util.Scanner;
public class PrimeiroExer2 {

	public static void main(String[] args) {
		int valor;
		Scanner entrada=new Scanner(System.in);
		int menorValor=Integer.MAX_VALUE;
		
        
		for(int contador=0;contador<10;contador++) {
			System.out.println("Digite um valor...");
			valor=entrada.nextInt();			
			if(valor<menorValor) {
				menorValor=valor;
			}
			System.out.println("O menor valor é: "+menorValor);
		}
	      entrada.close();  
	}


}
