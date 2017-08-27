
public class Exercicio08 {

    public static void main(String[] args) {
        boolean[] vetor = new boolean[1000];

        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = true;
        }

        for(int i = 2; i < vetor.length; i++) {
            if(vetor[i]) {
                for(int j = i*2; j < vetor.length; j+=i) {
                    vetor[j] = false;
                }
            }
        }

        for(int i = 2; i < vetor.length; i++) {
            if(vetor[i])
                System.out.println(i);
        }
    }
	
}
