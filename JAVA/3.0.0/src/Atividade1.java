import java.util.Scanner;

public class Atividade1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int pao = 100;
		int horas = 4;
		int md = pao / horas;

		System.out.println("Digite quantas horas você trabalhou: ");
		int RcHr = teclado.nextInt();
		int mdprod = md * RcHr;
		System.out.println("Você produziu em " + RcHr + " horas: " + mdprod + " pães.");
	}
}
