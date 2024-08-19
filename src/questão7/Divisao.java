package questão7;

/*Imprima o resultado da divisão por 2 de todos os múltiplos de 3, entre 1 e
100, usando os tipos de dados int e double .*/

public class Divisao {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				int ValorInt = i / 2;
				double ValorDouble = (double) i / 2 ;
				
				System.out.println("Número: " + i + ", Divisão por 2 (int): " + ValorInt);
				System.out.println("Número: " + i + ", Divisão por 2 (double): " +ValorDouble);
			}
		}
	}
}
