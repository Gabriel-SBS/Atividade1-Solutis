package questão4;

import java.util.Scanner;

/*Pretende-se escrever um programa que leia do teclado uma distância
expressa em milhas, converte-a para quilômetros e apresenta o resultado no
console. (fórmula de conversão: 1 milha = 1.609 km).*/

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
