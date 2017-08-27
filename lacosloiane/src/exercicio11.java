/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Daione
 */
public class exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Forneça um número inteiro: ");
        int numero1 = scan.nextInt();
        
         System.out.println("Forneça outro número inteiro: ");
        int numero2 = scan.nextInt();
        
        int numero3 = numero1-numero2;
        int soma = 0;
        
        for (int i = numero1; i <= numero2; i++) {
            System.out.println(" ");
            System.out.println(i);
            soma+=i;
            
            
        }
        System.out.println(soma);
    }
}
 