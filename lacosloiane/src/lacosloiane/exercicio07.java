/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacosloiane;
import java.util.Scanner;
/**
 *
 * @author Daione
 */
public class exercicio07 {
       public static void main(String[] args) {
        
    
   
    Scanner teclado = new Scanner(System.in);
       double vetorValor[] = new double[5];
        double numero[] = null;
        boolean bomb = true;
        
        
        for (int i = 0; i <vetorValor.length; i++) {
            System.out.println("Forneça um número: ");
            vetorValor[i] = teclado.nextDouble();
      
    
    }
        
         
        for (int i = 0; i <vetorValor.length; i++) {
            for (int q = 0; q < vetorValor.length; q++) {
              if(vetorValor[i] < numero[i]){
            bomb = true;  
            }
        }
           
            
           }
            
        
}
        


}
