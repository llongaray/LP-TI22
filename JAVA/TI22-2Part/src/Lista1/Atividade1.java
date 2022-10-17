package Lista1;

import java.util.Scanner;

public class Atividade1 {
	public static void main(String[] args) {
		Scanner tcl = new Scanner(System.in);
		
		System.out.println("Digite um numero maior que 1: ");
		int N = tcl.nextInt();
		String define;
	    for(int cont = 1;cont<=N;cont++) {
	    	if(cont % 2 == 0) {
	    		define = "par";
	    	}
	    	else {
	    		define = "ímpar";
	    	}
	    	System.out.printf("Número %d é %s. \n", cont, define);
	    }
	    System.out.println("Fim!");
	    tcl.close();
	}
}
