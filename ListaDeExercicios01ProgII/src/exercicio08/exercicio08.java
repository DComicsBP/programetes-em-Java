/*Um número primo é qualqu
er inteiro maior que 1 que é igualmente divisível apenas por si mesmo e por 1.
O crivo de Eratóstenes é um método de encontrar números primos. Ele funciona como segue:

a) Crie um array do tipo boolean. Como vamos mostrar todos os números primos de 0 a 999, crie o vetor
com tamanho 1000. Inicie todos os elementos com o valor true.

b) Percorra o array iniciando a partir da posição 2. Para toda posição que contiver true, faça um outro for
que percorra o array colocando false em todas as posições cujos índices sejam divisíveis pela posição selecionada
no primeiro for. Ou seja, serão dois fors, um dentro do outro.

c) Ao final, todas as posições que contiverem true a partir da posição 2 indicam números primos. Mostre osnúmeros
dessas posições.
 */
package exercicio08;
public class exercicio08 {
    public static void main(String[] args) {

        int i, j, cont = 0;
        boolean[] primo = new boolean[10];
        for (i = 2; i < 1000; i++) {
            primo[i] = true;
            for (j = 2; j < i; j++) {
                
                if (i % j == 0) {
                    primo[i] = false;
                    break;
                    }else{
                    cont+=i;
                }
                
                }
            
            
                System.out.println(primo[i] + " é primo " + i);
                System.out.println(cont);
            
        }
    }
}
