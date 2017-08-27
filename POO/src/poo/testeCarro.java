/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Daione
 */
public class testeCarro {
    public static void main(String[] args) {
        Carro van = new Carro();
        van.marca = "Fiat";
        van.tipoDeCarro = "Ducato";
        van.numPas = 10;
        van.capacidade = 30;
        System.out.println("Van: ");
        System.out.println(van.capacidade);
        
          Carro fusca = new Carro();
        fusca.marca = "Fiat";
        fusca.tipoDeCarro = "Ducato";
        fusca.numPas = 10;
        fusca.capacidade = 30;
        
        System.out.println(fusca.marca);
         System.out.println(van.tipoDeCarro);
          System.out.println(van.numPas);
           System.out.println(van.capacidade);
    }
    
}
