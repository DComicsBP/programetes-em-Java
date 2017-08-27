/*
 Construa um Algoritmo que, para um grupo de 50 valores inteiros, determine:
a) A soma dos números positivos;
b) A quantidade de valores negativos;
 */
package somaParSomaImpar;

/**
 *
 * @author Daione
 */
public class Index {
    public static void main(String[] args) {
        int impar = 0;
        int par = 0;
        
        System.out.println("Vai comecar a brincadeira: ");
        
        somaParImpar sPI = new somaParImpar();
        sPI.somaImpar(impar);
        sPI.somaPar(par);
    }
    
}
