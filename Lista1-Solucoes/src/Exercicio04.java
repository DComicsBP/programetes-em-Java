import java.util.Scanner;


public class Exercicio04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o ano desejado: ");
        int ano = entrada.nextInt();

        if(ano > 1584 && (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0))) 
            System.out.println("O ano é bissexto.");
        else
            System.out.println("O ano não é bissexto.");
    }
	
}
