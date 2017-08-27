/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**




*/
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       boolean k = true; 
       int n = 1;
        int o = 0;
        int x;
       int a = 0;
        System.out.println("QUAL POSIÇÃO VOCÊ DESEJA SABER O NÙMERO?");
        x = teclado.nextInt();
       int fibo[]  = new int[x];
       int fibo1[] = new int[x];
       int fibo2[] = new int [x];
        
       
        for (int i = 0; i <= fibo.length-1; i++) {
            if ((i==x) && (k = true)){
             
            n = n + o; 
            o = n-o;
            fibo[i] = n + o;   
            }
            
                 
        }
            System.out.println(n);   
            
        }
}
     
       
            
            
        
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               

