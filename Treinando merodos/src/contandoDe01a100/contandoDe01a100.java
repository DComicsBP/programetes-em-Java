/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contandoDe01a100;

/**
 *
 * @author Daione
 */
public class contandoDe01a100{
    int contando(int soma){
        soma = 0;
        int[] vetor = new int[101];
        
        for (int i = 0; i <vetor.length; i++) {
            vetor[i] = i;
           
           soma+=i;
        }
      
           System.out.println(soma);
        return soma;
        }
}
            
    
