import java.util.Scanner;


public class Exercicio07 {

    // Este método cria e lê um vetor de 10 números inteiros. 
    static int[] leVetor() {
        Scanner entrada = new Scanner(System.in);
        int[] vetor = new int[10];

        for(int i = 0; i < vetor.length; i++) {
            System.out.printf("vetor[%d]: ", i);
            vetor[i] = entrada.nextInt();
        }
        return vetor;
    }
	
    // Este método recebe um vetor e retorna uma cópia dele com as modificações solicitadas no exercício.
    static int[] realizaCalculos(int[] vetor) {
        int[] result = new int[vetor.length];
        for(int i = 0; i < vetor.length; i++) {
            if(i % 2 == 0)
                result[i] = vetor[i] * 2;
            else
                result[i] = vetor[i] * 3;
        }
        return result;
    }
	
    public static void main(String[] args) {
        int[] resultado = realizaCalculos(leVetor());

        System.out.println();

        for(int i = 0; i < resultado.length; i++) {
            System.out.printf("resultado[%d] = %d\n", i, resultado[i]);
        }
    }

}
