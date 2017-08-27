package prova.dois;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Daione
 */
public class PROVADOIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            
        System.out.println("----------------------------------------");
        System.out.println("  CONTROLE DE ESTOQUE ELETRODOMÉSTICOS  ");
        System.out.println("----------------------------------------");
        System.out.println("                        ENTRADA DE DADOS: ");
                String quanti;
                double valorTot;
                String status = null;
                int quant = 0, cont = 0;
                int[] valorPossivelQuant = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                boolean error = false;
                
        
       
                   
                do{
                 try{
                        System.out.print("Digite quantos tipos de produtos que voce deseja cadasrtar[min 1, max 9]: ");
                            quanti = scan.next();
                            
                            quant = Integer.parseInt(quanti);
                            
                                if (quant <0 || quant>10){
                                    System.out.println("Você não forneceu uma quantidade válida");
                                } else {
                                     break;
                                }
                        }catch(NumberFormatException e){
                            System.out.println("Você não forneceu um valor válido");
                            System.out.println("Tente novamente");
                        }
                              do{
                              try{    
                        System.out.print("Digite quantos tipos de produtos que voce deseja cadasrtar[min 1, max 9]: ");
                            quanti = scan.next();
                            
                            quant = Integer.parseInt(quanti);
                            
                                if (quant <0 || quant>10){
                                    System.out.println("Você não forneceu uma quantidade vá lida");
                                } else {
                                     break;
                                }
                        }catch (NumberFormatException e){
                            System.out.println("Você não forneceu um valor válido");
                            System.out.println("Tente novamente");
                        }
                            
                        }while(quant < 1|| quant >10);
                                
                   } while(quant < 1|| quant >10);
        
      
                            System.out.println();
        
            
            String []nomeProdutos = new String[quant];
            int[] quantidadeProduto = new int[nomeProdutos.length];
            double[] valorProduto = new double[nomeProdutos.length];
       
                    for (int i = 0; i < nomeProdutos.length; i++) { 
                            
                        
                            System.out.print("INFORME O NOME DO PRODUTO:  ");
                            nomeProdutos[i] = scan.next();
                            
                             System.out.print("INFORME A QUANTIDADE: ");
                            quantidadeProduto[i] = scan.nextInt();
                            
                            System.out.print("INFORME O VALOR DO PRODUTO: ");
                            valorProduto[i] = scan.nextDouble();
                            System.out.println("");
                    }
           
        ordemAlfabetica(nomeProdutos, quantidadeProduto, valorProduto);
        
     System.out.println("                                         LISTAGEM DE PRODUTOS    ");
     System.out.println("PRODUTO*************QUANT*************PRECO(Un)***********TOTAL********MENS");
                    for (int i = 0; i < nomeProdutos.length; i++) {
            
                            valorTot = valorProduto[i]*quantidadeProduto[i];       
                                         if(quantidadeProduto[i] < 10){
                                            status = " REPOR ";
                                        } else if (quantidadeProduto[i]>=10){
                                            status = " NORMAL"; 
                                        }
      
     System.out.printf("%-20s %d                  %.2f             %.2f    %-20s\n",nomeProdutos[i],quantidadeProduto[i],valorProduto[i],valorTot, status);
                        
                }
        }
        
         
          public static void ordemAlfabetica(String[] nomeProduto, int[] quantProduto, double[] valorProduto){
        
    String aux1;
    int aux2;
    double aux3;
    
for(int i=1;i<nomeProduto.length;i++){
	for(int j=0;j<nomeProduto.length-i;j++){
		if(nomeProduto[j].compareToIgnoreCase(nomeProduto[j+1])>0) {
				
			aux1=nomeProduto[j];
			nomeProduto[j]=nomeProduto[j+1];
			nomeProduto[j+1]=aux1;
                                
                                                     aux2=quantProduto[j];
			quantProduto[j]=quantProduto[j+1];
			quantProduto[j+1]=aux2;
                                                    
                                                    aux3=valorProduto[j];
			valorProduto[j]=valorProduto[j+1];
			valorProduto[j+1]=aux3;
                        	}
	}
	
        }        
    }
}
    

      
        

 



  