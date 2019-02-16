package repetição;

import java.util.Scanner;

public class ExemploWhile {
public static void main(String[] args) {
	int i=0;
	System.out.println("Digite um valor para a tabuada");
	Scanner in= new Scanner(System.in);
	int t= in.nextInt();
	int r=0;
	
	while(i<=10) {
		r=t*i;
		System.out.println(i+"X"+t+"="+r);
		i++;
	}
	in.close();
}
}
	