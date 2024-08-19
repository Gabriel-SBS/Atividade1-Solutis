package questão5;

import java.util.Scanner;

/*Faça um programa que solicite ao usuário um número de 1 a 7, e imprima na
tela o dia da semana correspondente. Suponha que Segunda corresponde a 1 ,
Terça corresponde a 2, e assim por diante. Utilizando Array.*/

public class DiaDaSemana {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] diasDaSemana = {
		"Segunda",
		"Terça",
		"Quarta",
		"Quinta",
		"Sexta",
		"Sábado",
		"Domingo"
		};
		
		System.out.print("Digite um número de 1 a 7: ");
		
		int num = scan.nextInt();
		
		if (num >=1 && num <= 7){
			System.out.println("O dia da semana correspondente é: " + diasDaSemana[num - 1]);
		}else{
			System.out.println("Número inválido");
		}
		scan.close();
	}
}

