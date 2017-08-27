/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Index {
    public static void main(String[] args) {
        Dias d = new Dias(); 
        int dias = 0; 
        
        d.anos();
        
        d.escolheMes();
        d.condicoes();
        
        
        d.diaNascimento();
        System.out.println(d.calculaEmDias());
        
        
        
    }

}
