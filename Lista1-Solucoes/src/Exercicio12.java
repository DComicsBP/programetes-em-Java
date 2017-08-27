import java.util.Scanner;


public class Exercicio12 {

    static boolean ehMultiplo(int num1, int num2) {
        return num2 % num1 == 0;
    }

    static boolean ehPrimo(int numero) {
        for(int i = 2; i < numero; i++) {
            if(ehMultiplo(i, numero))
                return false;				
        }
        return true;
    }

    public static void main(String[] args) {
        for(int i = 2; i < 10000; i++) {
            if(ehPrimo(i))
                System.out.println(i);
        }
    }
}
