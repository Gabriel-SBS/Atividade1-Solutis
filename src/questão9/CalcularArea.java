package questão9;

import java.util.Scanner;

/*Escreva uma classe para calcular a área de um círculo, sabendo que a área
é A = PI * r2, onde o raio (r) deve ser informado pelo usuário e o resultado terá
que ser arredondado.*/

public class CalcularArea {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Qual é o Raio do cubo: ");
		Double raio = scan.nextDouble();
		
		Double Area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("A area do circulo é: " + Math.round(Area));
		
		scan.close();
	}
}
