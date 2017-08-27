/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author Daione
 */
public class vetorParMet {
    public static void main(String[] args) {
        int[] abc = {1, 2, 3, 4};
        
        int x = 10;
        vetor(abc);
        variavelPrimitiva(x);
                
    }
    public static void vetor(int[] x) {
        System.out.println(x[0]);
        
    }
    public static void variavelPrimitiva(int x) {
        System.out.println(x);
    }
    }
