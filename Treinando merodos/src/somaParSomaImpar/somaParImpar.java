/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somaParSomaImpar;

import java.util.Random;

/**
 *
 * @author Daione
 */
public class somaParImpar {
     Random random = new Random();
    int somaPar(int somaPar){
       
        int vetor[] = new int[50];
        for (int i = 0; i <vetor.length; i++) {
            vetor[i] = random.nextInt(50);
            if(vetor[i] %2 == 0){
                somaPar+=vetor[i];
            }
          
        }
          System.out.println(" Soma de todos os pares gerados: " + somaPar);
      
        return somaPar;  
    }
    
    int somaImpar(int somaImpar){
        
        int vetor[] = new int[50];
        
        for (int i = 0; i <vetor.length; i++) {
            vetor[i] = random.nextInt(50);
            if(vetor[i] %2 == 1){
                somaImpar+=vetor[i];
            }
           
        }
        System.out.println(" Soma de todos os impares gerados: " + somaImpar);
        return somaImpar; 
    }
}
