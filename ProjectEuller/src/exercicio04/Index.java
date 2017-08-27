package exercicio04;

import java.io.PrintStream;

public class Index {
    public static void main(String[] args) {
        Metodo m = new Metodo(); 
        
        int valor = 0; 
        String valorString = null; 
        for (int i = 0; i < 999; i++) {
            for (int j = 0; j < 999; j++) {
                valor = i*j; 
            }
        System.out.println(m.transFormaNumeroEmString(valor, valorString)); 
        m.encontraPalindromo(valorString);
            
        
        }
         
    }
}
