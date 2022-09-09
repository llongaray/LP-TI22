import java.util.Scanner;

public class Atividade1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite dois valores: ");
		float a= teclado.nextFloat(), b=teclado.nextFloat();
		
		System.out.println("Digite dois valores: " + a + " e " + b);
		
			System.out.println("Soma: " + (a+b));
			System.out.println("Subtração A-B: " + (a-b));
			System.out.println("Subtração B-A: " + (b-a));
			System.out.println("Multiplicação: " + (a*b));
			System.out.println("Divisão de A por B: " + (a/b));
			System.out.println("Divisão de B por A: " + (b/a));
			System.out.println("Resto de A por B: " + (a%b));
			System.out.println("Resto de B por A: " + (b%a));
	}
}
