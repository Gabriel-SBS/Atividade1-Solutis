package questão4;

import java.util.Scanner;

public class ConversorQuilometros {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		System.out.print("Digite o valor em milhas: ");
		double milha = scan.nextDouble();
	
		double quilometros = milha * 1.609;
	
		System.out.println("A conversão de milhas para quilometros é: " + quilometros);
		scan.close();
	}
	
}
