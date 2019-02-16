package decisao;

public class exercicio1 {
public static void main(String [] args) {
	int a = 8, b = 7, c = 10, d = 9;
	float m = (a+b+c+d)/4;
	if(m<5) {
		System.out.println("Reprovado.");
		}
	else {
		if(m<7) {
			System.out.println("Recuperação.");
		}
		else{
			System.out.println("Aprovado.");
			}
	    }
	}
}
