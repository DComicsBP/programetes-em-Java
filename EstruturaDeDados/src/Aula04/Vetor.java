package Aula04;
import java.util.Arrays;
public class Vetor {
    private String[] elementos; 
    private int tamanho;
    
    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        tamanho = 0;
    }
        public void adiciona(String elemento){
        //adicionar elemento em um vetor
        // quais elementos estão nulos??
        
        //inteirar todos os elementos e ver se a
        //posicao se encontra nula
        
        
        
        for (int i = 0; i < this.elementos.length; i++) {
            if(this.elementos[i] == null){
                this.elementos[i] = elemento;
                break;
                }
        }
    }
    
  /*  public void adiciona(String elemento) throws Exception{
        if(this.tamanho<this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else{
            throw new Exception("Vetor já está cheio!");
        }

    }
*/
    public boolean adiciona02(String elemento){
        if(this.tamanho<this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false; 
    }
    public int tamanho(){
        return this.tamanho;
    }

    @Override
    public String toString() {
        /*
        arrays to string serve para poder
        printar todos os elementos do vetor que 
        eu desejo saber 
        String s = "[";
        for (int i = 0; i < this.tamanho-1; i++) {
            s+= this.elementos[i]; 
            s+= " , "; 
        }
        if(this.tamanho>0){
            s+= this.elementos[this.tamanho-1]; 
            
        }
        s+= "]";
        
        */
        
        
        StringBuilder s = new StringBuilder();
            s.append(this.elementos[this.tamanho-1]);
            
        for (int i = 0; i <this.tamanho-1; i++) {
            s.append(this.elementos[i]);
            s.append(" , ");
        }
        if(this.tamanho>0){
            s.append(this.elementos[this.tamanho-2]);
            
        }
            /*s+= this.elementos[i];
            s+= " , ";
            
        }
        s+= "]";
        */
        return s.toString();
    }
    
    
}
