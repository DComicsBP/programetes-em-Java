
import java.util.Scanner;

/**
 *
 * @author leonardo
 */
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Lado A: ");
        double A = entrada.nextDouble();
        System.out.print("Lado B: ");
        double B = entrada.nextDouble();
        System.out.print("Lado C: ");
        double C = entrada.nextDouble();
        
        if(A+B > C && A+C > B && B+C > A) {
            if(A == B && A == C) {
                System.out.println("O triângulo é EQUILATERO.");
            } else if(A != B && A != C && B != C) {
                System.out.println("O triângulo é ESCALENO.");
            } else {
                System.out.println("O triângulo é ISÓSCELES.");
            }
        } else {
            System.out.println("Os lados informados não formam um triângulo.");
        }
    }
}
