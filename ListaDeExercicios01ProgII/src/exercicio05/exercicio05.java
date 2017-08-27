package exercicio05;
import java.util.Scanner;
public class exercicio05 {
    /*
    Escreva um programa que leia dois vetores contendo números reais com 5 posições e preenche um
terceiro vetor de 5 posições, contendo a multiplicação dos números presentes em cada um dos dois
primeiros vetores. Por exemplo, a posição 1 do terceiro vetor conterá a multiplicação dos valores
armazenados na posição 1 dos dois primeiros vetores. O programa deve mostrar então a soma dos valores
de todas as posições do terceiro vetor.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] vetor01 = new double[5];
        double[] vetor02 = new double[5];
        double[] vetor03 = new double[5];
        
        double soma = 0; 
        
        for (int i = 0; i < vetor01.length; i++) {
            System.out.print("Forneca um valor para o vetor A na posição " + i+ ": ");
            vetor01[i] = scan.nextDouble();
        }
        for (int i = 0; i < vetor01.length; i++) {
            
        
            System.out.print("Forneca um valor para o vetor B na posição " + i + ": ");
            vetor02[i] = scan.nextDouble();
        }
        for (int i = 0; i < vetor01.length; i++) {
            
        
            vetor03[i] = vetor01[i]*vetor02[i];
            
            soma+=vetor03[i];
            }    
        
        System.out.println("");
        System.out.print("Vetor A = ");
        for (int i = 0; i < vetor01.length; i++) {
            System.out.print(vetor01[i]+ ",  ");
            
        }
        System.out.println("");
        System.out.print("Vetor B = ");
        for (int i = 0; i < vetor01.length; i++) {
            System.out.print(vetor02[i]+ ",  ");
            
        }
        
        System.out.println("");
        System.out.print("Vetor C = ");
        for (int i = 0; i < vetor01.length; i++) {
            System.out.print(vetor03[i]+ ", ");
            
        }
        System.out.println("");
        System.out.println("A soma dos valores do vetor 'C' é : " + soma);
    }
}
