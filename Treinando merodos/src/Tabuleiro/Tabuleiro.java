/*Uma rainha requisitou os serviços de um monge e disse-lhe que pagaria
qualquer preço. O monge, necessitando de alimentos, indagou à rainha sobre o
pagamento, se poderia ser feito com grãos de trigo dispostos em um tabuleiro de
xadrez (que possui 64 casas), de tal forma que o primeiro quadro deveria conter
apenas um grão e os quadros subsequentes, o dobro do quadro anterior. Crie um
algoritmo para calcular o total de grãos que o monge recebeu.

 */
package Tabuleiro;

/**
 *
 * @author Daione
 */
public class Tabuleiro {
    int soma(int soma){
        /*Uma rainha requisitou os serviços de um monge e disse-lhe que pagaria
qualquer preço. O monge, necessitando de alimentos, indagou à rainha sobre o
pagamento, se poderia ser feito com grãos de trigo dispostos em um tabuleiro de
xadrez (que possui 64 casas), de tal forma que o primeiro quadro deveria conter
apenas um grão e os quadros subsequentes, o dobro do quadro anterior. Crie um
algoritmo para calcular o total de grãos que o monge recebeu.*/
        int aux=0;
     
        for (int i = 0; i < 64; i++) {
            aux+=1+ i*2;
          
          soma+=aux;  
            System.out.println(aux + "posicao " + i);
        }
        System.out.println(" A soma eh: " + soma);
        
        return soma;
    }
    
    
    
    
}
