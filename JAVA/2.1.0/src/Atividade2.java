import java.util.Scanner;

public class Atividade2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o Sálario1: ");
		double sal1 = teclado.nextDouble();
		System.out.println("Digite o Sálario2: ");
		double sal2 = teclado.nextDouble();
		
		System.out.println("O total dos salários de sua família é de " + (sal1 + sal2) +".");
	}
}
