package decisao;

public class ExemploIntro2 {
	public static void main(String [] args) {
		int x=5, y=10; 
		boolean condicao= x > y;

		if(x==y){
			System.out.println(String.format("%B-%d é igaul a %d",x,y));
		}else {
			if(x>y) {
				System.out.println(String .format("%B-%d é maior que %d",condicao,x,y));
			}}

		if(x<y){
			System.out.println(String.format("%B-%d é maior que %d", condicao,y,x));
		}



	}
}
