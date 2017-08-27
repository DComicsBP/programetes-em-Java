package Aula05;

import Aula04.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class teste {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(20); 
        
        
            vetor.adiciona02("elemento 1");
            vetor.adiciona02("Elemento 2");
        
        System.out.println(vetor.busca(0));
        
        
    }

}
