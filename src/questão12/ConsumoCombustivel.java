package questão12;

import java.util.Scanner;

//Faça um programa que receba 2 valores e retorne o maior entre eles.

public class ConsumoCombustivel {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int totalQuilometragem = 0;
		int totalLitros = 0;
		System.out.print("Digite a quilometragem dirigida (ou um número negativo para encerrar): ");
		int quilometragem = scan.nextInt();
		while (quilometragem > 0) {
			System.out.print("Digite a quantidade de litros de gasolina consumidos: ");
			int litros = scan.nextInt();
			if (litros <= 0) {
				System.out.println("A quantidade de litros deve ser um número positivo.");
			} else {
				double consumo = (double) quilometragem / litros;
				System.out.printf("Consumo de combustível para o tanque: %.2f km/l\n", consumo);
				totalQuilometragem += quilometragem;
				totalLitros += litros;
				System.out.print("Digite a quilometragem dirigida (ou um número negativo para encerrar): ");

				quilometragem = scan.nextInt();
			}
		}
		if (totalLitros > 0){
			double mediaConsumo = (double) totalQuilometragem / totalLitros;
			System.out.printf("Quilometragem total: %d km\n", totalQuilometragem);
			System.out.printf("Total de litros consumidos: %d litros\n", totalLitros);
			System.out.printf("Consumo médio total: %.2f km/l\n", mediaConsumo);
		} else {
			System.out.print("Nenhum dado foi inserido.");
		}
		scan.close();
	}
}
