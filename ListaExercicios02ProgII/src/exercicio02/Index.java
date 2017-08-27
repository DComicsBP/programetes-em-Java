/*
2. Construa um programa em Java que simule a operação de um CD Player tocando um CD. Para isso, implemente
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
Ao implementar o programa que use a classe CD, permita ao usuário que informe o número de músicas.
A simulação ocorrerá da seguintes forma: crie um objeto a partir da classe CD que será a base da simulação.
Após entrar com o número de músicas (armazene esse valor no objeto que você criou), permita ao
usuário entrar com comandos para o CD Player. Os comandos serão informados através de números:
 1 para play
 2 para pause
 3 para stop
 4 para ir para a próxima faixa
 5 para ir para a faixa anterior.
Para cada comando digitado pelo usuário, chame o método apropriado no objeto que você criou. O programa
irá terminar quando o usuário digitar o comando de número 0 (zero). */

package exercicio02;

import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        CD c = new CD();
        
        
        
       String resp = null; 
        int num = 0; 
        
            Scanner scan = new Scanner(System.in);
        c.quantasMusicas();    
        do{
            
            c.mostraOpcoes();
            num = scan.nextInt();
            
            switch(num){
                case 1 :
                    c.play();
                    break;
                case 2:
                    c.pause();
                    break; 
                case 3:
                    c.stop();
                    break; 
                case 4:
                    c.avancar();
                    break; 
                case 5:
                    c.retroceder();
                    break; 
                case 0:
                    break; 
            }
            
            c.mostraStatus();
            
            System.out.println("Deseja fazer outra operacao? [s/n]");
            resp= scan.next();
       }while(resp.equalsIgnoreCase("s")); 
    }
}