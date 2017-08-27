
import java.util.Scanner;

public class codRafa {
    
    public static void OrdenaProdutos(String[] produtos, double[] precos, int[] quantidade, int tamanho){
        String auxP;
        double auxPr;
        int auxQ;
        boolean ordenado = false;
        
        for (int i = 1; i <= tamanho - 1; i++) {
            for (int j = 0; j <= tamanho - 1; j++) {
                if(produtos[j].compareToIgnoreCase(produtos[i]) > 0){
                    
                    auxP = produtos[j];
                    auxPr = precos[j];
                    auxQ = quantidade[j];
                    
                    produtos[j] = produtos[i];
                    precos[j] = precos[i];
                    quantidade[j] = quantidade[i];
                    
                    produtos[i] = auxP;
                    precos[i] = auxPr;
                    quantidade[i] = auxQ;
                    
                }
            }
            
            if(produtos[0].compareToIgnoreCase(produtos[produtos.length -1])== 0){
                ordenado = true;
            }
               
        }
        
        
        
    }
    
    
    public static void main(String[] args) {
        Scanner pegaV = new Scanner(System.in);
        Scanner produto = new Scanner(System.in);
        System.out.println("CONTROLE DE ESTOQUE DOMESTICO");
        System.out.println("_____________________________\n\n");
        
        System.out.println("       ENTRADA DE DADOS\n");
        
        
        System.out.print("Informe a quantidade de produtos: ");
        int numP = pegaV.nextInt();
        
        String[] produtos = new String[numP];

        if(numP > 10){
            System.out.println("No máximo 10 produtos!");
            System.out.print("Informe novamente a quantidade de produtos:");
            numP = pegaV.nextInt();
            produtos = new String[numP];
        }
        
        
         double[] precoU = new double[numP];
         int[] quantidade = new int[numP];
                
                
        for (int i = 0; i <= produtos.length - 1; i++) {
            System.out.print("Informe o produto: ");
            produtos[i] = produto.nextLine();
            
            System.out.print("Informe a quantidade: ");
            quantidade[i] = pegaV.nextInt();
            
            System.out.print("Informe o valor por produto:");
            precoU[i] = pegaV.nextDouble();
            
            System.out.println("");
        }
        
        OrdenaProdutos(produtos, precoU, quantidade, numP);
        
        System.out.println("                         LISTAGEM DE PRODUTOS    ");
        System.out.println("Nomes*************Qauntidade*************Preco(Un)***********Total********MENS");
        for (int i = 0; i <= produtos.length - 1; i++) {
           double total = quantidade[i] * precoU[i]; 
           String estado;
           
           if(quantidade[i] < 10){
               estado = "Repor";
           }
           else{
               estado = "Normal";
           }
           
           System.out.printf("%-20s %d                    %.2f            %.2f       %-10s\n",produtos[i],quantidade[i],precoU[i],total,
                   estado);
           
        }
        
    }
    
}