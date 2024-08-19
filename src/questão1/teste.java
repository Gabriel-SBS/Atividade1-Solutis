package questão1;

public class teste {
	public static void main( String args[] ){
	int i = 5;
	int j = i;
	j = 10;
	System.out.println("i + j = " + j + i ); // A saída será "i + j = 105" pois a expressão "j + i" será avaliada como concatenação de strings
	}
}
