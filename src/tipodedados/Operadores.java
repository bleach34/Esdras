package tipodedados;

import java.io.PrintStream;

@SuppressWarnings("unused")
public class Operadores {
	public static void main(String[] args) {

		/* PHP   JAVA   E   OU    NÃO
     V     V     V   V      F
     V     F     F   V      F
     F     V     F   V      F
     F     F     F   F      V
		 */

		System.out.println("Tabela verdade:\n\nE");
	    System.out.printf("V E V=%s\n", true && true? "V":"F");
		System.out.printf("V E F=%s\n", true && false? "V":"F");
		System.out.printf("F E V=%s\n", false && true? "V":"F");
		System.out.printf("F E F=%s\n", false && false? "V":"F");

		System.out.println("Tabela verdade:\n\nOU");
		System.out.printf("V OU V=%s\n", true  || true? "V":"F");
		System.out.printf("V OU F=%s\n", true  || false? "V":"F");
		System.out.printf("F OU V=%s\n", false || true? "V":"F");
		System.out.printf("F OU F=%s\n", false || false? "V":"F");

		System.out.println("Tabela verdade:\n\nNÃO");
		System.out.printf("NÃO V = %s\n", !true  ?  "V":"F");
		System.out.printf("NÃO F = %s\n", !false ? "V":"F");
		System.out.printf("NÃO F = %s\n", !false ? "V":"F");
		System.out.printf("NÃO F = %s\n", !false ? "V":"F");

	
	}
}
