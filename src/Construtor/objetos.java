package Construtor;

public class objetos {
   
    	private String nome;
   	    private int codigo;
   	    private String descricao;

   	    public objetos(String n, int c, String d) {
   	    this.nome = n ;
   	    this.codigo = c;
   	    this.descricao = d;
   	   
   	    }

   	    public String getNome() {
   	        return this.nome;
   	    }

   	    public int getCodigo() {
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
   	    	
   	        objetos pedido1 = new objetos("Laiza", 1, "Pedido de compra");
   	        objetos pedido2= new objetos("Cátia",2, "Pedido de atendimento");
   	        pedido1.status();
   	        pedido2.status();
   	        
   	    }
}
