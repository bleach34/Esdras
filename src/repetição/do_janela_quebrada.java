package repetição;

import java.util.Scanner;

public class do_janela_quebrada {

	public static void main(String[] args) {
		boolean janelaQuebrada = true;
		String resposta = "n";
		int i = 0;
		Scanner in = new Scanner(System.in);

		
	do	{
		i++;
			System.out.println("A janela está quebrada?");
			resposta = in.nextLine();
			if(resposta.equals("s")) {
				janelaQuebrada = true;
				System.out.println("Precisei atirar "+i+" "+"pedras para quebrar a janela.");
				
			}else {
				System.out.println("Atirei uma pedra!");
			}
			
			
		}while (!janelaQuebrada);
		in.close();


			}

		


	}


