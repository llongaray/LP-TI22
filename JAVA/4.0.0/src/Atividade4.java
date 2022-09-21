import java.util.Scanner;

public class Atividade4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um numero interiro: ");
		int num = teclado.nextInt();
		int n = 0;
		do {
			int res = num*n;
			System.out.println(num + " x " + n + " = " + res);
			n++;
		}while(n!=11);
		
		teclado.close();
	}
}
