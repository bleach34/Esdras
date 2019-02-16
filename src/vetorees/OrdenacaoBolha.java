package vetorees;

public class OrdenacaoBolha {

	public static void main(String[] args) {
		int a[]= {1,3,5,0,6,7,8,9,2,4};
		int aux=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0; j<a.length -1;j++) {
				if(a[j]>a[j+1]) {
					aux=a[j];
					a[j]=a[j+1];
					a[j+1]=aux;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	
	}

}
