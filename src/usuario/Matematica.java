package usuario;

public class Matematica {
     static int soma(int x, int y) {
	        return x + y;
     }
     static int diferenca(int x, int y) {
    	   return x-y;
     }
     static int produto(int x, int y) {
    	   return x*y;
     }
     static int quociente(int x, int y) {
    	   return x/y;
     }
     static int resto(int x, int y) {
    	   return x%y;
     }
     static int dobro(int x) {
    	   return x*2;
     }
     static int triplo(int x) {
    	   return x*3;
     }
     public static void main(String[] args) {
		int a=10, b=10;
		System.out.println("A soma �:"+soma(a,b));
		System.out.println("A diferen�a �:"+diferenca(a,b));
		System.out.println("A produto �:"+produto(a,b));
		System.out.println("A quociente �:"+quociente(a,b));
		System.out.println("A resto �:"+resto(a,b));
		System.out.println("A dobro �:"+dobro(a));
		System.out.println("A triplo �:"+triplo(a));
	}
}
