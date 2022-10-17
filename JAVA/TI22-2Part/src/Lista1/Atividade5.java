package Lista1;

import java.util.Scanner;

public class Atividade5 {
	public static void main(String[] args) {
		Scanner tcl = new Scanner(System.in);
		
	
	    for(int cont = 1000;cont<=1999;cont++) {
	    	if(cont % 11 == 5) {
	    		System.out.printf("Número: %d. \n", cont);
	    	}
	    	
	    }
	    System.out.println("Fim!");
	    tcl.close();
	}
}
