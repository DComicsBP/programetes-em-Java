/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SomaDasMedias;

import java.util.Scanner;

/**
 *
 * @author Daione
 */
public class SomaDasMedias{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        boolean a = true;
        String[] nomes;
       String aux;
        nomes = new String[5];
        double[] notas = new double[5];
        double soma = 0, media;
        
        
        for (int i = 0 ; i <= 4 ; i++){
            System.out.print("Entre com o nome do aluno nº " + (i+1) + " ");
            nomes[i] = new Scanner(System.in).nextLine();
            System.out.print("Entre com a nota do aluno (a) " + nomes[i] + " ");
            notas[i] = new Scanner(System.in).nextDouble();
            soma = soma + notas[i];
            System.out.println("   ");
        }
        
        for (int i = 0; i <=4; i++) {
            System.out.println("O PROGRAMA FOI CHAMADO ");
            for (int j = 0; j <= 4; j++) {
                if ( nomes[i].compareToIgnoreCase(nomes[j]) > 0 ){
                 a = true;
                    
                aux = nomes[j];
                nomes[j] = nomes[j+1];
                nomes[j+1]  = aux;     
                }
                else{
                    a = false;
                    break;
                }
            }
                
            System.out.println("A ordem correta é ");
                for (int j = 0; j <=4; j++) {
                    System.out.println(nomes[j]);
            }
            
        }
        media = soma / 5;
        System.out.println("A média dos alunos é: " + media);
        System.out.println("  ");
        System.out.println("Lista dos alunos cuja nota é superior a média da turma");
        for(int i = 0; i <= 4; i++) {
            if(notas[i] > media)
                System.out.println(nomes[i]);    
        }
    }
}

