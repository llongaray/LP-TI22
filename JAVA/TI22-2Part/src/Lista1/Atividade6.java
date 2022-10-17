package Lista1;

import java.util.Scanner;

public class Atividade6 {
	public static void main(String[] args) {
		Scanner tcl = new Scanner(System.in);
		int num = 1;
		System.out.println("Digite um numero maior que 1: ");
		int N = tcl.nextInt();
		for (int cont = 1; cont <= N; cont++) {
			num = num*cont;
		}
		System.out.printf("Número %d. \n", num);
		System.out.println("Fim!");
		tcl.close();
	}
}
