package repetição;

import java.util.Scanner;

public class exemplo_while{

	public static void main(String[]args) {
		int i = 0;

		System.out.println("Digite um valor para tabuada:");
		Scanner in = new Scanner (System.in);
		int t = in.nextInt();
		int r = 0;
		while(i <= 10) {
			r = t * i;
			System.out.println(i+"x"+t+"="+r);
			i++;
		}

	}	
}
