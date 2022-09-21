import java.util.Scanner;

public class Atividade4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int mdl = 480 / 4;

		System.out.println("Digite a quatidade de funcionarios: ");
		int funcionarios = teclado.nextInt();
		int producao = funcionarios * mdl;
		System.out.println("Será produzido " + producao + " sanduíches por hora com " + funcionarios + " contratados.");
	}
}
