package repetição;

import java.util.Scanner;

public class SegundoExer2 {

	public static void main(String[] args) {
		boolean janelaQuebrada=false;
		String resposta="n";
		int i=0;
		Scanner in= new Scanner (System.in);
		
		do{
			i++;
		System.out.println("A janela esta quebrada?");
		resposta=in.nextLine();
		if(resposta.equals("s")) {
			janelaQuebrada=true;
			System.out.println("Precisei tirar "+i+" pedras para quebrar a janela");
		}else {
			System.out.println("Atire uma pedra!");
		}
		
		}
		
		while (!janelaQuebrada);
		
		in.close();

	}

}
