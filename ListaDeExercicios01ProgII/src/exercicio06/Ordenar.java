package exercicio06;
public class Ordenar {
    private String[] time;
    private int[] pontos;

    public void porEmOrdem(String[] time, int[] pontos) {
        this.time = time;
        this.pontos = pontos;
        
        boolean troca = true;
        while(troca){
            troca = false; 
            for (int i = 0; i < pontos.length; i++) {
                if(pontos[i] > pontos[i+1]){
                    int aux01 = pontos[i+1];
                    pontos[i+1] = pontos[i];
                    pontos[i] = aux01; 
                    
                    String aux = time[i+1];
                    time[i+1] = time[i];
                    time[i] = aux;
                    
                    troca = true; 
                                
                    
                }
                
            }
            
        }
        
    }

    
    
    
    
    public void setTime(String[] time) {
        this.time = time;
    }

    public void setPontos(int[] pontos) {
        this.pontos = pontos;
    }
    
}


        