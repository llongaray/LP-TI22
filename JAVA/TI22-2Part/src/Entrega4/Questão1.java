package Entrega4;

import java.util.Scanner;

public class Questão1 {
	public static void main(String[] args) {
		Scanner tcl = new Scanner(System.in);
		float mediaFinal = 0;
		int faltas = 0;
		String resMedia = "", resFaltas = "";
		for (int i = 0; i < 50; i++) {
			System.out.println("Digite a média final: ");
			mediaFinal = tcl.nextInt();
			System.out.println("Digite a quantidade de faltas: ");
			faltas = tcl.nextInt();

			if (mediaFinal >= 7) {
				resMedia = "APROVADO";
			} else if (mediaFinal < 7) {
				resMedia = "REPROVADO";
			}

			if (faltas < 15) {
				resFaltas = "APROVADO";
			} else {
				resFaltas = "REPROVADO";
			}

			System.out.printf("O aluno teve média %.1f e está %s. \nO mesmo teve %d faltas e está %s.\n\n", mediaFinal,
					resMedia, faltas, resFaltas);
		}

		tcl.close();
	}
}
