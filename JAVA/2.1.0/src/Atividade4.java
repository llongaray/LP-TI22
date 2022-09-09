import java.util.Scanner;

public class Atividade4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite dois valores inteiros: ");
		int Valor1 = teclado.nextInt(), Valor2 = teclado.nextInt();
		System.out.println("A Multiplicação do Valor1 pelo Valor2 dos valores é: " + (Valor1 * Valor2));
	}
}
