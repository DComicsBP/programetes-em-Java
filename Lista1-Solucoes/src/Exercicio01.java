
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double x;
        do {
            System.out.print("Digite o valor de X: ");
            x = entrada.nextDouble();
            double f = x * x - 5 * x + 6;
            System.out.println("F(x) = " + f);
        } while(x != 0);
    }
}
