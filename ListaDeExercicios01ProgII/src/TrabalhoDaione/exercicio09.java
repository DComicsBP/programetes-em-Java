/*

 Um método chamado calculaDiferenca que recebe quatro parâmetros inteiros: hora de
entrada no estacionamento, minuto de entrada, hora de saída, minuto de saída. Este
método deve retornar um valor inteiro contendo a diferença em minutos dos dois horários.


 Um método com retorno void que recebe uma quantidade de minutos e mostra esse tempo
em horas e minutos. A quantidade de horas pode ser calculada dividindo-se a quantidade
de minutos por 60. A quanti dade de minutos pode ser obtida pelo resto dessa divisão.

Faça um programa que permita ao usuário digitar a hora e minuto de entrada de um cliente no
estacionamento e a hora e minuto de saída do mesmo. Utilize os métodos acima para calcular a taxa a ser
paga pelo cliente. Mostre a taxa na tela, bem como a quantidade de tempo que o cliente esteve no
estacionamento em horas e minutos (utilizando o terceiro método).

 Um método chamado calculaTaxa que recebe um valor inteiro contendo os minutos de
tempo em que o motorista utilizou o estacionamento e devolva um valor double contendo o
valor em reais que o motorista deve pagar.


*/



package TrabalhoDaione;
import java.util.Scanner;
public class exercicio09 {
    
    public static void printaInformacoes(int horaEntrada, int minEntrada, int horaSaida, int minSaida, int diferencaHoras,  int totMin, double taxa){
        System.out.println("HORA DE ENTRADA:" + horaEntrada);
        System.out.println("MINUTO DE ENTRADA: " + minEntrada);
        System.out.println("HORA DE SAIDA:" + horaSaida);
        System.out.println("MINUTO DE SAIDA: " + minSaida);
        System.out.println("HORAS CARRO ESTACIONADO:" + diferencaHoras);
        System.out.println("TEMPO TOTAL EM MINUTOS: " + totMin);
        System.out.println("VALOR DO MINUTO: 0.0055 R$");
        System.out.printf("TAXA: %.2f" , taxa);
        
    }
    

    
    public static double calculaTaxa(int min){
        double taxa = 0;
        if(min<=90){
            taxa = 8;
        }else if(min > 90){
            
            taxa = 8 + 0.0055*(min - 90);// A taxa sobre o minuto é calculada dividindo-se o valor máximo da diária menos 
        // o valor das três primeiras horas --8-- por 21 horas(as horas restantes do dia) multiplicado por 60 (a quantidade 
        // de minutos em uma hora)  
        }
        
        return taxa; 
    }
    public static void converteHorasMin(int min){
        int horas = min/60; 
        int minResto = min%60; 
        System.out.println(horas);
        System.out.println(minResto);
        
    }
    
    public static int calculaDiferenca(int horaEntrada, int minEntrada, int horaSaida, int minSaida){
        int hora = horaEntrada-horaSaida; 
        int min = minEntrada - minSaida;
        int dia = 0;
        
        if(hora>=24)
            dia = dia+1; 
       
      if(min>=60)
            hora = hora+1; 
        
        
        if(horaEntrada >= horaSaida)
            hora = 24-(horaEntrada-horaSaida);
            /*
        coloquei essa linha de código porque o problema falava que o carro poderia ficar
        estacionado até 24h. Sem essa linha, o programa apenas calculava a diferença entre as 
        horas, sem levar em consideracao que o dia mudava. 
        
        */
        if(min < 0)
            min = (min*-1);
        if(hora<0)
            hora = hora*-1;
               
        min = hora*60+min;
        
        return min;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ESTACIONAMENTO SAIA TRANQUILO");
        System.out.print("HORA DE ENTRADA: ");
        int horaEntrada = scan.nextInt();
        System.out.print("MINUTO DE ENTRADA: ");
        int minEntrada = scan.nextInt();
        System.out.print("HORA DE SAIDA: ");
        int horaSaida = scan.nextInt();
        System.out.print("MIN DE SAIDA: ");
        int minSaida = scan.nextInt();
        
       
        
        int totMin = calculaDiferenca(horaEntrada,minEntrada,horaSaida,minSaida);
         int totHora = totMin/60; 
         int minResto =totMin%60; 
       
        System.out.println(totMin);
        converteHorasMin(totMin);
       
        double taxa = calculaTaxa(totMin);
        
        printaInformacoes(horaEntrada, minEntrada, horaSaida, minSaida, totHora,  totMin, taxa);
        

    }
}