/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesortstring;

import java.util.Scanner;

/**
 *
 * @author Daione
 */
public class metodoBubbleSort {
    
    public static void ordemAlfabetica(String[] nomeProduto, int[] quantProduto, double[] valorProduto, double quantProd){
        
    String aux1;
    
    int aux2;
    double aux3;
    
    
                
		
		
		
for(int x=1;x<quantProd;x++){
	for(int y=0;y<quantProd-x;y++){
		if(nomeProduto[y].compareToIgnoreCase(nomeProduto[y+1])>0) {
				
			aux1=nomeProduto[y];
			nomeProduto[y]=nomeProduto[y+1];
			nomeProduto[y+1]=aux1;
                                
                         aux2=quantProduto[y];
			quantProduto[y]=quantProduto[y+1];
			quantProduto[y+1]=aux2;
                                                    
                                                    aux3=valorProduto[y];
			valorProduto[y]=valorProduto[y+1];
			valorProduto[y+1]=aux3;
                        	}
	}
	
        }        
}
    
    
}
