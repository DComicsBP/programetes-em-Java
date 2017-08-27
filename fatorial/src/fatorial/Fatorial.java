/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatorial;

import java.util.Scanner;

/**
 *
 * @author Daione
 */
public class Fatorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
       
        String resp;
        
        
    
    do{
       System.out.println("Digite um numero inteiro:");
        int n = teclado.nextInt();   
       
        int f = 1; 
        int c = n; 
       
         
                
    
    while (c >=1){
            f*=c;
            c--;
            
          }
        System.out.println(f);
        
        System.out.println("Você deseja calcular outro fatorial? [S/N]");
            resp = teclado.next();
            
        }while(resp.equals("s"));
    }
    
}
    

