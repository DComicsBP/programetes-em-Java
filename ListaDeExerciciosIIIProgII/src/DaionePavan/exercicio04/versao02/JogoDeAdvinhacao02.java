package exercicio04;

import java.util.Random;
import java.util.Scanner;
public class JogoDeAdvinhacao02 {
    Scanner scan = new Scanner(System.in);
    Random gerador = new Random();
    int[] numeroGerado = new int[gerador.nextInt(99)];
    boolean terminou = false;

    public String jogada(int palpite) {
        String n = null; int i = 0;
        
        if(palpite>=0 && palpite <=99){
        for (int j = 0; j != palpite; j++) {

            if (palpite == this.numeroGerado.length) {
                n = "Você acertou o valor!";
                terminou = true;
            } else if (palpite < this.numeroGerado.length) {
                n = "Tente um valor maior";

            } else if (palpite > this.numeroGerado.length) {
                n = "Tente um valor menor";
            }
        }
        }else{
            if(palpite < 0){
            n = "Você  digitou um valor inválido menor que zero !";
            } else if (palpite > 99){
                n = "Você digitou um alor invalido maior que 99 !";
            }
        }
        return n;
    }

}
