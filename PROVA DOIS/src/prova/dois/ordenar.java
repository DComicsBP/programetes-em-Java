package prova.dois;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Daione
 */
public class ordenar {

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
                int[] valorPossivelQuant = {1, 2, 3, 4, 5, 6, 7, 8, 9};
                boolean error = false;
                char[] caractere = new char[27];
       
                   
                do{// esse do - while existe pra se acaso a pessoa resolver digitar um valor que nao é permitido
                 try{ // inicio do tratamento de excessão. Como estou usando o comando parseInt (transformar uma String em um inteiro, 
                            // percebi que se o sujeto digitasse uma letra, ou qlqr outro caractere o programa encerraria e nao se poderia continuar com a ação )
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
                              do{// esse do - while existe pra se acaso a pessoa resolver digitar um valor que nao é permitido
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
        
            
            String []nomeProdutos = new String[quant];// Vetor de String com o nome do produto
            int[] quantidadeProduto = new int[nomeProdutos.length]; // Vetor inteiro com a quantidade de produto
            double[] valorProduto = new double[nomeProdutos.length]; //Vetor de double com o valor dos produtos
       
                    for (int i = 0; i < nomeProdutos.length; i++) { // tipo nomeProdutos.length eu coloquei porque se futuramente 
                            
                        
                            System.out.print("INFORME O NOME DO PRODUTO:  ");// eu quiser melhorar, adicionar mais nomes, não preciso mexer em todo o código.
                            nomeProdutos[i] = scan.next();// Assim, o for vai ser executado de acordo com a quantidade de tipos de produtos a serem cadastrados no programa
                        
                            
                  do{
                       try{    
                            do{
                                    System.out.print("INFORME A QUANTIDADE: ");
                                    quantidadeProduto[i] = scan.nextInt();
                            
                                        if (quantidadeProduto == valorPossivelQuant){
                                        error=false;
                                        break;
                                        } else{
                                            System.out.println("Você não forneceu uma quantidade válida");
                                        }
                            }while(error == true);
                    }catch (InputMismatchException q){
                            try{    
                                do{
                                        System.out.print("INFORME A QUANTIDADE: ");
                                        quantidadeProduto[i] = scan.nextInt();
                            
                                        if (quantidadeProduto.equals(caractere) ){
                                        error=true;
                                        System.out.println("Você não forneceu uma quantidade válida");
                                        } else{
                                            break;
                                        }
                                }while(error == true);
                            }catch (InputMismatchException w){
                                        break;
                              }                            
                    }
             }while(error == true);
                    
                            
                            do{
                                try{    
                                    do{
                                         System.out.print("INFORME O VALOR: ");
                                          valorProduto[i] = scan.nextDouble();
                                           if (valorProduto.equals(caractere) ){
                                                error=true;
                                                System.out.println("Você não forneceu um valor válido");
                                            } else{
                                                break;
                                            }
                                        }while(error == true);
                                    }catch (InputMismatchException q){
                                       do{
                                            try{    
                                                do{
                                                    System.out.print("INFORME O VALOR: ");
                                                    valorProduto[i] = scan.nextDouble();
                                                        if (valorProduto.equals(caractere) ){
                                                            error=true;
                                                            System.out.println("Você não forneceu um valor válido");
                                                        } else{
                                                            break;
                                                        }
                                                }while(error == true);
                                            }catch (InputMismatchException p){
                                                    break;
                                                }                            
                            
                                }while(error == true);
                            }
                        }while(error == true);                           
                    }
           
        ordemAlfabetica(nomeProdutos, quantidadeProduto, valorProduto);// declaraçao do metodo - esse metodo nao retorna valor pq é 
        //um metodo do tipo construtor (acho). Pois pelo o que eu entendi o metodo construtor aceita a declaração 
        //dos parâmetros e a logica dentro da chamada do método os relaciona com as declarações das variáveis no método principal. 
        
        
     System.out.println("                                         LISTAGEM DE PRODUTOS    ");
     System.out.println("PRODUTO*************QUANT*************PRECO(Un)***********TOTAL********MENS");
                    for (int i = 0; i < nomeProdutos.length; i++) {
            
                            valorTot = valorProduto[i]*quantidadeProduto[i];       
                                         if(quantidadeProduto[i] < 10){
                                            status = " REPOR ";
                                        } else if (quantidadeProduto[i]>=10){
                                            status = " NORMAL"; 
                                        }
      
     System.out.printf("%s-20 %d                  %.2f             %.2f    %s-20\t",nomeProdutos[i],quantidadeProduto[i],valorProduto[i],valorTot, status);
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
