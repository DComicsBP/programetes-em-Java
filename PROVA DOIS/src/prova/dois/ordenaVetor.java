/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova.dois;

/**
 *
 * @author Daione
 */
public class ordenaVetor {
    public static void ordemAlfabetica(String[] nomProduto, int[] quanProduto ,  double[] valorProduto, int quantIProduto){
        String aux1;
        int aux2;
        double aux3;
        boolean ordena = false;
        
        do{
            
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(nomProduto[j].compareToIgnoreCase(nomProduto[i]) > 0){
                    aux1 = nomProduto[i];
                    nomProduto[j] = nomProduto[i];
                    nomProduto[j] = aux1;
                    
                    aux2 = quanProduto[i];
                    quanProduto[j] = quanProduto[i];
                    quanProduto[j] = aux2;
                    
                    aux3 = valorProduto[i];
                    valorProduto[j] = valorProduto[i];
                    valorProduto[j] = aux3;
                  
                } else{
                    System.out.println("Nao estah ordenado!");
                }
                 
            
        }
 
       }
        
                
    } while (ordena == false);
}
  
    
}
