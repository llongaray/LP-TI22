import java.util.Scanner;

public class area {
	public static void main (String[] args ) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a base: ");
		int base = teclado.nextInt();
		System.out.println("Digite a altura: ");
		int altura = teclado.nextInt();
		
		System.out.println("A área do triangolo é: "+(base * altura));
	}
}
