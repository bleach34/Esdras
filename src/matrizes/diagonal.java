package matrizes;

import java.util.Random;

public class diagonal {
public static void main(String args[]) {
int m[][]=new int[6][6];
	
	for (int i = 0; i < m.length; i++) {
		for (int j = 0; j < m.length; j++) {
			m[i][j]=new Random().nextInt(10);
			
		}
	}
	
	for (int i = 0; i < m.length; i++) {
		for (int j = 0; j < m.length; j++) {
			if(i==j) {
			System.out.print(m[i][j]+"  ");
		}else
			System.out.print("-  ");
			}
			
		System.out.println("");
	}
}
}

