
public class Aula01 {
    //Metodo principal, este metodo � responsavel
	//por iniciar a execucao de comandos e outros
	//metodos nas classes Java
	public static void main(String[] args) { 
		//Secao de comandos
		
		//Saida de dados C-Style
		System.out.printf("%S � a melhor linguagem! %s\n","Java","B)");
		System.out.printf("%s %d X%d %s\n", "Brasil", 1,2,"B�lgica");
		
		//Saida de dados convencional
		int saldoGolsFranca = 3;
		int saldoGolsCroacia = 2;
		System.out.println("Fran�a"+saldoGolsFranca+"X"+saldoGolsCroacia+"Cro�cia.");
		
		//Saida na posicao atual do cursor-print
		System.out.printf("Primeira linha");
		System.out.printf("\tSegunda linha");
	}
}
