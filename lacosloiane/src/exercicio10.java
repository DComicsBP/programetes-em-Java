import java.util.Scanner;

public class exercicio10 {
      public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Forneça um número inteiro: ");
        int numero1 = scan.nextInt();
        
         System.out.println("Forneça outro número inteiro: ");
        int numero2 = scan.nextInt();
        
        int numero3 = numero1-numero2;
        
        
        for (int i = numero1; i <= numero2; i++) {
            System.out.println(" ");
            System.out.println(i);
            
            
            
        }
    
    }
}

