package exercicio11;

public class Vetor {

public boolean[] adiciona(boolean[] vet){
    
    
    for (int i = 5; i < 10; i++) {
        if(!vet[i])
        vet[i] = true; 
         
        
    }
    
    return vet; 
  
}


public boolean[] adicionaInicio(boolean[] vet){
    for (int i = 0; i < 5; i++) {
        if(!vet[i])
        vet[i] = true; 
        break; 
        
    }
    
    
    return vet; 
}

}