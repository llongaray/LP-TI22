import java.util.Scanner;

public class Atividade4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o nome do seu pai: ");
		String pai = teclado.next();
		System.out.println("Digite a idade do seu pai: ");
		int idadepai = teclado.nextInt();
		System.out.println("Digite o nome do sua mãe: ");
		String mae = teclado.next();
		System.out.println("Digite a idade do sua mãe: ");
		int idademae = teclado.nextInt();
		System.out.println("Olá, o nome de seu pai é " + pai + " e sua idade é " + idadepai + ", "
				+ "o nome de sua mãe é " + mae +" e sua idade é " + idademae +".");
	}
}
