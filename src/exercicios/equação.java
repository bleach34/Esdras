package exercicios;

public class equa��o {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		//35-{5+[15:(3+2)-(18+2):10]+3.(5+2)+3} = 5
		 System.out.printf("\nEqua��o a\n"); /*Resultado = 5*/
		 double resultado1 = (35 -(5+(3+2)-(18+2)/10)+3*(5+2)+3);
		 System.out.println("35-{5+[15:(3+2)-(18+2):10]+3.(5+2)+3} =" +resultado1);	
		
		
		
		//{5+2.[15-(2^4:8)+3.(2�-7)]-3�} = 10
	 System.out.printf("\nEqua��o b\n"); /*Resultado = 10*/
	 double resultado2 =  (5+2*(15 -(Math.pow(2, 4)/8)+3*(Math.pow(2, 3)-7))-Math.pow(3, 3)); 
	 System.out.println("{5+2.[15-(2^4:8)+3.(2�-7)]-3�} =" +resultado2);
	
	  
	 //(1)�:{3+2.[5-2:2]+5(3-1�)}^0 = 1
	 System.out.printf("\nEqua��o c\n"); /*Resultado = 1*/
	 double resultado3 = (Math.pow(1, 2)/Math.pow((3+2*(5-2/2)+5*(3-Math.pow(1, 2))), 0));
	 System.out.println("(1)�:{3+2.[5-2:2]+5(3-1�)}^0 =" +resultado3);
	 
	
	}
}
