package atividadeIV;

public class Exerc3 {

	public static void main(String[] args) {
		int A[]=new int[8];
		int B[]=new int[8];
		for (int i = 0; i < B.length; i++) {
			A[i]=i; 
			B[i]=A[i]*3;
			System.out.println("A:"+A[i]+"   "+"B:"+B[i]);
		} 
	}

}
