import java.util.Scanner;

public class Atividade2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float mdl = 240 / 20;

		System.out.println("Digite a distancia que era percorrer: ");
		float distancia = teclado.nextFloat();
		float gas = distancia / mdl;
		System.out.println("Será necessário " + gas + " Litros de gasolina para percorrer " + distancia + " Km.");
	}
}
