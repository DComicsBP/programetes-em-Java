package exercicio04;


import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        JogoDeAdivinhacao jogo = new JogoDeAdivinhacao();
         
        System.out.println("Neste jogo você deve tentar adivinhar um número que eu sorteei entre 0 e 99");
        
      while (!jogo.terminou) {
          
            System.out.print("Digite seu palpite: ");
            int palpite = scan.nextInt();
            System.out.println(jogo.jogada(palpite));
        }
    }
    // troquei o metodo de pedir informação ao usuario pq no meu computador ele nao pegava a informação do teclado. 
}

