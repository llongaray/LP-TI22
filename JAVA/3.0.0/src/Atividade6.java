import java.util.Scanner;

public class Atividade6 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o seu sálario bruto: ");
		Double valb = teclado.nextDouble();
//		System.out.println(valb);
		System.out.println("Digite o valor de seu comissão no mês: ");
		Double valc = teclado.nextDouble();
//		System.out.println(valc);
		System.out.println("Digite o valor de desconta da folha de pagamento: ");
		Double vald = teclado.nextDouble();
//		System.out.println(vald);

		Double valt = (valb + valc) - vald;
//		System.out.println((valb + valc));

		System.out.println("Seu sálario líquido é de: " + valt);
	}
}
 