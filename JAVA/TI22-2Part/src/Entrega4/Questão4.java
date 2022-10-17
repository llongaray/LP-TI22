package Entrega4;

import java.util.Scanner;

public class Questão4 {
	public static void main(String[] args) {
		Scanner tcl = new Scanner(System.in);
		int i = 0;
		int idade, maior = 0, menor = 0;
		String sexo = "Invalido";
		int quant = 0;
		float salario, mediaSalarial = 0;

		do {
			System.out.println("Digite a idade: ");
			idade = tcl.nextInt();
			System.out.println("Digite o sexo(em minusculo): ");
			sexo = tcl.next();
			System.out.println("Digite o salário: ");
			salario = tcl.nextFloat();

			// Média Salárial
			mediaSalarial += salario;

			// Maior e menor idade
			if (maior == 0 && menor == 0) {
				maior = idade;
				menor = idade;
			} else if (idade > maior) {
				maior = idade;
			} else if (idade < menor) {
				menor = idade;
			}

			// A quantidade de mulheres com salário até R$ 200,00;
			if (sexo.equals("feminino")) {
				if (salario <= 200) {
					quant++;
				}
			} else if (sexo.equals("masculino")) {
				// Nada acontece
			} else {
				System.out.printf("Sexo Invalido.\nNão será contabilizado.\n %s \n", sexo);
			}

			i++;
		} while (i != 300);

		mediaSalarial = mediaSalarial / i;

		System.out.printf("\n\n A média dos salários: %.2f \n A maior e menor idade: %d e %d \n", mediaSalarial, maior,
				menor);
		System.out.printf(" A quantidade de mulheres com \nsalário até R$ 200,00: %d", quant);
		tcl.close();
	}
}
