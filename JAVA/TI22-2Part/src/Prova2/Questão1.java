package Prova2;

import java.util.Scanner;

public class Questão1 {
	public static void main(String[] args) {
		Scanner tcl = new Scanner(System.in);
		int idade = 0, contador = 0;
		float peso = 0, mediaI = 0, mediaP = 0;
		boolean stop = false;
		do {
			System.out.println("Digite o PESO: ");
			peso = tcl.nextFloat();
			System.out.println("Digite a IDADE: ");
			idade = tcl.nextInt();
			if (idade >= 0) {
				mediaI += idade;
				mediaP += peso;
				contador++;
			} else {
				stop = true;
			}
		} while (stop == false);
		System.out.println("Media de idade das pessoas...: " + (mediaI / contador) + "\n");
		System.out.println("Total das idade..............: " + mediaI + "\n");
		System.out.println("Media dos pesos..............: " + (mediaP / contador) + "\n");
		System.out.println("Total dos pesos..............: " + mediaP + "\n");

		tcl.close();
	}
}
