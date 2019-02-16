package AtividadeIII;

public class Exercicio7_ {
	public static void main(String[] args) {
		int i=0;
		int j=0;

		while(i<11)
		{			
			while(j<11)
			{				
				System.out.printf("%d X %d = %d\n",i,j,(i*j));

				j++;				
			}
			i++;
			j=0;
			System.out.println("---------------------");		
		}
	}
}
