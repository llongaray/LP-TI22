import java.util.Scanner;

public class Atividade2 {
  public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Digite seu sálario: ");
	float sal = teclado.nextFloat();
	
	float salmin = 1212;
	float total = sal/salmin;
//	System.out.println("Você tem " + total + "x de um sálario minimo.");
	System.out.printf("Você tem %.2fx de um sálario mínimo.", total);
	teclado.close();
}
}
