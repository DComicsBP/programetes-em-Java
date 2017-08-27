/*
 A palindromic number reads the same both ways. The largest 
palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.*/
package exercicio04;
public class Metodo {
    int[] array = new int[6];
    int valor; 
    String valorString;
    
    public String transFormaNumeroEmString(int valor, String valorString){
        this.valor = valor;
        
        valorString = Integer.toString(valor);
                
        return valorString; 
    }
    
    public void encontraPalindromo(String valorString){
        this.valorString = valorString; 
        
        StringBuilder sb = new StringBuilder();
        if(valorString.equalsIgnoreCase(sb.reverse().toString()))
            System.out.println(this.valorString + " Eh palindrome! ");
        
        
        
        
        
    }
}