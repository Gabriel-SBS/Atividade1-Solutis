package questão8;

import java.util.Scanner;

public class Palindromos {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite uma palavra: ");
		String palavra = scan.nextLine();
		
		if (Palindromo(palavra)) {
			System.out.println("A palavra \"" + palavra + "\" é um palíndromo.");
		} else {
			System.out.println("A palavra \"" + palavra + "\" não é um palíndromo.");
		}
		
		scan.close();
	}
	
	public static boolean Palindromo(String palavra) {
		int esquerda = 0;
		int direita = palavra.length() - 1;
		while (esquerda < direita) {
			if (palavra.charAt(esquerda) != palavra.charAt(direita)) {
				return false;
			}
			esquerda++;
			direita--;
		}
		return true;
	}

}
