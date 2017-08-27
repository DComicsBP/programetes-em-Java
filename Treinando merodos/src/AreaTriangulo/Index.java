package AreaTriangulo;
import java.util.Scanner;
public class Index {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Triangulo t1 = new Triangulo();
        double area, base, altura;
        System.out.println("Forneca a altura do triangulo");
        altura = scan.nextDouble();
        t1.setAltura(altura);
        
        System.out.println("Forneca  base do triangulo");
        base = scan.nextDouble();
        t1.setBase(base);
        System.out.println("A área do triangulo é " + t1.getArea());
    }
    
}
