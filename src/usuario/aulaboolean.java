package usuario;

public class aulaboolean {
    public static void main(String[] args){
    	
    	
    	boolean java = true;
    	boolean php = true;
    	boolean linux = false;
    	boolean ingles = true;
    	
    	boolean resultado=php&java&((linux == true & ingles == false)||(linux == false & ingles==true));
    	System.out.println("Resultado Repescagem 02:"+resultado);
    }
}
