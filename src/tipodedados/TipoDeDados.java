package tipodedados;

public class TipoDeDados {
       //Metodo principal, gatilho de ações
	public static void main(String[] args) {
	 //Declaração de variaveis
	//*  Sintaxe modificador tipo = valor*/
		@SuppressWarnings("unused")
		short idade = 128;

		System.out.printf("byte: 8 bits- %.0f combinações, de %.0f a %.0f\n",
				Math.pow(2, 8),-Math.pow(2, 7),Math.pow(2, 7)-1);

		System.out.printf("byte: 8 bits- %.0f combinações, de %.0f a %.0f\n",
				Math.pow(2, 16),-Math.pow(2, 15),Math.pow(2, 15)-1);
		
		System.out.printf("byte: 8 bits- %.0f combinações, de %.0f a %.0f\n",
				Math.pow(2, 32),-Math.pow(2, 31),Math.pow(2, 31)-1);
		
		System.out.printf("byte: 8 bits- %.0f combinações, de %.0f a %.0f\n",
				Math.pow(2, 64),-Math.pow(2, 63),Math.pow(2, 63)-1);
    }
}
