import java.util.Scanner;

public class Atividade1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o valor do cateto oposto: ");
		int CO = teclado.nextInt();
		System.out.println("Digite o valor do cateto adjacente: ");
		int CA = teclado.nextInt();
		int CO2 = CO*CO;
		System.out.println(CO2);
		int CA2 = CA*CA;
		System.out.println(CA2);
		int hip = CO2 + CA2;
		System.out.println(hip);
		System.out.printf("A hipotenusa do trinagulo é: %.0f", Math.sqrt(hip));
		teclado.close();
	}
}
