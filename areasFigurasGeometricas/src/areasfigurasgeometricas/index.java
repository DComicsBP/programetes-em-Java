/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areasfigurasgeometricas;

import java.util.Scanner;

/**
 *
 * @author Daione
 */
public class index {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Forneca a base do retangulo: ");
        double base = scan.nextDouble();
        
        System.out.println("Forneca a altura do retangulo: ");
        double altura = scan.nextDouble();
        double area;
        area = areasFigurasGeometricas.areaRetangulo(altura, base);
        System.out.printf("A área é " + area);
        areasFigurasGeometricas.classiArea(area);
        System.out.println("========================================");
        
        
        System.out.println("Forneca a base do triangulo: ");
        double baseT = scan.nextDouble();
        
        System.out.println("Forneca a altura do triangulo: ");
        double alturaT = scan.nextDouble();
        double areaT;
        areaT = areasFigurasGeometricas.areaTriangulo(alturaT, baseT);
        System.out.printf("A área é " + areaT);
        
        areasFigurasGeometricas.classiArea(areaT);
        
        System.out.println("========================================");
        
        System.out.println("Forneca o raio da circunferência: ");
        double raio = scan.nextDouble();
        
        double areaC;
        areaC = areasFigurasGeometricas.areaCircunferencia(raio);
        
        System.out.println("A área da circunferência é: " + areaC);
       
        areasFigurasGeometricas.classiArea(areaC);
               
    }
    
}
