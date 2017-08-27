/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Aula03;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class teste {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(2); 
        
        try {
            vetor.adiciona("elemento 1");
            vetor.adiciona("Elemento 2");
            vetor.adiciona("Elemento 3");
        } catch (Exception ex) {
          Logger.getLogger(teste.class.getName()).log(Level.SEVERE, null, ex);
       // ex.printStackTrace();
        }
        
    }

}
