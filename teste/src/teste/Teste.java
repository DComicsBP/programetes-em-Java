/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Daione
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
           InputStreamReader dados = new InputStreamReader(System.in);
           BufferedReader teclado = new BufferedReader(dados);
           
           System.out.print("digite uma frase: ");
           String frase = teclado.readLine();
           System.out.println("Frase digitada:\t" + frase);
           
           System.out.print("\ndigite um numero inteiro: ");
           int numero = Integer.parseInt(teclado.readLine());
           
           System.out.println("Número digitado vezes dois = \t"
            + (numero * 2));
           
           System.out.print("\ndigite um numero fracionario: ");
           double flutuante = Double.parseDouble(teclado.readLine());
           
           System.out.println("Número digitado dividido por dois =\t"
           + (flutuante / 2));}
        
        catch(Exception error) {
            System.out.println("[ERRO] – "
+ "voce digitou um valor invalido" );
       
       }
    
    }

}