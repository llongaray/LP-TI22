package Entrega4;

import java.util.Scanner;

public class Questão3 {
	public static void main(String[] args) {
		Scanner tcl = new Scanner(System.in);

		for (int i = 0; i <= 50; i++) {
			if (i % 3 == 0) {
				System.out.printf("%d ", i);
			}
		}
		System.out.printf("\nOs números acima são múltiplos de 3.");

		tcl.close();
	}
}
