package Entrega4;

import java.util.Scanner;

public class Questão6 {
	public static void main(String[] args) {
		Scanner tcl = new Scanner(System.in);
		int negativo = 0, positivo = 0;

		for (int i = 0; i < 20; i++) {
			System.out.println("Digite um valor: ");
			int valor = tcl.nextInt();

			if (valor > 0) {
				positivo += valor;
			} else {
				negativo++;
			}
		}

		System.out.printf("Soma dos positivos: %d\n", positivo);
		System.out.printf("Quantidade de negativos: %d\n", negativo);

		tcl.close();
	}
}
