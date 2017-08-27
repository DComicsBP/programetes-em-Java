/*
  Faça um programa em Java que leia um número inteiro e indique se ele representa um ano bissexto. Um
ano bissexto é um inteiro maior do que 1584 que seja divisível por 400, ou seja divisível por 4 e não por 100.
 */
package exercicio04;
import java.util.Scanner;
public class exercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Forneca um ano: ");
        int ano = scan.nextInt();
        if(ano > 1584 && ano % 4 == 0 && ano % 100 != 0){
            System.out.println("O ano " + ano +" É ano bissexto!");
            
        }else{
            System.out.println("O ano não é bissexto! ");
        }
        
        
    }

}
