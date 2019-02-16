package Constante;

public class Enum {
public static void main(String[] args) {
	System.out.println("O Melhor Lanche de Artur é  "+Lanches.X_TUDO+"\nCusta apenas R$"+Lanches.X_TUDO.getValor());
}
}
enum Lanches{
	X_TUDO(15.0F), X_BACON(9.50F), X_SALADA(13.0F), E_EGG(10.0F), CHURRASCO(20.0F), X_GALINHAO(20.0F);
	private float valor;
	private Lanches(float valor) {
		this.valor=valor;
	}
	public float getValor() {
		return valor;
	}
}
