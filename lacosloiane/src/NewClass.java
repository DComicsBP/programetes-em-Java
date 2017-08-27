
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daione
 */
public class NewClass {
    
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        Random gerador = new Random();
        
        System.out.println("====================\t");
        System.out.println("Vai começar o jogo!!\t");
        System.out.println("====================\t");
        String resp;
        int number1;
        int number2;
        
        number1 = gerador.nextInt(1000);
        System.out.println(number1);
        do{
            System.out.println("Forneça um número entre 0 e 1000");
            number2 = scan.nextInt();
            if(number2<number1){
                System.out.println("O numero é menor que o número sorteado");
            }
            if(number2>number1){
                System.out.println("O numero é maior que o número sorteado");
            }
            
        }while(number1!=number2);
System.out.println(number1);


        
    }
}
    

