package atividadeIV;

import java.util.Random;

public class ExercF {

	public static void main(String[] args) {
		int A[]=new int[15];
		int B[]=new int[15];
		int C[]=new int[15];
					
       for (int i = 0; i < A.length; i++) {
		A[i]=new Random().nextInt(10)+1;
		B[i]=new Random().nextInt(10)+1;
		
		System.out.printf("a[%d]=%d\tb[%d]=%d\n",i,A[i],i,B[i]);
	}
       for (int i = 0; i < C.length; i++) {
		if(i<15) {
			C[i]=A[i];
			
		}else {
			C[i]=B[i-B.length];
			}
		System.out.printf("A[%d]=%d\n",i,C[i]);
		}
		
	}

	}


