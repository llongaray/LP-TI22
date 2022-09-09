import java.util.Scanner;

public class Atividade4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite sua altura em metros: ");
		float altura = teclado.nextFloat();
		
		altura = altura * 100;
		System.out.println("Sua altura em 'cm' é: " + altura + "cm.");
	}
}
