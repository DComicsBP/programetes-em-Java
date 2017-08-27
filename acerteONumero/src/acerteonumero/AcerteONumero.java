package acerteonumero;

import java.util.Scanner;
import java.util.Random;

public class AcerteONumero {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random gerador = new Random();

        int a = gerador.nextInt(1000);
        int b, count = 0;
        System.out.println(a);

        do {
            System.out.println("Digite um numero: entre 0 e 1000");
            b = scan.nextInt();
            if (a == b) {
                System.out.println("Parabéns, você acertou o valor! ->" + a);
            } else if (a != b && b < a) {
                System.out.println("O valor " + b + " é menor que o valor a ser advinhado! ");
            } else 
                if (a != b && b > a) {
                System.out.println("O valor " + b + " é maior que o valor a ser advinhado! ");
            }
            

            count++;
        } while (a != b);

        if (count <= 10) {
            System.out.println("Você conseguiu acertar o numero em tentativas normais");
        } else if (count < 5) {
            System.out.println("Você conseguiu acertar o número em numero de tentativas recorde");
        } else {
            System.out.println("You are dumbest!");
        }

        System.out.println("A quantidade de vezes que você tentou é " + count);
    }

}
