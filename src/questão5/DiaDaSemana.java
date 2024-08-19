package questão5;

import java.util.Scanner;

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

