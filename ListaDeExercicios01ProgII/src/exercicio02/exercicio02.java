/* Para cada uma das mercadorias com que um armazém trabalha dispõe-se dos seguintes dados:
− o nome da mercadoria; − o seu preço unitário; − a quantidade total vendida no mês.
Elabore um programa para calcular o faturamento total mensal do armazém. O faturamento total do
armazém será calculado somando-se o total faturado por cada mercadoria, que é igual a quantidade
vendida da mercadoria vezes o seu preço unitário. O número de mercadorias comercializadas pelo
armazém deve ser informado pelo usuário.
 */
package exercicio02;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Quantos tipos de mercadorias você deseja cadastrar? ");
        int number_tipe = scan.nextInt();
        
    int soma = 0; 
    String nomeMercadoria[] = new String[number_tipe];
    double precoUnitario[] = new double[number_tipe];
    double valorTotal[] = new double[number_tipe];
    int quatidadeMercadoria[] = new int[number_tipe];
    
        System.out.println("");
        for (int i = 0; i < nomeMercadoria.length; i++){ 
            System.out.print("Forneca o nome da mercadoria: ");
            nomeMercadoria[i] = scan.next();
            
            
            System.out.print("Forneca o valor de " + nomeMercadoria[i] + " : " );
            precoUnitario[i] = scan.nextDouble();
            
            System.out.print("Forneca quantas unidades do produto foram vendidas: ");
            quatidadeMercadoria[i] = scan.nextInt();
            System.out.println("");
            
            valorTotal[i] = precoUnitario[i]*quatidadeMercadoria[i];
            
            soma += valorTotal[i]; 
            
        }
        for (int i = 0; i < nomeMercadoria.length; i++) {
            
        System.out.println("Foram vendidas " + quatidadeMercadoria[i] + 
                " unidades de " + nomeMercadoria[i] + " ao valor de " + precoUnitario[i] + " cujo preço total de mercadoria = " + valorTotal[i]);

            System.out.println("");
            
        }   
        System.out.println("");
        System.out.print("O faturamento total da loja é: " + soma);
       
            
    }
}
