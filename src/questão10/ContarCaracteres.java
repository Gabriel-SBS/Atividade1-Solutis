package questão10;

import java.util.Scanner;

public class ContarCaracteres {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite uma cadeia de caracteres: ");
		String cadeia = scan.nextLine();
		
		int vogais = 0;
		int espacos = 0;
		int consoantes = 0;
		
		for (char c : cadeia.toCharArray()) {
			if (Character.isLetter(c)) {
				if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
					vogais++;
				} else {
				consoantes++;
				} 
			} else if (Character.isWhitespace(c)) {
				espacos++;
			}
		}
		System.out.println("Quantidade de vogais: " + vogais);
		System.out.println("Quantidade de espaços: " + espacos);
		System.out.println("Quantidade de consoantes: " + consoantes);
		
		scan.close();
	}
}
