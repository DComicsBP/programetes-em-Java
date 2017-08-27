/* Crie um programa que leia um vetor de 10 números inteiros e gere um segundo vetor cujas posições pares
são o dobro do vetor original e as ímpares o triplo. */
package exercicio07;
public class exercicio07 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = i;
            if(i % 2 == 0){
            vetorB[i] = vetorA[i]*2; 
            }else if(i%2==1){
                vetorB[i] = vetorA[i]*3; 
            }
        }
        
        System.out.println("");
        System.out.print("Os valores do vetor A são: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " - ");
        }
        
        System.out.println("");
        System.out.print("Os valores do vetor B serão: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorB[i]+ " - ");
        }
        
    }

}
