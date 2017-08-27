/*
/*
Escreva um método chamado ehMultiplo que recebe dois parâmetros do tipo int e retorne true se o segundo
número é divisível pelo primeiro ou false caso contrário.
Um número inteiro primo é um número que é divisível apenas por 1 a por ele mesmo. Uma forma
que podemos fazer para saber se um determinado número é primo, é verificar se ele não é divisível por nenhum
número maior do que 1 e menor do que ele mesmo. Por exemplo, o número 7 é primo, pois não é divisível
por 2, nem por 3, nem por 4, nem por 5, nem por 6. Já o número 8 não é primo, pois é divisível por 2
e por 4.
Construa um método chamado ehPrimo que receba um valor int como parâmetro e retorne true
caso o número seja primo e false caso contrário. Utilize a lógica descrita acima e o método ehMultiplo para
saber se um número é divisível por outro.
Faça um programa em Java que utilize o método ehPrimo e mostre os números primos menores do
que 10000.
*/


package exercicio12;
import java.util.Scanner;
public class exercicio12 {
    
    public static boolean ehPrimo(int var03){
        int var04 = 0;
        boolean primo  = false; 
         boolean divisivel = false;
           
         if(divisivel){      
            primo = false;
            }else{
                primo = true; 
            }
    return primo;
    }
    
     public static boolean divisivel(int varA, int varB) {
        boolean ehDivisivel = true;
        varA = 0; 
        for (varB = 2; varB < 10000; varB++) {
            ehDivisivel = false;
        
            for (varA = 2; varA < varB; varA++) {       
                        if (varB % varA == 0) {
                ehDivisivel = true;
                }
                        
            }
          //  boolean primo  =  ehPrimo(int varA);
            System.out.println(ehDivisivel + " " + varB); 
        
        
        }
        return ehDivisivel;
     }
    
    public static void main(String[] args) {
        Comparar c = new Comparar();
        ClasseDeProva c1 = new ClasseDeProva();
        Scanner scan = new Scanner(System.in);
        int a = 0, b = 0; 
        
        ehPrimo(a);
        divisivel(a,b);
        
        //boolean d = c.divisivel(a, b);
        
        
         
        } 
    }

