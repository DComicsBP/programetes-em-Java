package treinostringbuilder;
public class TreinoStringBuilder {
    public static void main(String[] args) {
        StringBuilder nomes = new StringBuilder(); 
        
        nomes.append("carlos >").append("maria >").append("camach0 >"); 
        // length: conta todas as letras de todos os nomes 
        System.out.println(nomes);
        System.out.println(nomes.reverse());
        
        // o charAt seleciona a letra que ocupa a posicao 
        // que se quer analisar
        // ensureCapacity  -  garante que um Stringbuilder tenha pelo
        // menos a capacidade especificada; 
       // nomes.ensureCapacity(50);
        /*
        setLength aumenta ou diminui o comprimento deuma
        stringBuilder
        */
        
        
    }
    
}
