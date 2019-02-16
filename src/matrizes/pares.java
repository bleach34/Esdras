package matrizes;

import java.util.Random;

public class pares {
public static void main(String args[]) {
	int m[][]=new int[5][5];
	
	for (int i = 0; i < m.length; i++) {
		for (int j = 0; j < m.length; j++) {
			m[i][j]=new Random().nextInt(10);
			
		}
	}
	
	for (int i = 0; i < m.length; i++) {
		for (int j = 0; j < m.length; j++) {
			if(m[i][j]%2==0) {
			System.out.print(m[i][j]+"  ");
		}else
			System.out.print("-  ");
			}
			
		System.out.println("");
	}
}
}
