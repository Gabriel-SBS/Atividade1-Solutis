package questão2;

import java.util.Scanner;


/*Faça um programa que receba 2 valores e retorne o maior entre eles.*/

public class Maior {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		int valor1 = scan.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		int valor2 = scan.nextInt();
		
		if (valor1 > valor2){
			System.out.println("O maior valor é: " + valor1);
		} else if (valor1 < valor2) {
			System.out.println("O maior valor é: " + valor2);
		} else {
			System.out.println("Os valores são iguais");
		}
		
		scan.close();
	}
}
