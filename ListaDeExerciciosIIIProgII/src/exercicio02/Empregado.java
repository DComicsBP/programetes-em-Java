/*
Crie uma classe chamada Empregado que contenha os seguintes atributos: o primeiro nome do empregado,
o sobrenome, e seu salário mensal. Faça um método chamado reajuste que receba um valor double
passado como parâmetro e conceda um aumento de salário de acordo com o percentual informado. Faça
outro método chamado nomeCompleto que retorne um String contendo o sobrenome em maiúsculas seguido
de uma vírgula, um espaço em branco e do primeiro nome. Faça um programa que crie dois objetos des -
sa classe, mostre os dados de cada empregado (nome completo, utilizando o método, e o salário), conceda
um aumento de 20% a cada um e mostre os dados deles novamente. */
package exercicio02;
public class Empregado {
    

    String nome;
    String sobrenome;
    double salarioMensal;

    public Empregado(String nome, String sobrenome, double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
    }

   
    
    @Override
    public String toString() {
        return "Empregado{" + "SOBRENOME: " + sobrenome.toUpperCase() + " , NOME: " + nome + ", SALARIO REAJUSTADO: " + salarioMensal + '}';
    }
    
    

    public double reajuste(double salario) {
         this.salarioMensal = salario;
this.salarioMensal = salario +(salario*0.20);
        return this.salarioMensal;
            
        
    }
    

}
