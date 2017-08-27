/*
 Faça um algoritmo que imprima todos os números pares compreendidos entre
85 e 907. O algoritmo deve também calcular a soma destes valores.
 */
package Entre85e907ParesSoma;

/**
 *
 * @author Daione
 */
public class Index {
    public static void main(String[] args) {
        int soma = 0;
        ParesEntre paresEntre = new ParesEntre();
        paresEntre.pares(soma);
        System.out.println(paresEntre.pares(soma));
    }
    
}
