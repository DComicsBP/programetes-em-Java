/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacosloiane;

import java.util.Scanner;

/**
 *
 * @author Daione
 */
public class exercicio04 {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        
       double popA = 80000;
       double popB = 200000;
       double taxaA = 0.03;
       double taxaB = 0.015;
       double cresciA, cresciB;
       int ano;
       boolean igualdadeAB = true;
       
       
       
       do{
        System.out.println("forneça a quantidade em ano que você desejatestar e ver se a=b");
        ano = teclado.nextInt();
        
        cresciA = 80000 + (80000*0.03)*ano;
        cresciB = 200000 + (200000*0.015)*ano;
       
        
       if (cresciA == cresciB){
           igualdadeAB = true;
           System.out.println("Quantidade de pessoas na cidade A " + cresciA);
           System.out.println("Quantidade de pessoas na cidade B " + cresciB);
           System.out.println("Em " + ano + " anos a cidade A terá a mesma quantidade de pessoas que na cidade A");
       
               }else{
           igualdadeAB = false;
           System.out.println("Quantidade de pessoas na cidade A" + cresciA);
           System.out.println("Quantidade de pessoas na cidade B" + cresciB);
       } 
       
           
          


       }while(!igualdadeAB);
    }
    
}



   
