import java.util.Scanner;

public class Atividade3 {
	public static void main(String[] agrs) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um valor inteiro: ");
		int valor = teclado.nextInt();
		int res=0;
		for(int n = valor;n!=1;n--) {
			if(n==valor){
				res = res+n;
			}
			else {
				res = res*n;
			}
		}
		System.out.printf("O fatorial de %d é %d", valor, res);
		teclado.close();
	}
}
