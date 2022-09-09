import java.util.Scanner;

public class Atividade5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor em DOLAR a ser convertido em REAIS: ");
		float dolar = teclado.nextFloat();
			float real = dolar*4.67f;
				
			System.out.println(dolar + " Dolares foram convertidos em " + real + " Reais.");
	}
}
