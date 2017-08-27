package exercicio01;

import java.util.Scanner;

/*
 Crie um programa Java para exibir os valores da função F(x) = x2
-5x+6 para valores de x digitados pelo
teclado, até que o usuário digite zero para x.
*/
public class exercicio01 {
    public static void main(String[] args) {
       /* double x; 
        double f; 
        Scanner scan = new Scanner(System.in); 
        
        do{
            System.out.println("Forneca o valor do primeiro coeficiente: ");
            x = scan.nextDouble();
            f  = x*x  - 5x + 6; 
        }while(x!=0);
        */
        
        /*
        int a = 1; 
        int b = -5; 
        int c = 6; 
        
        double delta = Math.pow(b, 2) - 4*a*c;
        
        System.out.println(delta);
        
       */ 
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Forneca o coeficiente a: ");
        double a = scan.nextDouble();
        
        System.out.print("Forneca o coeficiente b: ");
        double b = scan.nextDouble();
        
        System.out.print("Forneca o coeficiente c: ");
        double c = scan.nextDouble();
        
        double delta = Math.pow(b, 2) - 4*a*c;
        
        if(delta<0){
            System.out.println("Nao existem raizes reais! ");
            
        }else if(delta == 0){
            
            
            System.out.print("Existe apenas uma raiz real que é: " + delta);
        }else if(delta > 0){
            double raiz01 = (-b + Math.sqrt(delta))/(2*a);
            double raiz02 = (-b - Math.sqrt(delta))/(2*a);
            System.out.print("Existem duas raizes reais, que são " + raiz01 + " e " + raiz02);
        }
        
        
        
    }
    
}
