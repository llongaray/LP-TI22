package Lista1;

import java.util.Scanner;

public class AtividadeExtra7 {
	public static void main(String[] args) {
		Scanner tcl = new Scanner(System.in);
		
		
	    for(int cont = 0;cont<10;cont++) {
	    	System.out.println("Digite um numero maior que 1: ");
	    	int N = tcl.nextInt();
	    	for(int cont2 = 0; cont2<=10;cont2++) {
	    		System.out.println(N + " x " + cont2 + " = " + (N*cont2));
	    	}
	    }
	    System.out.println("Fim!");
	    tcl.close();
	}
}
