package atividadeIV;

public class ExercG {
	public static void mainr(String args[]) {
		int A[]=new int[20];
		int B[]=new int[30];
		int C[]=new int[50];
		for (int i = 0; i < A.length; i++) {
		A[i]=i;
		B[i]=i;
		C[i]=A[i]&B[i];
		
		System.out.println(""+C[i]);
			
		}
	}
}
