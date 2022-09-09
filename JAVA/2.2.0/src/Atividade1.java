import java.util.Scanner;

public class Atividade1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = teclado.nextLine();
		System.out.println("Digite sua Estado: ");
		String estado = teclado.next();
		System.out.println("Digite sua cidade: ");
		String cidade = teclado.next();
		System.out.println("Olá, você mora no estado " + estado + ", na cidade " + cidade + " e seu nome é " + nome + ".");
	}
}
