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
		System.out.println("A soma é:"+soma(a,b));
		System.out.println("A diferença é:"+diferenca(a,b));
		System.out.println("A produto é:"+produto(a,b));
		System.out.println("A quociente é:"+quociente(a,b));
		System.out.println("A resto é:"+resto(a,b));
		System.out.println("A dobro é:"+dobro(a));
		System.out.println("A triplo é:"+triplo(a));
	}
}
