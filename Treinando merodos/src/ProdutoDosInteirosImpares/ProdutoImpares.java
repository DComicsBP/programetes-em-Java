/*
Escreva um algoritmo que calcule o produto dos inteiros ímpares de 1 a 15 e,
então, exiba os resultados. */
package ProdutoDosInteirosImpares;

/**
 *
 * @author Daione
 */
public class ProdutoImpares {
    public static void main(String[] args){
    
      int produto = 0; 
        for (int i = 0; i < 16; i++) {
            System.out.print(i + " ");
          produto*=i;
           System.out.println(produto);
        }
        System.out.println("A soma de todos os rtermos eh: " + produto);
      
        
        
    }
}
