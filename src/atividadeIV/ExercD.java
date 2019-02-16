package atividadeIV;

public class ExercD {

	public static void main(String[] args) {
		int A[]=new int[20];
		int B[]=new int[20];
		int C[]=new int[20];
		for (int i = 0; i < A.length; i++) {
			A[i]=4;
			B[i]=2;
			if(A[i]>B[i]) {
				C[i]=A[i]-B[i];
				System.out.println("A:"+A[i]+"  B:"+B[i]+"  C:"+C[i]);}
			else
				C[i]=B[i]-A[i];
			System.out.println("A:"+A[i]+"  B:"+B[i]+"  C:"+C[i]);
		}
	}

}
