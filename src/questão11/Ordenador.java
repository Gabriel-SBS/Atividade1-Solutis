package questão11;

import java.util.Scanner;

public class Ordenador {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite a primeira palavra: ");
		String palavra1 = scan.nextLine();
		System.out.print("Digite a segunda palavra: ");
		String palavra2 = scan.nextLine();
		if (palavra1.compareTo(palavra2) < 0){
			System.out.println("Palavras em ordem alfabética:");
			System.out.println(palavra1);
			System.out.println(palavra2);
		} else if (palavra1.compareTo(palavra2) > 0) {
			System.out.println("Palavras em ordem alfabética:");
			System.out.println(palavra2);
			System.out.println(palavra1);
		} else {
			System.out.println("Palavras iguais");
		}
		if (palavra1.length() > palavra2.length()){
			System.out.println(palavra1 + " é maior que " + palavra2);
		} else if (palavra1.length() < palavra2.length()){
			System.out.println(palavra2 + " é maior que " + palavra1);
		} else {
			System.out.println("As palavras possuem o mesmo tamanho");
		}
		
		scan.close();
	}
}