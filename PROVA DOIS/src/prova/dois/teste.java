/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova.dois;

import java.util.Scanner;

/**
 *
 * @author Daione
 */
public class teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner scan = new Scanner(System.in);
        System.out.println("------------------------------------------------------------------------------");
        System.out.println(" CONTROLE DE ESTOQUE ELETRODOMÉSTICOS  ");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("                       ENTRADA DE DADOS: ");
        
        System.out.print("Digite quantos tipos de produtos que voce deseja cadasrtar: ");
        int quant = scan.nextInt();
        
        
        System.out.println();
        String []nomeProdutos = new String[quant];// Vetor de String com o nome do produto
        
        
        int[] quantidadeProduto = new int[nomeProdutos.length]; // Vetor inteiro com a quantidade de produto
        double[] valorProduto = new double[nomeProdutos.length]; //Vetor de double com o valor dos produtos
        double total[] = new double[nomeProdutos.length];
        
        for (int i = 0; i < nomeProdutos.length; i++) { // tipo de produto.length eu coloquei porque se futuramente 
            System.out.print("INFORME O NOME DO PRODUTO:  ");// eu quiser melhorar, adicionar mais nomes, não preciso mexer em todo o código
            nomeProdutos[i] = scan.next();
            
            System.out.print("INFORME A QUANTIDADE: ");
            quantidadeProduto[i] = scan.nextInt();
            
            System.out.print("INFORME O VALOR DO PRODUTO: ");
            valorProduto[i] = scan.nextDouble();
            System.out.println("");
        }
           
        ordemAlfabetica(nomeProdutos, quantidadeProduto, valorProduto);
        
           
     System.out.println("                         LISTAGEM DE PRODUTOS    ");
     System.out.println("PRODUTO*************QUANT*************PRECO(Un)***********TOTALl********MENS");
     for (int i = 0; i <= nomeProdutos.length - 1; i++) {
           double valorTot= quantidadeProduto[i] * valorProduto[i]; 
            
           
           
           System.out.printf(nomeProdutos[i], quantidadeProduto[i], valorProduto[i]);
           
      System.out.printf("%-20s %d                    %.2f            %.2f       %-10s\n", nomeProdutos[i],quantidadeProduto[i],valorProduto[i],valorTot);     
        
         System.out.print(" " + valorTot);
      if(quantidadeProduto[i] < 10){
               System.out.print(" REPOR");
           }
           else{
               System.out.print(" NORMAL");
           }
     }
        
      
           
    }
        
      public static void ordemAlfabetica(String[] nomProduto, int[] quanProduto ,  double[] valorProduto){
        String aux1; 
        int aux2;
        int cont = 0;
        double aux3;
       boolean ordena = false; // eh uma variavel usada como controle que serve pra dizer se a condicao foi satisfeita ou nao 
    
       //obs.: o -1 eh colocado em nom.Produto.length porque quando ocorre o incremento, vai contar como tendo uma unidade a mais que o tamanho
            //original que o vetor. Ai o c[odigo dah erro. 
           System.out.println("o metodo foi chamado=============================================");
        for (int i = 0; i < nomProduto.length-1; i++) {// o primeiro ciclo for tem como finalidade repetir a operacao
            System.out.println("ta passando aqui=================================================");
            for (int j = 0; j < nomProduto.length-1; j++) {// eh no segundo ciclo que ocorre a analise do vetor (eh onde ocorre a comparacao)
                System.out.println("passou======================================================");
                    
                do
                {// nessa linha eu faco a condicao para a minha analise ocorrer 
                    System.out.println("passsandoooooo de novo ======================================");
                    
                    aux1 = nomProduto[j];// a auxiliar vai receber o valor da primeira posicao
                    nomProduto[i] = nomProduto[j];// aqui ocorre a comparacao entre os vetores 
                    nomProduto[i] = aux1;// o valor que nao eh ordenado fica armazenado na variavel auxiliar para ser comparado novamente 
                    System.out.println("estou aqui ==============================================");
                    aux2 = quanProduto[j];
                    quanProduto[i] = quanProduto[j];
                    quanProduto[i] = aux2;
                    System.out.println("errrouuu==================================================");
                    aux3 = valorProduto[j];
                    valorProduto[i] = valorProduto[j];
                    valorProduto[i] = aux3;
                
                    System.out.println("passou agora==========================================");
                    ordena = false;
                cont++;
                } while((nomProduto[j].compareToIgnoreCase(nomProduto[i]) > 0));
               
                
                System.out.println("terminou o metodo=========================================");
                        {
                    
      
                }
                 
            
        }
 
       }
        
        }
}
 



  