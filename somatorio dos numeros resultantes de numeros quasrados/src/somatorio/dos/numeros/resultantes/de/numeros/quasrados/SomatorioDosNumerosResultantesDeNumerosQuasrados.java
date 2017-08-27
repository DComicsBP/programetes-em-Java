/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somatorio.dos.numeros.resultantes.de.numeros.quasrados;

/**
 *
 * @author Daione
 */
public class SomatorioDosNumerosResultantesDeNumerosQuasrados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 1; i < 100; i++) {
            soma = soma++ + i++;
            System.out.println(soma);
                    }
        System.out.println(soma);

    }
    
}
