package Entrega4;

import java.util.Scanner;

public class Questão5 {
	public static void main(String[] args) {
		Scanner tcl = new Scanner(System.in);
		int i = 0, masc = 0, fem = 0;
		String sexo = "";
		float altura = 0, mediaF = 0, mediaP = 0, maior = 0, menor = 0;

		while (i != 50) {
			System.out.println("Digite o sexo: ");
			sexo = tcl.next();
			System.out.println("Digite a altura: ");
			altura = tcl.nextFloat();

			// Maior e menor;
			if (maior == 0 && menor == 0) {
				maior = altura;
				menor = altura;
			} else if (altura > maior) {
				maior = altura;
			} else if (altura < menor) {
				menor = altura;
			}
			// Média altura mulheres;
			if (sexo.equals("feminino")) {
				mediaF += altura;
				fem++;
			}
			// Média da altura da população;
			mediaP += altura;

			// Percentual de homem na população;
			if (sexo.equals("masculino")) {
				masc++;
			}

			i++;
		}

		mediaF = mediaF / fem;
		mediaP = mediaP / i;
		masc = (masc * 100) / i;

		System.out.printf("a maior e a menor altura encontradas: %.2f e %.2f\n", maior, menor);
		System.out.printf("a média de altura das mulheres: %.2f\n", mediaF);
		System.out.printf("a média de altura da população: %.2f\n", mediaP);
		System.out.printf("o percentual de homens na população: %d porcento\n", masc);

		tcl.close();
	}
}
