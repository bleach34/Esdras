package vetores;

public class Ordenacao_Bolha {

	public static void main(String[] args) {
 int a[] = {6,23,1,9,3,120,7,47,59,17};
 int aux = 0;
 System.out.println("a [] tem "+a.length+" posições");
 for (int i = 0; i < a.length; i++) {
	 for (int j = 0; j < a.length - 1; j++) {
		 if(a[j] > a[j+1]) {
			 aux = a[j];
			 a[j] = a[j+1];
			 a[j+1] = aux;
		 }
	 }
 }
for (int i = 0; i < a.length; i++) {
System.out.println(a[i]);
	}
  }
}

