
public class TudoJunto {
		public static void main (String[] args ) {
			int valor = 48;
			String res; 
			System.out.println("Seu antecessor é "+(valor - 1));
			System.out.println("Seu sucessor é "+(valor + 1));
			System.out.println(valor + " ao quadrado é " + (valor * valor));
			System.out.println(valor + " ao cubo é " + (valor*valor*valor));
			if(valor%2==0) {
				res = "Par";
			}
			else {
				res = "Ímpar";
			}
			System.out.println("O valor " + valor + " é " + res);
		}
	}

