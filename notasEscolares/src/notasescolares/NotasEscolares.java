/*/*
Lê  cinconomes e notas de uma turma, 
      * calcula e exibe a média das notas da turma 
      * exibe a relação de nomes em ordem alfabética 
      * Exibe a nota superior a media da turmaa
 */
package notasescolares;

import java.util.Scanner;

/**
 *
 * @author Daione
 */
public class NotasEscolares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int quant;
        System.out.println("Insira o número de alunos que você deseja cadastrar: ");
        quant = teclado.nextInt();
        
        boolean a = true;
        int resp = 0;
        String vet_nomes[] = new String[quant];
        double vet_notas[] = new double[quant];
        String aux = null;
        
      
            for (int i = 0; i <= quant-1; i++) {
                System.out.println("Digite o nome do aluno: ");
                vet_nomes[i] = teclado.next();  
                
                System.out.println("Digite a nota do aluno: " + vet_nomes[i]);
                 vet_notas[i] = new Scanner(System.in).nextDouble();
                                
            }
         
            
            for (int i = 0; i <= quant-1; i++) {
                for (int j = 0; j <= quant-1; j++) {
                    if(( vet_nomes[i].compareToIgnoreCase(vet_nomes[j]) < 0) && (a == true)){
                    aux = vet_nomes[j];
                    vet_nomes[j] = vet_nomes[i];
                    vet_nomes[i] = aux;
                    }
                }
            }
               
                System.out.println("A ordem correta dos nomes é: ");
                for (int j = 0; j <= quant-1; j++) {
                    System.out.println(vet_nomes[j]);
                
                    
                }
                
                System.out.println("NOME                           NOTA");
                for (int m = 0; m <= quant-1; m++) {
                System.out.printf("%-20s          %.2f \n" , vet_nomes[m], vet_notas[m]);
                    
                }
                
            
            
                
                    
                }    
            
            
        
        
    }
    

