/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entre85e907ParesSoma;

/**
 *
 * @author Daione
 */
public class ParesEntre {
    int pares(int soma){
        int[] vetor = new int[908];
        for (int i = 0; i < vetor.length; i++) {
            if(i >= 0 && i < 85){
                vetor[i] = 0;
            }
            if(i >=85 && i <908 && i % 2 == 0){
                vetor[i] = i;
            }
            soma+=i;
        }
        return soma;
    }
    
}
