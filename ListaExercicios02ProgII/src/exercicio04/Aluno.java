/*
4. Construa uma classe chamada Aluno. Esta classe deverá conter os seguintes atributos:
 Um atributo inteiro contendo o número de matrícula do aluno.
 Um atributo String contendo o nome do aluno.
 Dois atributos double contendo as notas do aluno no semestre (considerando que o aluno tem somente
duas notas).
Defina os seguintes métodos para a classe:
 Um método chamado media que deve retornar a média das duas notas do aluno.
 Um método chamado aprovado que deve retornar um valor boolean informando se o aluno foi aprovado
ou não (true se o aluno foi aprovado ou false caso contrário). O aluno será aprovado quando
atingir média maior ou igual a 7,0.
 Um método chamado quantoPrecisa que deve retornar uma valor double contendo o quanto o aluno
precisaria no exame. Esse valor deve ser calculado utilizando a seguinte expressão:
Faça um programa em Java que crie um objeto da classe Aluno e preenche seus atributos com valores informados
pelo usuário. Mostre a média do aluno, se foi aprovado e caso não tenha sido aprovado, mostre
quanto precisará no exame. */

package exercicio04;

import java.util.Scanner;

public class Aluno {
    Scanner scan = new Scanner(System.in);
     int matricula; 
     String nomeAluno; 
     double  nota01; 
     double nota02; 
     int[] por = new int[6]; 

    public int[] getPor() {
        return por;
    }

    public void setPor(int[] por) {
        this.por = por;
    }
     
     double media; 
     
     
     public void insereInformacoes(){
         System.out.println("Forneca o nome do aluno: ");
         this.nomeAluno = scan.next(); 
         
         System.out.println("Forneca a matricula do aluno: ");
         this.matricula = scan.nextInt(); 
         
         System.out.println("Forneca a nota 01: ");
         this.nota01 = scan.nextDouble(); 
         
         System.out.println("Forneca a nota 02: ");
         this.nota02 = scan.nextDouble(); 
     }


    public Aluno(int matricula, String nomeAluno, double nota01, double nota02, double media) {
        this.matricula = matricula;
        this.nomeAluno = nomeAluno;
        this.nota01 = nota01;
        this.nota02 = nota02;
        this.media = media;
    }
    
    

   
    
    public double media( double media){
        this.media = media;
    
        return media = (this.nota01+this.nota02)/2; 
        
        
    }
    
    public boolean aprovado(){
        boolean aprovado = false; 
        
        if (this.media(media) >= 7)
            aprovado = true; 
        
        return aprovado; 
    }
    
    public double quantoPrecisa(double media){
        media = this.media; 
        if(media<7){
            media = (50-media*6)/4;
        }
        return media; 
    }
    
    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", nomeAluno=" + nomeAluno + ", nota01=" + nota01 + ", nota02=" + nota02 + '}';
    }

    
}
