import java.util.Scanner;


public class Exercicio05 {

    // Este método é responsável por criar um vetor e preenchê-lo com valores digitados pelo usuário.
    static double[] leVetor(String nome) {
        Scanner entrada = new Scanner(System.in);
        double[] vetor = new double[5];

        for(int i = 0; i < vetor.length; i++) {
            System.out.printf("%s[%d]: ", nome, i);
            vetor[i] = entrada.nextDouble();
        }

        System.out.println();

        return vetor;
    }

    // Recebe dois vetores e constrói um terceiro, contendo as multiplicações dos valores armazenados em
    // cada posição dos dois vetores passados como parâmetro.
    static double[] somaVetores(double[] v1, double[] v2) {
        double[] result = new double[v1.length];

        for(int i = 0; i < result.length; i++) {
            result[i] = v1[i] * v2[i];
        }

        return result;
    }

    static void mostraVetor(double[] vetor) {
        for(int i = 0; i < vetor.length; i++) {
            System.out.printf("resultado[%d] = %f\n", i, vetor[i]);
        }
    }

    public static void main(String[] args) {
        double[] res = somaVetores(leVetor("vetor1"), leVetor("vetor2"));
        mostraVetor(res);
    }

}
