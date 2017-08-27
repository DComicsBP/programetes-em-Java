/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuadradosECubosDeNumeros;

/**
 *
 * @author Daione
 */
public class QuadradosCubos {

    void quaCub() {
        double[] aux01 = new double[10];
        double[] aux02 = new double[10];

        double por = 0;
        double bor = 0;
        for (int i = 0; i < 10; i++) {
            por = Math.sqrt(i);
            bor = Math.cbrt(i);
            aux01[i] = por;
            aux02[i] = bor;

        }

        System.out.println(" Numero     Raiz quadrada    Raiz Cubica");
        for (int i = 0; i < 10; i++) {
         System.out.printf("   %d             %.2f           %.2f    \n", i,aux01[i],aux02[i]);
            
        }

    }
}

