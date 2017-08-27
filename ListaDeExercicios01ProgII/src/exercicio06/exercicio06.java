package exercicio06;
import java.util.Scanner;
public class exercicio06 {
    /*
    
        Escreva um programa que leia a pontuação de 10 times de um campeonato de futebol. O programa deve
mostrar, ao final, qual a pontuação dos campeões (aqueles que dividiram o primeiro lugar), bem como
mostrar quantos times dividiram o título.
     */
    public static void trocar(int[] pontos, String[] time, int cont){
        boolean troca = true;
        cont = 0; 
        
        while(troca){
            troca = false; 
            for (int i = 0; i < pontos.length; i++) {
                if(pontos[i] < pontos[i+1]){
                    int aux01 = pontos[i+1];
                    pontos[i+1] = pontos[i];
                    pontos[i] = aux01; 
                    
                    String aux = time[i+1];
                    time[i+1] = time[i];
                    time[i] = aux;
                    
                    troca = true; 
                    
                    }
                if(pontos[i] == pontos[i+1]){
                    cont++;
                    break; 
                    
                }
                                
            }
            System.out.println("");
            
        }
    }
    
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] time = new String[3];
        int[] pontuacao = new int[time.length];
        int cont = 0; 
        
        for (int i = 0; i < time.length; i++) {
            System.out.print("Forneca o nome do time: ");
            time[i] = scan.next();

            
            System.out.print("Forneca a pontuacao do time: ");
            
            pontuacao[i] = scan.nextInt();

        }
        trocar(pontuacao,time, cont);
        
        
        
        
        for (int i = 0; i < time.length; i++) {
            
            int soma = i+1; 
            System.out.println(" O time " + time[i]+  " está  em " + soma + " o. lugar com a pontuacao: " + pontuacao[i]);

        }

    }

    
}
