import java.util.Scanner;

public class Atividade5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int maior = 0;
		int menor = 0;
		int media = 0;
		System.out.println("Digite um valor inteiro: ");
		int valor1 = teclado.nextInt();
		System.out.println("Digite um valor inteiro: ");
		int valor2 = teclado.nextInt();
		System.out.println("Digite um valor inteiro: ");
		int valor3 = teclado.nextInt();
		
		if((valor1>valor2)&&(valor1>valor3)) {
			maior = valor1;
			if(valor3<valor2) {
				menor = valor3;
			}
			else {
				menor = valor2;
			}		
		}
		if((valor2>valor1)&&(valor2>valor3)) {
			maior = valor2;
			if(valor3<valor1) {
				menor = valor3;
			}
			else {
				menor = valor1;
			}
		}
		if((valor3>valor2)&&(valor3>valor1)) {
			maior = valor3;
			if(valor1<valor2) {
				menor = valor1;
			}
			else {
				menor = valor2;
			}
		}
		
		System.out.println("O maior valor dos três é: " + maior);
		System.out.println("O menor valor dos três é: " + menor);
		System.out.println("A média dos valores é: " + ((valor1+valor2+valor3)/3));
		
		
		teclado.close();
	}
}
