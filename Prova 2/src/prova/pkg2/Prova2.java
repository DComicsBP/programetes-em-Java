package prova.pkg2;

import java.util.Scanner;

/*
* @author Daione
 */
public class Prova2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("------------------------------------------------------------------------------");
        System.out.println(" CONTROLE DE ESTOQUE ELETRODOMÉSTICOS  ");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("                       ENTRADA DE DADOS: ");
        
        System.out.println();
        String []nomeProdutos = new String[10];// Vetor de String com o nome do produto
        
        
        int[] quantidadeProduto = new int[nomeProdutos.length]; // Vetor inteiro com a quantidade de produto
        double[] valorProduto = new double[nomeProdutos.length]; //Vetor de double com o valor dos produtos
        
        for (int i = 0; i < nomeProdutos.length; i++) { // tipo de produto.length eu coloquei porque se futuramente 
            System.out.print("INFORME O NOME DO PRODUTO:  ");// eu quiser melhorar, adicionar mais nomes, não preciso mexer em todo o código
            nomeProdutos[i] = scan.next();
            
            System.out.print("INFORME A QUANTIDADE: ");
            quantidadeProduto[i] = scan.nextInt();
            
            System.out.print("INFORME O VALOR DO PRODUTO: ");
            valorProduto[i] = scan.nextDouble();
            System.out.println("");
        }
            
      
        
    }
}
       
