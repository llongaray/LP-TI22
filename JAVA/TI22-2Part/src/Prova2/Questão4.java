package Prova2;

import java.util.Scanner;

public class Questão4 {
	public static void main(String[] args) {
		Scanner tcl = new Scanner(System.in);
		String nome = "N/A", maiorN = "N/A", menorN = "N/A";
		float nota = 0, mediaT = 0, maior = 0, menor = 0, mediaA = 0;
		boolean stop = false;
		int contador = 0;
		do {
			mediaA = 0;
			contador++;
			System.out.println("Digite o PRIMEIRO nome do aluno: ");
			nome = tcl.next();
			for (int i = 1; i <= 3; i++) {
				System.out.println("Digite a " + i + "º" + " nota: ");
				nota = tcl.nextFloat();
				mediaA += nota;
				System.out.println(mediaA + "\n");
			}
			mediaA = mediaA/3;
			System.out.println(mediaA + "\n");
			if (maior == 0 && menor == 0) {
				maior = mediaA;
				menor = mediaA;
				maiorN = nome;
				menorN = nome;
			} else if (mediaA > maior) {
				maiorN = nome;
				maior = mediaA;
			} else if (mediaA < menor) {
				menorN = nome;
				menor = mediaA;
			}
			mediaT += mediaA;
			System.out.println("Deseja adicionar mais um aluno? " + "(S/N)");
			String val = tcl.next();
			if (val.equalsIgnoreCase("S")) {
				stop = false;
//				tcl.next();
			} else if (val.equalsIgnoreCase("N")) {
				stop = true;
			} else {
				stop = false;
			}

		} while (stop == false);
		System.out.println("Maior media......: " + maior + " | Aluno: " + maiorN + "\n");
		System.out.println("Menor media......: " + menor + " | Aluno: " + menorN + "\n");
		System.out.println("Media da turma...: " + (mediaT/contador) + "\n");
		tcl.close();
	}
}
