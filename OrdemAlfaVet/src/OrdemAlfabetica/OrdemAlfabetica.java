/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste2;

import java.util.Scanner;

/**
 *
 * @author Daione
 */
public class OrdemAlfabetica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int i = 0, j = 0, quant;
   
    
    System.out.print("Entre com a quantidade de pesoas a serem cadastradas: ");
            quant = new Scanner(System.in).nextInt();
    
   
    String[] num1;
    String aux;        
    int idade[] = null;
    double[] altura = null;
    double[] peso = null;
    double[] imc = null;
    boolean a = true;
    
    
 
            
 
            num1 = new String [quant];
            idade = new int [quant];
            altura = new double [quant];
            peso = new double [quant];
            imc = new double [quant];
            
            
 
            for (i = 0; i <= quant - 1; i++){
                System.out.print("Forneça o nome da "+ (i + 1) +"ª pessoa: ");
                num1[i] = new Scanner(System.in).next();
                
                
            }
 
            for (i = 0; i <= quant - 2; i++){
                for (j = i + 1; j <= quant - 1; j++){
                    if(( num1[j].compareToIgnoreCase(num1[i]) < 0) && (a == true)){
                        aux = num1[j];
                        num1[j] = num1[i];
                        num1[i] = aux;
                        
                        
                    }
                }
            }
 
            System.out.println("A ordem correta é: ");
           for (int k = 0; k <= quant-1; k++) {
               System.out.println(" " + num1[k]);
            
        }
            
                
            for (i = 0; i <= quant - 1; i++){
                System.out.println(" ");
               System.out.println(num1[i] + " : ");
               System.out.print("Forneça a idade do " + num1[i] + " : ");
               idade[i] = new Scanner(System.in).nextInt();
                
                 
               System.out.print("Forneça a altura de " + num1[i] + " : ");
                altura[i] = new Scanner(System.in).nextDouble();
                
                
                System.out.print("Forneça o peso: " + num1[i] + " : ");
                peso[i] = new Scanner(System.in).nextDouble();
                
                
                imc[i] = (peso[i]/(altura[i]*altura[i]));
                System.out.print("O imc de " + num1[i] + " "); 
                System.out.printf("  é %.2f" , imc[i] );
                
                System.out.println("  ");
                
                
                
                
                }
            
            System.out.println("NOME                IDADE         ALTURA          PESO       IMC     CONCEITO");
            for (int m = 0; m <= quant - 1; m++) {
                
                
                System.out.printf("%-20s %,d            %.2f            %.2f      %.2f    ",
                        num1[m], idade[m], altura[m], peso[m], imc[m]);
                
                
                if (imc[m] < 18){
                    System.out.println(num1[m] + " está muito abaixo do peso ideal!");
                }
                
                if ((imc[m] >= 18) && (imc[m] < 25)){
                    System.out.println(num1[m] + " está com o peso ideal! ");
                }
                if ((imc[m] >= 25) && (imc[m] < 29)){
                    System.out.println(num1[m] + "está com sobrepeso ");
                }
                if ((imc[m] >= 29) &&(imc[m] < 35)) {
                    System.out.println(num1[m] + " está com obesidade grau I ");
                    
                }
                if ((imc[m] >=35) && (imc[m] <40)) {
                    System.out.println(num1[m] + " está com obesidade severa (grau II) ");
                    
                }
                if(imc[m]>= 40) {
                    System.out.println(num1[m] + " está com obesidade mórbida (obesidade grau III) ");
                    
                }
                }
    }
}
                 



                

        

                  

    
            
                
                
    


                
                



 




 

    
    
