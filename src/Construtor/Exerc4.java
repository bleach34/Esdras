package Construtor;

import java.util.Scanner;

public class Exerc4 {
	private int codigo;
	private  String nomeCompleto;
	private Scanner entrada;


	public  Exerc4(String n, int c) {
		this.codigo = c;
		this.nomeCompleto = n ;

	}

	public String getNomeCompleto() {
		System.out.println("Digite seu nome completo:");

		entrada = new Scanner (System.in);
		nomeCompleto= entrada.nextLine();

		return this.nomeCompleto;

	}

	public int getCodigo() {
		return this.codigo;
	}
	public void setCodigo(int c) {
		this.codigo = c;
	}

	public void setNomeCompleto(String n) {
		this.nomeCompleto=n;
	}



	public void status(){



		System.out.println("Nome completo: "+this.getNomeCompleto());
		System.out.println("Código do pedido: " +this.getCodigo());
		System.out.println("");
	}

	public static void main(String[] args) {


		Exerc4 cliente1 = new Exerc4("",1);
		cliente1.status();
		Exerc4 cliente2 = new Exerc4("",2);
		cliente2.status();
	}
}
