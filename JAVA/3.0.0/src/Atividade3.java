import java.util.Scanner;

public class Atividade3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String pf1 = "Candidato1";
		String pf2 = "Candidato2";
		String pf3 = "Candidato3";
		int vtpf1 = 0;
		int vtpf2 = 0;
		int vtpf3 = 0;
		int brc = 0;
		int nll = 0;
		int a = 1;
		int cont = 0;

		do {
			cont = cont + 1;
			System.out.println("Zona Eleitoral");
			System.out.println("Escolha um candidato: ");
			System.out.println("");
			System.out.println("1 - " + pf1);
			System.out.println("2 - " + pf2);
			System.out.println("3 - " + pf3);
			System.out.println("4 - Votar em Branco.");
			System.out.println("5 - Nulo");
			int escolha = teclado.nextInt();

			switch (escolha) {
			case 1:
				vtpf1 = vtpf1 + 1;
				break;
			case 2:
				vtpf2 = vtpf2 + 1;
				break;
			case 3:
				vtpf3 = vtpf3 + 1;
				break;
			case 4:
				brc = brc + 1;
				break;
			case 5:
				nll = nll + 1;
				break;
			}

			System.out.println("Digite (1) se houver mais eleitores: ");
			a = teclado.nextInt();

		} while (a == 1);

		System.out.println("Votos para o " + pf1 + " foram de: " + vtpf1);
		System.out.println("Votos para o " + pf2 + " foram de: " + vtpf2);
		System.out.println("Votos para o " + pf3 + " foram de: " + vtpf3);
		System.out.println("");
		System.out.println("Votos em branco: " + brc);
		System.out.println("Votos nulos: " + nll);
		System.out.println("Votos totais: " + (vtpf1 + vtpf2 + vtpf3));
		System.out.println("Total de Eleitores que votaram: " + cont);
		System.out.println("");

		if ((vtpf1 > vtpf2) && (vtpf1 > vtpf3)) {
			System.out.println("Com " + vtpf1 + " votos, está eleito a prefeito " + pf1 + ".");
		}
		if ((vtpf2 > vtpf1) && (vtpf2 > vtpf3)) {
			System.out.println("Com " + vtpf2 + " votos, está eleito a prefeito " + pf2 + ".");
		}
		if ((vtpf3 > vtpf2) && (vtpf3 > vtpf1)) {
			System.out.println("Com " + vtpf3 + " votos, está eleito a prefeito " + pf3 + ".");
		}
	}
}
