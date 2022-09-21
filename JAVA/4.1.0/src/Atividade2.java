import java.util.Scanner;

public class Atividade2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um valor inteiro: ");
		int valor1 = teclado.nextInt();
		System.out.println("Digite um valor inteiro: ");
		int valor2 = teclado.nextInt();
		
		if(valor1%valor2==0) {
			System.out.println("Valor A é multiplo de B.");
		}
		else {
			System.out.println("Valor A não é multiplo de B.");
		}
		teclado.close();
	}
}
