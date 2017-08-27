/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicio02;

import java.util.Scanner;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Index {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        
        System.out.println("Forneca o nome: ");
        String nome = scan.next(); 
        
        System.out.println("Forneca o sobrenome: ");
        String sobrenome = scan.next();
        
        System.out.println("Forneca o salario: ");
        double salario = scan.nextDouble();
        
        
        Empregado e1 = new Empregado(nome,sobrenome,salario); 
        e1.reajuste(salario);
        System.out.println(e1.toString());
        
        System.out.println("Forneca o nome: ");
        nome = scan.next(); 
        
        System.out.println("Forneca o sobrenome: ");
        sobrenome = scan.next();
        
        System.out.println("Forneca o salario: ");
        salario = scan.nextDouble();
        
        
        Empregado e2 = new Empregado(nome,sobrenome, salario);
        System.out.println(e2.reajuste(salario));
        System.out.println(e2.toString());
        
    }

}
