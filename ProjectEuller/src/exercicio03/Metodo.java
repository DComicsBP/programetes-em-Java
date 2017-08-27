/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ? */

package exercicio03;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Metodo {
boolean ehPrimo;

public void ehPrimo(){
    
    for (int i = 2; i < 600851475143.00; i++) {
        ehPrimo = true; 
        for (int j = 2; j < i; j++) {
            if(i%j==0){
                ehPrimo = false; 
           break;      
            }
            
            }
        if(ehPrimo == true){
                if(600851475143.00%i == 0){
                    System.out.println("Divisor: " + i);
                    
                }
        
            }
                
           
        }
       // System.out.println("Eh primo = " + ehPrimo[i] + " posicao " + i);
    }

    
}
