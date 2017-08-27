/*
Um método chamado calculaDiferenca que recebe quatro parâmetros inteiros: hora de
entrada no estacionamento, minuto de entrada, hora de saída, minuto de saída. Este
método deve retornar um valor inteiro contendo a diferença em minutos dos dois horários.
 Um método chamado calculaTaxa que recebe um valor inteiro contendo os minutos de
tempo em que o motorista utilizou o estacionamento e devolva um valor double contendo o
valor em reais que o motorista deve pagar. */

package exercicio09;

import java.util.Scanner;

public class CalculaTempo {
    private int horaEntrada; 
    private int minEntrada; 
    private int horaSaida;
    private int minSaida; 
    private int hora; 
    private int minuto; 
    private int tempoTotMin;
    private int dia; 
    private int mes; 

    @Override
    public String toString() {
        return "HORA DE ENTRADA: " + horaEntrada + " \n MIN DE ENTRADA: " + minEntrada + "\n HORA DE SAIDA: " + horaSaida + ""
                + " \n MINUTO DE SAIDA:" + minSaida + "\n TEMPO TOTAL: " + hora + " h e " + minuto+ " min " 
                + "\n TEMPO TOTAL EM MINUTOS: " + tempoTotMin +'}';
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
        if(this.getDia()>=30){
            hora = hora+1; 
        }
    }
    
    public int transformaHorasEmDias(int minTot){
        
      this.setTempoTotMin(this.getTempoTotMin()/(60*30));
      minTot = this.getTempoTotMin();
       return minTot;
    }
    
    
    public int calculaDiferencaHorasEmMin(int minTot){
        minTot = this.dia;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("HORA DE ENTRADA: ");
        System.out.print("HORA: ");
        this.setHoraEntrada(scan.nextInt());
        System.out.print("MINUTO: ");
        this.setMinEntrada(scan.nextInt());
        
        System.out.println("");
        
        System.out.println("HORA DE SAIDA: ");
        System.out.print("HORA: ");
        this.setHoraSaida(scan.nextInt());
        System.out.print("MINUTO: ");
        this.setMinSaida(scan.nextInt());
        
       this.setHora(this.horaSaida - this.horaEntrada);
       this.setMinuto(this.minSaida - this.minEntrada);
       
      this.setTempoTotMin(this.getHora()*60 + this.getMinuto());
      minTot = this.getTempoTotMin();
       return minTot;
    }
    
    public double totAPagar(double taxaApagar){
        int minTot = this.getTempoTotMin();
        
        
        if(minTot<=90){
            taxaApagar = 8;
        }else if(minTot > 90){
            
            taxaApagar = 8 + 0.0055*(minTot - 90);// A taxa sobre o minutoé calculada dividindo-se o valor máximo da diária menos 
        // o valor das três primeiras horas --8-- por 21 horas(as horas restantes do dia) multiplicado por 60 (a quantidade 
        // de minutos em uma horas)  
        }
        
        return taxaApagar;
        }
    

    public int getHoraEntrada() {
        return horaEntrada;
    }

    
    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
        if(this.getMinuto()>=60){
            hora = hora+1; 
    
        }    
        
        
    }

    public int getMinEntrada() {
        return minEntrada;
    }

    public void setMinEntrada(int minEntrada) {
        this.minEntrada = minEntrada;
    }

    public int getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(int horaSaida) {
        this.horaSaida = horaSaida;
       
    }

    public int getMinSaida() {
        return minSaida;
    }

    public void setMinSaida(int minSaida) {
        this.minSaida = minSaida;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
        if(this.getMinuto()>=60){
            hora = hora+1; 
           
        }
        if(this.getHoraEntrada()>this.getHoraSaida())
            this.hora = -1*(24 - (this.getHoraEntrada() - this.getHoraSaida()));
            
         if(this.horaSaida<this.horaEntrada){
            this.hora = -1*this.hora;
        }
       
    }

    public int getMinuto() {
        
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
        if(this.getHora()>=24){
            dia = dia+1; 
        }
    }

    public int getTempoTotMin() {
        return tempoTotMin;
    }

    public void setTempoTotMin(int tempoTotMin) {
        this.tempoTotMin = tempoTotMin;
    }
   
    

}
