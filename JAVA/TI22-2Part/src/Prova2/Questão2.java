package Prova2;

import java.util.Scanner;

public class Questão2 {
	public static void main(String[] args) {
		Scanner tcl = new Scanner(System.in);
		float somaP = 0, quantP = 0;
		float multN = 0, quantN = 0;
		boolean stop = false;
		String vrf = "invalid";
		do {
			System.out.println("Digite um numero: ");
			float numero = tcl.nextFloat();

			if (numero >= 0) {
				somaP += numero;
				quantP++;
			} else {
				if (multN == 0) {
					multN = 1;
				}
				multN *= numero;
				quantN++;
			}

			System.out.println("Deseja continuar? ");
			vrf = tcl.next();
			if (vrf.equalsIgnoreCase("S")) {
				stop = false;
			} else if (vrf.equalsIgnoreCase("N")) {
				stop = true;
			} else {
				System.out.println("\n\n\nValor invalido!!!\n\n");
				stop = true;
			}
		} while (stop == false);
		System.out.println("Soma dos positivos...........: " + somaP + "\n");
		System.out.println("Quantidade de positivos......: " + quantP + "\n");
		System.out.println("Multiplicacao dos negativos..: " + multN + "\n");
		System.out.println("Quantidade de negativos......: " + quantN + "\n");
		tcl.close();
	}
}
