package enums;

public class ExemploEnum {

	public static void main(String[] args) {
 System.out.println("O melhor Lanche de Artur é " 
		 +Lanches.X_TUDO+
		 "\nCusta apenas "+String.format("R$ %.2f", Lanches.X_TUDO.getValor()));
   }
}
enum Lanches{
	X_TUDO(15.0f), X_BACON(9.5f), X_SALADA(13.0f),
	X_EGG(10.0f), CHURRASCO(20.0f), GALINHÃO(20.0f);
	
	private float valor;
	
	private Lanches(float valor) {
		this.valor = valor;
	}
	public float getValor() {
		return valor;
	}
}