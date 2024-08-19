package questão3;
import java.util.Scanner;

public class Primos {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num = scan.nextInt();
		
		System.out.print("Números primos menores que " + num + ": ");
		for (int i = 2; i < num; i++) {
			if (Primo(i)){
				System.out.print(i + " ");
			}
		}
		scan.close();
	}
	
	public static boolean Primo(int num) {
		if (num <= 1) {
			return false;
		}
		
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
}
