/*Faça um algoritmo que imprima todos os números pares compreendidos 
entre
85 e 907. O algoritmo deve também calcular a soma destes valores. */
package contandode95a907esomando;

/**
 *
 * @author Daione
 */
public class ContandoDe95a907eSomando {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int soma = 0;
        int i = 85;        
        
        do {  
            i++;  
            
            soma+=i;
            
        } while (i < 907);
    System.out.println(soma);
    
    
    }
    
}
