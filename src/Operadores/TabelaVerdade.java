package Operadores;

public class TabelaVerdade {
public static void main(String [] args) {
	
	/*PHP  JAVA E OU NAO
	 * V    V    
	 */
	System.out.println("Tabela verdade:\n\nE");
	System.out.printf("V E V = %s\n",true && true ? "V" : "F" );
	System.out.printf("V E F = %s\n",true && false? "V" : "F");
	System.out.printf("F E V = %s\n",false && true? "V" : "F");
	System.out.printf("F E F = %s\n",false && false? "V" : "F");
	
	System.out.println("Tabela verdade:\n\nOU");
	System.out.printf("V E V = %s\n",true || true ? "V" : "F" );
	System.out.printf("V E F = %s\n",true || false? "V" : "F");
	System.out.printf("F E V = %s\n",false|| true? "V" : "F");
	System.out.printf("F E F = %s\n",false|| false? "V" : "F");
	
	System.out.println("Tabela verdade:\n\nNAO");
	System.out.printf("Nao V = %s\n",!true ? "V" : "F" );
	System.out.printf("Nao F = %s\n",!false? "V" : "F");
}
}
