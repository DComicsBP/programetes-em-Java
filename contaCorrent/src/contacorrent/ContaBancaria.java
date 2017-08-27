/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacorrent;

/**
 *
 * @author Daione
 */
public class ContaBancaria {

    String tipoConta = "cc";
    String nomeDono = "Daione";
    boolean abrirConta = true;
    boolean fecharConta = false;
    double saldoConta  = 50;
    boolean status = true;
    
    
    
public static void tipoConta(String tipoConta){
tipoConta = "conta corrente";
    
}
public static void nomeDono(String nomeDono){
nomeDono = "Daione";
}

public static void conta(int numeroConta){
    numeroConta = 1234;
    
}
public static void saldo(double saldoConta){
    saldoConta = 234.52;
    
}
public static void contaAberta(boolean status){
    status = false; 
}

}