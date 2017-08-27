package exercicio03;

import java.util.Scanner;

public class Index {
    /*
    3. Crie uma classe chamada Horario que defina três atributos: hora, minuto e segundo. Defina também um
método chamado incSegundo que não recebe parâmetros e aumenta o horário em um segundo. Lembre-se
que aumentar o horário em um segundo pode implicar alterações na quantidade de minutos e/ou na quantidade
de horas (por exemplo, aumentar o horário 07:59:59 em 1 segundo altera o horário para 08:00:00).
Implemente um programa que leia um horário do usuário (como três números inteiros separados) e
construa um objeto da classe Horario, preenchendo-o com os valores informados. Logo após, leia outro número
inteiro do usuário especificando uma quantidade de segundos. Incremente o horário com o número de
segundos especificados pelo usuário, utilizando apenas uma estrutura for e o método incSegundo. Ao final,
mostre o horário modificado
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Horario h = new Horario();
        int segundo = 0, hora = 0, minuto = 0; 
        
        System.out.print("Hora: ");
        hora = scan.nextInt();
        
        System.out.print("Minuto: ");
        minuto = scan.nextInt();
        
        System.out.print("Segundo: ");
        segundo = scan.nextInt();
        System.out.println("Horario: " + hora + " : " + minuto + " : "+ segundo);
        
        System.out.println("Quantos segundos vc deseja add? ");
        int j = scan.nextInt();
        for (int i = 1; i < j; i++) {
            h.incSegundo();
            
        }
                
        segundo = h.incSegundo()+segundo; 
        
      h.contagem(hora, minuto, segundo);
        
        
    }

}
