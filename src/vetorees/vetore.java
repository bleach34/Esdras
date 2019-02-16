package vetorees;

import java.util.Scanner;

public class vetore {
public static void main(String[] args) {
	String nome[]=new String[5];
	String idade[]=new String[5];
	String signo[]= {"Cancer","Peixe","Leão","Aquario","Libra"};
	
	Scanner entrada= new Scanner(System.in);
	
	for(int i=0; i<signo.length; i++) {
		System.out.println("Digite o "+(i+1)+"º nome.");
		nome[i]=entrada.nextLine();
		System.out.println("Digite a idade de "+nome[i]);
		idade[i]=entrada.nextLine();	
	}
	System.out.println("\nDados Armazenados\n");
	
	for(int i=0; i<signo.length;i++) {
		System.out.printf("nome = %s\nidade=%s\nsigno = %s\n",nome[i],idade[i],signo[i]);
	}
	entrada.close();
}
}
