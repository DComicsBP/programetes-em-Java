/*Faça um algoritmo que calcule o valor de A, dado por:
N
A N N N ... 1
3
 */
package somandofracoes;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Daione
 */
public class SomandoFracoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner  teclado = new Scanner(System.in);
        float n[] = new float [10];
        float v;
        float soma = 0; 
       
        System.out.println("Insira um valor");
         v = teclado.nextFloat();
         System.out.println("O valor insirido é: " + v );
         
         
        for (int i = 0; i < 10; i++) {
        
            
            
            float p = (v-i)/(i+1);
            
            Arrays.fill( n, p );
            
            System.out.println(n[i]);
            
            soma = soma + p;
              
            
        }
        
        System.out.println("A soma das frações é: " + soma);
        
        
        
        
        
    }
            
           
           
        
        
             
}
    
        

    


