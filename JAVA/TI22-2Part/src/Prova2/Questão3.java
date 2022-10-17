package Prova2;

import java.util.Scanner;

public class Questão3 {
	public static void main(String[] args) {
		Scanner tcl = new Scanner(System.in);
		float numero = 0;
		float somaP = 0, quantP = 0, positivos = 0;
		float somaI = 0, quantI = 0;
		boolean stop = false;
		do {
			System.out.println("Digite um numero: ");
			numero = tcl.nextFloat();
			if (numero >= 0) {
				positivos++;
				if (numero % 2 == 0) {
					somaP += numero;
					quantP++;
				} else {
					somaI += numero;
					quantI += numero;
				}
			} else {
				System.out.println("Valor invalidao!!!\n");
				System.out.println("Digitar novamente? " + "(S/N)");
				String val = tcl.next();
				if (val.equalsIgnoreCase("S")) {
					stop = false;
				} else if (val.equalsIgnoreCase("N")) {
					stop = true;
				} else {
					stop = false;
				}
			}
			if (positivos == 10) {
				stop = true;
			}
		} while (stop == false);
		System.out.println("Soma dos pares...........: " + somaP + "\n");
		System.out.println("Quantidade de pares......: " + quantP + "\n");
		System.out.println("Soma dos Impares.........: " + somaI + "\n");
		System.out.println("Quantidade dos Impares...: " + quantI + "\n");

		tcl.close();
	}
}
