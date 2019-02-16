package sla;
import java.util.Scanner;
public class Snippet {
	public static void main(String[] args) {
		System.out.println("Digite um caracter...");
		Scanner entrada= new Scanner(System.in);
		String valor= entrada.nextLine();
		char caracter= valor.charAt(0);
		switch(caracter) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(caracter+"É uma vogal");
		break;
		
		case 0:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
			System.out.println(caracter+"É um algoritimo");
		break;
		
		default:
			System.out.println(caracter+"É uma consoante ");
		entrada.close();
		}
	}}

