import java.util.Scanner;

public class Atividade5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Double valort = 0.0;

		System.out.println("Digite o valor de fábrica do veículo: ");
		Double valorf = teclado.nextDouble();
		valort = valort + valorf;
//		System.out.println(valorf);
		System.out.println("Digite a porcentagem do vendedor: ");
		Double valorp = teclado.nextDouble();
		valort = valort+(valorf*(valorp/100));
//		System.out.println(valorp);
//		System.out.println((valorp/100));
		System.out.println("Digite a tárifa de imposto: ");
		Double valorimp = teclado.nextDouble();
		valort = valort+(valorf*(valorimp/100));
//		System.out.println(valorimp);
//		System.out.println((valorimp/100));
		
		System.out.println("O valor a pagar pelo veículo é de " + valort);
	}
}
