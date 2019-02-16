package Construtor;
import java.util.Scanner;
public class Cliente {
	 private  String nomeCompleto;
	    private int codigo;


	    public  Cliente(String n, int c) {
	    this.nomeCompleto = n ;
	    this.codigo = c;
	   
	    }

	    public String getNomeCompleto() {
	    	System.out.println("Digite seu nome completo:");
            Scanner entrada = new Scanner (System.in);
            nomeCompleto= entrada.nextLine();
            entrada.close();
	        return this.nomeCompleto;
	    }

	    public int getCodigo() {
	        return this.codigo;
	    }

	    public void setNomeCompleto(String n) {
	        this.nomeCompleto=n;
	    }

	    public void setCodigo(int c) {
	        this.codigo = c;
	    }
	    
	    public void status(){
	        
	        System.out.println("Sobre o Pedido");
	        System.out.println("Código do pedido: " +this.getCodigo());
	        System.out.println("Nome completo:"+this.getNomeCompleto());
	       
	    }

	    public static void main(String[] args) {

	        Cliente c1 = new Cliente("",1);
	        c1.status();
	        
	    }
	    
}
