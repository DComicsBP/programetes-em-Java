/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registro;

import java.util.Scanner;

/**
 *
 * @author Daione
 */
public class ChamadasCorretas {
public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        Registro registro = new Registro();
        nome = scan.next();
        registro.setNome(nome);
        System.out.println(registro.getNome());
        
        /*
        Registro registro = new Registro();
        double descontaINSS, descontaIR, aumentaSal, salario;
        String nome, sobrenome;
        System.out.println("Forneca o nome do sujeito: ");
        nome = scan.next();
        registro.setNome(nome);
        
        System.out.println("Forneca o sobrenome do sujeito: ");
        sobrenome = scan.next();
        registro.setSobrenome(sobrenome);
        
        System.out.print("QUANTO " + registro.getNome() + " " + registro.getSobrenome() + " recebe?");
        salario = scan.nextDouble();
        registro.setSalario(salario);
        
        registro.aumentaSalario(salario);
        
        System.out.println(registro.descontaIR(salario));
        */
    }
    
}

