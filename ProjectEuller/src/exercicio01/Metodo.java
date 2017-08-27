/*
If we list all the natural numbers below 
10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000. */

package exercicio01;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Metodo {
    int[] vetorSoma = new int[1000]; 
    
    public void soma(int soma){
        soma = 0; 
        for (int i = 1; i < vetorSoma.length ; i++) {
            if(i%3==0 || i%5==0 || i%9 == 0){
                soma = soma +i;
            }
        }
        System.out.println(soma);
    }
    

}
