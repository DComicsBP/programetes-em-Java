package Aula07;


public class teste {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(20); 
        
       vetor.adiciona02("e");
        vetor.adiciona02("C");
        vetor.adiciona02("E");
        vetor.adiciona02("F");
        vetor.adiciona02("G");
        
        System.out.println(vetor);
        vetor.adiciona(4, "D");
       
        System.out.println(vetor);
        System.out.println(vetor.toString());
        
    }

}
