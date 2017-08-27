/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacosloiane;
import java.util.Scanner;
/**
 *
 * @author Daione
 */
public class exercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
       double popA;
       double popB;
       double taxaA;
       double taxaB;
       double cresciA, cresciB;
       int ano=0;
       boolean igualdadeAB = false;
       
       
       
       do{
           System.out.println("Forneça a quantidade de pessoas de população em A: ");
           popA = teclado.nextDouble();
           
           System.out.println("Forneça a taxa de crescimento da população A [forneça na forma decimal]: ");
           taxaA = teclado.nextDouble();
           
           System.out.println("Forneça a quantidade de pessoas de população em B : ");
           popB = teclado.nextDouble();
           
           System.out.println("Forneça a taxa de crescimento da população B [forneça na forma decimal]: ");
           taxaB = teclado.nextDouble();
           
           ano++;
        cresciA = popA + (popA*taxaA)*ano;
        cresciB = popB + (popB*taxaB)*ano;
       
       }while(!igualdadeAB);
    
    if (cresciA == cresciB){
           igualdadeAB = true;
           System.out.println("Quantidade de pessoas na cidade A " + cresciA);
           System.out.println("Quantidade de pessoas na cidade B " + cresciB);
           System.out.println("Em " + ano + " anos a cidade A terá a mesma quantidade de pessoas que na cidade B");
       
               }else{
           igualdadeAB = false;
           System.out.println("Quantidade de pessoas na cidade A" + cresciA);
           System.out.println("Quantidade de pessoas na cidade B" + cresciB);
       }
    
    }
    
}
