package repetição;

public class tabuada_for {

	public static void main(String[] args) {
		for(int i =0; i<11;i++) {
			for(int j=0; j<11; j++) {
				System.out.printf("%d x %d = %d\t|\t",i,j,(i*j));
			}
			System.out.println(" ");
		}

	}

}
