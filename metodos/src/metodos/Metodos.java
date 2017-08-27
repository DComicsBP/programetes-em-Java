/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.util.Scanner;

/**
 *
 * @author Daione
 */
public class Metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a base do retangulo");
          double base = scan.nextDouble();
          
          System.out.println("Informe a altura do retangulo");
          double altura = scan.nextDouble();
          
       double areaRet = retangulo(base, altura);
        System.out.println(areaRet);
       
    }
    
      public static double retangulo(double altura, double base) {// eh outro metodo com outras instrucoes
          Scanner scan = new Scanner(System.in);
          //double base, altura, areaRet, areaTot = 0;
          // apenas trocar o void por double nao garante
          // que o programa vai retornar um valor que se deseja
          // por isso eh importante colocar o return com a variavel 
          // que tem o valor que precisa ser retornado. 
          
          
          /*System.out.println("Informe a base do retangulo");
          base = scan.nextDouble();
          
          System.out.println("Informe a altura do retangulo");
          altura = scan.nextDouble();
          areaRet = altura*base;
          System.out.println("A altura eh" + areaRet);
          //areaTot+=areaRet;
          //System.out.println(areaTot);
          return areaRet;*/
          
          double areaRet = altura*base;
          return areaRet;
      }
    
}
