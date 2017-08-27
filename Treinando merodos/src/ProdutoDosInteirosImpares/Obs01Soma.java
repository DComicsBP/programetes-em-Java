/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProdutoDosInteirosImpares;

/**
 *
 * @author Daione
 */
public class Obs01Soma {
  
    public static void main(String[] args){
    
      int soma = 0; 
        for (int i = 0; i < 16; i++) {
            System.out.print(i + " ");
          soma+=i;
           System.out.println(soma);
        }
        System.out.println("A soma de todos os rtermos eh: " + soma);
      
        
        
    }
}

