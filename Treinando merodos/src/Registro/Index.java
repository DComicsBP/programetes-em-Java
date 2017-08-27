package Registro;

import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Registro r1 = new Registro();
        double salario = 0;
        System.out.println("====================================");
        System.out.println("        EMPRESA PARAISO FISCAL");
        System.out.println("====================================");
        System.out.println("REGISTRO DE PESSOAL");
        
       r1.insiraDados();
       r1.aumentaSalario(salario);
       r1.descontaIR(salario);
       r1.printDados();
        
       }
}

