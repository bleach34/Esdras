package Construtor;

public class pedido {
	    private String nome;
	    private int codigo;
	    private String descricao;

	    public pedido(String n, int c, String d) {
	    this.nome = n ;
	    this.codigo = c;
	    this.descricao = d;
	   
	    }

	    public String getNome() {
	        return this.nome;
	    }

	    public double getCodigo() {
	        return this.codigo;
	    }

	    public void setNome(String n) {
	        this.nome = n;
	    }

	    public void setCodigo(int c) {
	        this.codigo = c;
	    }
	        public String getDescricao() {
	        return descricao;
	    }

	    public void setDescricao(String d) {
	        this.descricao = d;
	    }
	    
	    public void status(){
	        
	        System.out.println("Sobre o Pedido:");
	        System.out.println("Código do pedido: " +this.getCodigo());
	        System.out.println("Nome do cliente: "+this.getNome());
	        System.out.println("Descrição do pedido: "+this.getDescricao());
	       
	    }

	    public static void main(String[] args) {

	    	
	        pedido c1 = new pedido("Laiza", 1, "Pedido de compra");
	        c1.status();
	        
	    }
}
