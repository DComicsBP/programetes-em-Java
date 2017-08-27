package AreaRetangulo;

import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Retangulo r1 = new Retangulo();
        double altura, base, area = 0;
        System.out.println("Forneca a altura");
        altura = scan.nextDouble();
        System.out.println("Forneca a base: ");
        base = scan.nextDouble();
        

        
        r1.setAltura(altura);
        r1.setBase(base);
        r1.setArea(area);
        System.out.println(r1.getArea());
        
    }
    
}
