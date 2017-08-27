/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SomarMulti07Menores1000;

/**
 *
 * @author Daione
 */
public class Multi07 {
    int multi(int soma){
        int vetor[] = new int[1001];
        
        for (int i = 0; i < vetor.length; i++) {
             vetor[i] = i*7;
            if(i*7 < 1000){
                
         
            System.out.println(vetor[i]);
           
            soma+=vetor[i];

                
            } else{
                break;
            }       
        }
        
        System.out.println("");
        
        return soma;
    }
    
}
