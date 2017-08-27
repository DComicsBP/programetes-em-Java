import java.util.Scanner;


public class Exercicio10 {

	static void quadradoDeAsteriscos(int tamanho) {
		for(int i = 1; i <= tamanho; i++) {
			for(int j = 1; j <= tamanho; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Tamanho do quadrado: ");
		int tamanho = entrada.nextInt();
		quadradoDeAsteriscos(tamanho);
	}

}
