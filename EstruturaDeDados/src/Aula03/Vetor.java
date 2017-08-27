package Aula03;

public class Vetor {
    private String[] elementos; 
    private int tamanho;
    
    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }
    
   /* public void adiciona(String elemento){
        //adicionar elemento em um vetor
        // quais elementos estão nulos??
        /*
        inteirar todos os elementos e ver se a
        posicao se encontra nula
        
        
        
        for (int i = 0; i < this.elementos.length; i++) {
            if(this.elementos[i] == null){
                this.elementos[i] = elemento;
                break;
                }
        }
    }*/
    
    public void adiciona(String elemento) throws Exception{
        if(this.tamanho<this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else{
            throw new Exception("Vetor já está cheio!");
        }

    }

    public boolean adiciona02(String elemento){
        if(this.tamanho<this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            return true;
        }
        return false; 
    }
    
}
