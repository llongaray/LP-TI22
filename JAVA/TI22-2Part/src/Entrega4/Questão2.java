package Entrega4;

import java.util.Scanner;

public class Questão2 {
	public static void main(String[] args) {
		Scanner tcl = new Scanner(System.in);
		int valor;

		for (int i = 0; i < 15; i++) {
			System.out.println("Digite um valor: ");
			valor = tcl.nextInt();

			System.out.println("Seu antecessor: " + (valor - 1));
			System.out.println("Seu sucessor: " + (valor + 1));
			System.out.println("Seu valor ao quadrado: " + (valor * valor));
			System.out.println("Seu valor ao dobro: " + (valor * 2));
			System.out.println("Sua metado: " + (valor / 2));
		}

		tcl.close();
	}
}
