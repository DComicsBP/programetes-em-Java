
import java.util.Scanner;

/**
 *
 * @author leonardo
 */
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int[] pontos = new int[10];
        
        for(int i = 0; i < pontos.length; i++) {
            System.out.printf("Pontuação do time %d: ", i+1);
            pontos[i] = entrada.nextInt();
        }
        
        int maior = pontos[0];
        for(int i = 1; i < pontos.length; i++) {
            if(maior < pontos[i])
                maior = pontos[i];
        }
        
        int campeoes = 0;
        for(int i = 0; i < pontos.length; i++) {
            if(pontos[i] == maior)
                campeoes++;
        }
        
        System.out.println("Pontuação dos campeões: " + maior);
        System.out.println("Número de campeões: " + campeoes);
    }
}
