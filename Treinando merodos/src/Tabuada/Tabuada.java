/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabuada;

/**
 *
 * @author Daione
 */
public class Tabuada {
   
        
    
   void tabuada(){
        for (int i = 1; i <= 13; i++) {
              int a=1+i;
           System.out.println("Tabuada do " + i+ " : ");
            for (int j = 1; j <= 13; j++) {
                int tabuada = i*j;
                System.out.println(i + " X " + j + " = " + tabuada);
            }
            System.out.println("");
          
            
        }
    }
    }

