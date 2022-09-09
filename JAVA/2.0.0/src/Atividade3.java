import java.util.Scanner;

public class Atividade3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite suas quatro notas: ");
		float nota1 = teclado.nextFloat(), nota2 = teclado.nextFloat();
		float nota3 = teclado.nextFloat(), nota4 = teclado.nextFloat();
		
		System.out.println("Sua média é: " + ((nota1+nota2+nota3+nota4)/4));
	}
}
