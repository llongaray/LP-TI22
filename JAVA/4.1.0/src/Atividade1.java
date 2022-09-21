import java.util.Scanner;

public class Atividade1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um valor inteiro: ");
		int valor1 = teclado.nextInt();
		System.out.println("Digite um valor inteiro: ");
		int valor2 = teclado.nextInt();
		
		if(valor1>valor2) {
			System.out.println("O maior valor é " + valor1);
			System.out.println("O menor valor é " + valor2);
		}
		if(valor2>valor1) {
			System.out.println("O maior valor é " + valor2);
			System.out.println("O menor valor é " + valor1);
		}
		teclado.close();
	}
}
