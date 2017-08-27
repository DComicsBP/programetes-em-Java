package exercicio01;
import java.util.Scanner;
public class Index {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Quadrado q = new Quadrado(); 
        double lado = 0; 
        System.out.println("Forneca o valor do lado do quadrado");
        lado = scan.nextDouble(); 
        q.areaQuadrado(lado);
        q.perimetroQuadrado(lado);
        q.diagonalQuadrado(lado);
        
        
        System.out.println(q.toString());
    }

}
