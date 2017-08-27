/*
Um atributo inteiro segredo e outro boolean chamado terminou. Inicialize o atributo segredo com um
número inteiro qualquer.
 Um método chamado jogada que retorna um valor String e recebe como parâmetro um valor inteiro
contendo o palpite do jogador. Se o palpite passado como parâmetro for menor que segredo, o
método deve retornar “Você deve digitar um número maior.”. Caso o palpite seja maior do que
segredo, o método deve retornar “Você deve digitar um número menor.”. Caso o palpite seja igual a
segredo, o método deve retornar “Você acertou!!”.
 */
package exercicio04;

import java.util.Random;

class JogoDeAdivinhacao {

    Random gerador = new Random();
    int segredo = gerador.nextInt(99);
    boolean terminou = false;

    public String jogada(int palpite) {
        String i = null;
        if (palpite >= 0 && palpite <= 99) {
            if (palpite < this.segredo) {
                i = "Tente um valor maior!";
            } else if (palpite > this.segredo) {
                i = "Tente um valor menor!";
            } else {
                this.terminou = true;
                i = "Você advinhou o numero!";
            }
        } else {
            if (palpite < 0) {
                i = "Você  digitou um valor inválido menor que zero !";
            } else if (palpite > 99) {
                i = "Você digitou um alor invalido maior que 99 !";
            }

        }

        return i;
    }

}
