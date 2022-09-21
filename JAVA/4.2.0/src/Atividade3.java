import java.util.Scanner;

public class Atividade3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int vef = 0;
		System.out.println("Digite um valor inteiro: ");
		int valor = teclado.nextInt();
		
		if(valor==1) { 
			System.out.println("Janeiro"); 
			vef = 1;
		}

		if(valor==2) { 
			System.out.println("Fevereiro"); 
			vef = 1;
		}

		
		if(valor==3) { 
			System.out.println("Março"); 
			vef = 1;
		}
		
		if(valor==4) { 
			System.out.println("Maio");
			vef = 1;
		}
		
		if(valor==5) { 
			System.out.println("Abril"); 
			vef = 1;
		}
		
		if(valor==6) { 
			System.out.println("Junho"); 
			vef = 1;
		}
		
		if(valor==7) { 
			System.out.println("Julho"); 
			vef = 1;
		}
		
		if(valor==8) { 
			System.out.println("Agosto"); 
			vef = 1;
		}
		
		if(valor==9) { 
			System.out.println("Setembro"); 
			vef = 1;
		}
		
		if(valor==10) { 
			System.out.println("Outubro"); 
			vef = 1;
		}
		
		if(valor==11) { 
			System.out.println("Novembro"); 
			vef = 1;
		}
		
		if(valor==12) { 
			System.out.println("Dezembro"); 
			vef = 1;
		}
		if(vef==0){
			System.out.println("Valor ínvalido!");
		}
		
		teclado.close();
	}
}
