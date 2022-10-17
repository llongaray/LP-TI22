package Lista1;

import java.util.Scanner;

public class Atividade4 {
	public static void main(String[] args) {
		Scanner tcl = new Scanner(System.in);
		
		int maior=0;
		int menor=0;
	    for(int cont = 1;cont<=5;cont++) {
	    	System.out.println("Digite um numero inteiro: ");
	    	int escreval = tcl.nextInt();
	    	if(escreval>maior) {
	    		if(maior<menor) {
	    			menor=maior;
	    		}else if(menor==0) {
	    			menor=maior;
	    		}
	    		maior=escreval;
	    	}
	    	if(escreval<menor) {
	    		menor = escreval;
	    	}
	    	if(menor == 0 && escreval<maior) {
	    		menor = escreval;
	    	}
	    }
	    System.out.printf("O maior número é %d e o menor é %d. \n", maior, menor);
	    System.out.println("\n\nFim!");
	    tcl.close();
	}
}
