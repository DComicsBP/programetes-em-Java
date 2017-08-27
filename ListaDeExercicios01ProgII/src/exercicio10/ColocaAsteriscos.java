/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicio10;

import java.util.Scanner;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ColocaAsteriscos {
    String[] asteriscos;
    
    public void colocaAsteriscos(){
         Scanner scan = new Scanner(System.in);
         System.out.println("QUal o lado do quadrado de asteriscos? ");
         int num = scan.nextInt();
         String[] vetor = new String[num];
         for (int i = 0; i < vetor.length; i++) {
             for (int j = 0; j < vetor.length; j++) {
                 System.out.print("*");
                 
             }
             System.out.println("");
             
         }
         System.out.println("");
         
     }

    

}
