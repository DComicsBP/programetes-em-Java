/*Escreva um programa para manipulação de uma conta bancária. Você tem que criar um objeto de uma
classe chamada Conta. A conta tem 3 atributos: codigo, nome e saldo. Criar os métodos depositar e sacar.
O método depositar deve ter um parâmetro para identificar qual é o valor que foi depositado no banco. Devemos
somar o valor depositado ao saldo. O método sacar deve ter um parâmetro para identificar qual é o
valor que foi sacado no banco. Devemos diminuir o valor sacado ao saldo. Lembrando que se o saldo for 0,
e se o usuário tentar sacar, então o programa imprimirá (“Saldo insuficiente!”).*/

package exercicio03;

import java.util.Scanner;
public class Conta {
    int codigo;
    String nome; 
    double saldo; 

    public Conta(int codigo, String nome, double saldo) {
        this.codigo = codigo;
        this.nome = nome;
        this.saldo = saldo;
    }
    
    Scanner scan = new Scanner(System.in); 
    
    public double depositar(double deposito){
        System.out.println("Forneca o valor a ser depositado: ");
        deposito  = scan.nextDouble(); 
        
        this.saldo = this.saldo + deposito; 
        return this.saldo; 
    }
    public double sacar(double saque){
        System.out.println("Forneca o valor a ser sacado: ");
        saque = scan.nextDouble();
    if(this.saldo>= saque){
        this.saldo = this.saldo -  saque;
    
    }else{
            System.out.println("Saldo insuficiente!");}

    return this.saldo;
    }
    public void mostraOPcoes(){
            System.out.println("O que você deseja fazer?");
            System.out.println("DIGITE [1] DEPOSITO");
            System.out.println("DIGITE [2] SAQUE");
            System.out.println("DIGITE [0] SAIR");
            
    
    }
}
