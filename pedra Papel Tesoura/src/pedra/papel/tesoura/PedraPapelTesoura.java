/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedra.papel.tesoura;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Daione
 */
public class PedraPapelTesoura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Random gerador = new Random();
       Scanner teclado = new Scanner(System.in);             
        
        String resp = null, s = null, a, 
                papel = null, pedra = null, tesoura = null;
        int countWin1 = 0, countWin2 = 0, countWin3 = 0;
        
        //a é a resoosta: se é pedra, papel ou tesoura 
        //resp = s/n
        
        
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("               Pedra, papel, tesoura");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
        
        
          
               
                
                do{ 
                     int n = gerador.nextInt(3);
                    
                    System.out.println("Você escolhe pedra, papel ou tesoura? ");
                    a = teclado.next();
                    
                    if (a.equals("papel")){
                                               
                        if (n==0){
                        System.out.println("Pedra");
                        System.out.println("você ganhou!");
                        countWin1++;
                       } 
                        if (n==1){
                            System.out.println("Tesoura");
                            System.out.println("você perdeu!");
                            countWin2++;
                               } 
                        if (n==2) {
                            System.out.println("Papel");
                            System.out.println("Empate");
                            countWin3++;
                        }
                            
                    }   
                           
                        
                    if (a.equals("pedra")){
                        
                        if (n==0){
                            System.out.println("Pedra");
                            System.out.println("Empate!");
                            countWin3++;
                       } 
                        if (n==1){
                            System.out.println("Tesoura");
                            System.out.println("você ganhou!");
                            countWin1++;
                                   } 
                        if (n==2) {
                            System.out.println("Papel");
                            System.out.println("Você perdeu");
                            countWin2++;
                                  }
                        
                        
                    }
                    
                    if (a.equals("tesoura")){
                       
                        if (n==0){
                        System.out.println("Pedra");
                        System.out.println("você perdeu!"); 
                        countWin2++;
                                } 
                        if (n==1){
                            System.out.println("Tesoura");
                            System.out.println("Empate!");
                            countWin3++;
                               } 
                        if (n==2) {
                            System.out.println("Papel");
                            System.out.println("Você ganhou!");
                            countWin1++;
                    }
                    
                        
                        
                }
                    
                    System.out.println("Quer jogar novamente? [S/N]");
                    resp = teclado.next();
                    
                    } while(resp.equals("s"));
                
                System.out.println("Vitórias: " + countWin1);
                System.out.println("Empates: " + countWin3);
                System.out.println("Derrotas: " + countWin2);
        System.out.println("Fim de jogo");        
                 }        
                        
             }
