import java.util.Scanner;

public class Atividade2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = teclado.nextLine();
		System.out.println("Digite sua idade: ");
		int idade = teclado.nextInt();
		System.out.println("Olá, seu nome é " + nome + " sua idade é " + idade + ".");
	}
}
