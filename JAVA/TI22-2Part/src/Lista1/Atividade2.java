package Lista1;

import java.util.Scanner;

public class Atividade2 {
	public static void main(String[] args) {
		Scanner tcl = new Scanner(System.in);

		System.out.println("Digite um numero maior que 1 de usuários: ");
		int N = tcl.nextInt();
		
		int soma = 0;
		String define;
		
		for (int cont = 1; cont <= N; cont++) {
			soma = soma + cont;
		}
		if (soma > 100) {
			define = "maior";
		} else if (soma < 100) {
			define = "menor";
		} else {
			define = "igual";
		}
		System.out.printf("\nA soma dos números é %d, sendo %s que 100.\n", soma, define);
		System.out.println("\nFim!");
		tcl.close();
	}
}
