package Lista1;

import java.util.Scanner;

public class Atividade3 {
	public static void main(String[] args) {
		Scanner tcl = new Scanner(System.in);
		int pessoas = 0;
		int cont=0;
//		int soma = 0;
		while (pessoas != 10) {
			System.out.println("Digite a idade: ");
			int idade = tcl.nextInt();
			
			if(idade>18){
				cont=cont+1;
			}
			pessoas=pessoas+1;
		} 
		
		System.out.printf("%d são maiores de 18 anos.\n", cont);
		System.out.println("Fim!");
		tcl.close();
	}
}
