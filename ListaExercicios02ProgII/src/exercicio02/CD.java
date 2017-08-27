/*Construa um programa em Java que simule a operação de um CD Player tocando um CD. Para isso, implemente
uma classe chamada CD, que conterá três atributos: o número de músicas que o CD possui, o número
da faixa que está tocando no momento (ao iniciar, este valor deve ser colocado em 1, que é o número
da primeira música) e se o CD Player está tocando uma música no momento ou se está parado (o aparelho
sempre inicia parado). Além destes atributos, o programa deve possuir os seguintes métodos:
 um método que funcione como o botão play, dizendo ao aparelho que deve começar a tocar a faixa
atual;
 um método que funcione como o botão pause, fazendo o aparelho parar de tocar;
 um método que funcione como o botão stop, que faz com que o aparelho pare de tocar e volte para
a faixa 1;
 um método que permite avançar para a próxima faixa (se o CD já estiver na última faixa, deve ir
para a primeira);
 um método que permite retroceder para a faixa anterior (se o CD já estiver na primeira faixa, deve ir
para a última).
 */
package exercicio02;

import java.util.Scanner;

public class CD {

    Scanner scan = new Scanner(System.in);
    int numeroMusicas;
    int faixaTocando = 1;
    boolean tocando = true;

    
  public void mostraStatus(){
        System.out.println("Numero de músicas: "+ this.numeroMusicas);
        System.out.println("Está tocando: " + this.tocando);
        System.out.println("Faixa que está tocando: " + this.faixaTocando);
        
    }
    
    public void mostraOpcoes(){
        System.out.println("APERTE [1] - PLAY");
        System.out.println("APERTE [2] - PAUSE");
        System.out.println("APERTE [3] - STOP");
        System.out.println("APERTE [4] - AVANCAR");
        System.out.println("APERTE [5] - RETROCEDER");
        System.out.println("APERTE [0] - SAIR DO MENU");
    }
    
    public void quantasMusicas(){
        System.out.println("Quantas músicas tem no CD? ");
        this.numeroMusicas = scan.nextInt();
    }

    public void play() {
        if (!this.tocando) {
            this.tocando = true;
            this.faixaTocando = 1; 
        }

    }

    public void pause() {
        if (this.tocando) {
            this.tocando = false;
            }
    }

    public void stop() {
        if (this.tocando) {
            this.tocando = false;
        }
        this.faixaTocando = 0;

    }

    public void avancar() {
        if (this.tocando) {
            if ((this.faixaTocando + 1) > this.numeroMusicas) {
                this.faixaTocando = 1;
                this.faixaTocando = this.faixaTocando + 1;
            } else {
                this.faixaTocando = this.faixaTocando + 1;
            }
        }
    }

    public void retroceder() {
        if ((this.faixaTocando - 1) <= 0) {
            this.faixaTocando = this.numeroMusicas;
        } else {
            this.faixaTocando = this.faixaTocando - 1;
        }
    }

}
