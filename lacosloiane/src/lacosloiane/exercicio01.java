/*Faça um programa que peça uma nota, entre zero e dez. Mostre uma
mensagem caso o valor seja inválido e continue pedindo até que o
usuário informe um valor válido. */

package lacosloiane;

import java.util.Scanner;

/**
 *
 * @author Daione
 */
public class exercicio01 {

    
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        double nota;
        boolean notaValida = false;
        
        
        do{
             System.out.println("Insira a nota: ");
             nota = teclado.nextDouble();
       
        if((nota >= 0) && (nota <= 10)){
            notaValida = true;
            System.out.println("A nota fornecida: " + nota);
                    } else{
            System.out.println("Nota inválida, digite noamente");
        }
        }while(!notaValida);
    
    
    }
    
}
