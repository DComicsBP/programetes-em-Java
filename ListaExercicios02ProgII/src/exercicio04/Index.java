package exercicio04;

import java.util.Scanner;

public class Index {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double nota01 = 0, nota02 = 0, media = 0, quantoPrecisa = 0;

        int matricula = 0; String nomeAluno = null;

        Aluno a1 = new Aluno(matricula, nomeAluno, nota01, nota02, media);

        a1.insereInformacoes();
        
        System.out.println("Media: " + a1.media(media));
        if(a1.media(media)<5){
            System.out.println("Aprovado : " + a1.aprovado() + " Sua media eh " + a1.media(media));
        } else if(a1.media(media) >= 5 && a1.media(media)<7){
            System.out.println("Aprovado: " + a1.aprovado());
            System.out.println("Em exame! ");
            System.out.println("Você precisa tirar " + a1.quantoPrecisa(quantoPrecisa));
        }else{
            System.out.println("Aprovado: " + a1.aprovado() + " com media = "+ a1.media(media) ); 
        }
        
        System.out.println(a1.toString());
    }

}
