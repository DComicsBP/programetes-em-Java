/*
Faça um algoritmo que calcule o valor de A, dado por:
A = N + (N-1)/2 + (N-2)/3....
 onde N é um número inteiro positivo.
 */
package Fatoracao;

import java.util.Scanner;

/**
 *
 * @author Daione
 */
public class Fatoracao {
    void somaFator(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Forneca o numero que vc deseja testar: ");
        double number = scan.nextDouble();
        double aux;
        for (int i = 0; i <number; i++) {
            aux = (number-i)/(1+i);
            System.out.println(aux);
        }
        
        }
                
    }
    
     