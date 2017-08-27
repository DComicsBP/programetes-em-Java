
import java.util.Scanner;

/**
 *
 * @author leonardo
 */
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Número de mercadorias: ");
        int numMercadorias = entrada.nextInt();
        
        double faturamentoTotal = 0;
        for(int i = 1; i <= numMercadorias; i++) {
            System.out.print("Nome da mercadoria: ");
            String nome = entrada.next();
            System.out.print("Preço da mercadoria: ");
            double preco = entrada.nextDouble();
            System.out.print("Quantidade vendida no mês: ");
            int quantVendida = entrada.nextInt();
            
            faturamentoTotal += preco * quantVendida;
        }
        
        System.out.printf("Faturamento total mensal = R$ %.2f", faturamentoTotal);
    }
}
