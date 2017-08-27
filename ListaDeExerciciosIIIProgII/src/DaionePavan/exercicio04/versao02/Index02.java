/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicio04;

import java.util.Scanner;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Index02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        JogoDeAdvinhacao02 jogo = new JogoDeAdvinhacao02();
         
        
        System.out.println("Neste jogo você deve tentar adivinhar um número que eu sorteei entre 0 e 99");
        
      while (!jogo.terminou) {
          
            System.out.print("Digite seu palpite: ");
            int palpite = scan.nextInt();
            System.out.println(jogo.jogada(palpite));
        }
      
             
    }
    // troquei o metodo de pedir informação ao usuario pq no meu computador nao pgava a informação do teclado. 
}
