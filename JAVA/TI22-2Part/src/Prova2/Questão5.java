package Prova2;

import java.util.Scanner;

public class Questão5 {
	public static void main(String[] args) {
		Scanner tcl = new Scanner(System.in);
		// Pedra = 1 | Tesoura = 2 | Papel = 3
		String placar = "N/A";
		String jogador1 = "INV", jogador2 = "INV";
		String jogada1 = "INV", jogada2 = "INV";
		boolean stop1 = false, stop2 = false, stop3 = false;
		do {
			System.out.println("Digite o nome do Jogador 1: ");
			jogador1 = tcl.next();
			System.out.println("Digite o nome do Jogador 2: ");
			jogador2 = tcl.next();
			do {
				System.out.println("Jogador 1, sua jogada: " + "(Pedra|Papel|Tesoura)");
				jogada1 = tcl.next();
				System.out.println("Jogador 2, sua jogada: " + "(Pedra|Papel|Tesoura)");
				jogada2 = tcl.next();
				if (jogada1.equalsIgnoreCase("pedra") || jogada1.equalsIgnoreCase("papel")
						|| jogada1.equalsIgnoreCase("tesoura")) {
					// Jogada valida.
					stop1 = true;
				} else {
					// Jogada Invalida.
					stop1 = false;

				}
				if (jogada2.equalsIgnoreCase("pedra") || jogada2.equalsIgnoreCase("papel")
						|| jogada2.equalsIgnoreCase("tesoura")) {
					// Jogada valida.
					stop1 = true;
				} else {
					// Jogada Invalida.
					stop1 = false;
				}
				if (stop1 == true) {
					if (jogada1.equalsIgnoreCase("pedra") && jogada2.equalsIgnoreCase("pedra")) {
						// empate
						placar = "Empate";
					} else if (jogada1.equalsIgnoreCase("papel") && jogada2.equalsIgnoreCase("papel")) {
						// empate
						placar = "Empate";
					} else if (jogada1.equalsIgnoreCase("tesoura") && jogada2.equalsIgnoreCase("tesoura")) {
						// empate
						placar = "Empate";
					} else if (jogada1.equalsIgnoreCase("pedra") && jogada2.equalsIgnoreCase("papel")) {
						// Vitória JOGADOR 2
						placar = "Vitoria de " + jogador2;
					} else if (jogada1.equalsIgnoreCase("pedra") && jogada2.equalsIgnoreCase("tesoura")) {
						// Vitória JOGADOR 1
						placar = "Vitoria de " + jogador1;
					} else if (jogada1.equalsIgnoreCase("papel") && jogada2.equalsIgnoreCase("tesoura")) {
						// Vitória JOGADOR 2
						placar = "Vitoria de " + jogador2;
					} else if (jogada1.equalsIgnoreCase("papel") && jogada2.equalsIgnoreCase("pedra")) {
						// Vitória JOGADOR 1
						placar = "Vitoria de " + jogador1;
					} else if (jogada1.equalsIgnoreCase("tesoura") && jogada2.equalsIgnoreCase("pedra")) {
						// Vitória JOGADOR 2
						placar = "Vitoria de " + jogador2;
					} else if (jogada1.equalsIgnoreCase("tesoura") && jogada2.equalsIgnoreCase("papel")) {
						// Vitória JOGADOR 1
						placar = "Vitoria de " + jogador1;
					}
				}
				System.out.println("Resultado: " + placar + "\n");
				System.out.println("Deseja jogar de novo? " + "(S/N)");
				String val = tcl.next();
				if (val.equalsIgnoreCase("S")) {
					stop2 = false;
				} else if (val.equalsIgnoreCase("N")) {
					stop2 = true;
				} else {
					stop2 = false;
				}
			} while (stop2 == false);
			System.out.println("Deseja trocar os jogadores? " + "(S/N)");
			String val = tcl.next();
			if (val.equalsIgnoreCase("S")) {
				stop3 = false;
			} else if (val.equalsIgnoreCase("N")) {
				stop3 = true;
			} else {
				stop3 = false;
			}
		} while (stop3 == false);

		tcl.close();
	}
}
