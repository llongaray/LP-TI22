import java.util.Scanner;

public class Atividade3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = teclado.next();
		System.out.println("Digite sua profissao: ");
		String profissao = teclado.next();
		System.out.println("Digite sua sálario: ");
		Double salario = teclado.nextDouble();
		System.out.println("Olá, seu nome é " + nome +", sua profissão é "+ profissao + 
							" e você ganha R$ " + salario + " reais.");
	}
}
