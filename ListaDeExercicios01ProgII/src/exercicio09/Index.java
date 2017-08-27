/*
 9. Um estacionamento cobra uma taxa mínima de R$ 8,00 para estacionar por até três horas. Um adicional
de R$ 0,50 por hora é cobrado após as três primeiras horas. A carga horária máxima para qualquer dado
período de 24 horas é R$ 15,00.
Escreva dois métodos:
 Um método chamado calculaDiferenca que recebe quatro parâmetros inteiros: hora de
entrada no estacionamento, minuto de entrada, hora de saída, minuto de saída. Este
método deve retornar um valor inteiro contendo a diferença em minutos dos dois horários.
 Um método chamado calculaTaxa que recebe um valor inteiro contendo os minutos de
tempo em que o motorista utilizou o estacionamento e devolva um valor double contendo o
valor em reais que o motorista deve pagar.


 Um método com retorno void que recebe uma quantidade de minutos e mostra esse tempo
em horas e minutos. A quantidade de horas pode ser calculada dividindo-se a quantidade
de minutos por 60. A quantidade de minutos pode ser obtida pelo resto dessa divisão.

Faça um programa que permita ao usuário digitar a hora e minuto de entrada de um cliente no
estacionamento e a hora e minuto de saída do mesmo. Utilize os métodos acima para calcular a taxa a ser
paga pelo cliente. Mostre a taxa na tela, bem como a quantidade de tempo que o cliente esteve no
estacionamento em horas e minutos (utilizando o terceiro método).
 */
package exercicio09;
public class Index {
    public static void main(String[] args) {
       System.out.println("====================================================");
       System.out.println("          ESTACIONAMENTO SAIA TRANQUILO");
       System.out.println("====================================================");
        
       
       int tempoEmMin02 = 0;
       double valor = 0;
        
       CalculaTempo t = new CalculaTempo();
       
       System.out.println(t.getTempoTotMin());
       int tempoEmMin = t.calculaDiferencaHorasEmMin(tempoEmMin02);
       valor = t.totAPagar(valor);
       
        System.out.println("");
        System.out.println(t.toString());
        System.out.println("");
        System.out.printf(" VALOR TOTAL A PAGAR: %.2f" , valor);
       
         
        
    }

}
