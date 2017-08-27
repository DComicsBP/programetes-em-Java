package Registro;

import java.util.Scanner;

public class Registro {

    Scanner scan = new Scanner(System.in);
    private String nome, sobrenome, endereco, funcao, sexo;

    private int numCasa, idade, numFone, numDDD;
    private double salario, aumentoSal, peso, altura;
    private boolean empregado = true;

    Registro() {
    }

    public void insiraDados() {
        System.out.print("NOME: ");
        this.setNome(nome);
        this.nome = scan.next();
        System.out.println("");

        System.out.print("SOBRENOME: ");
        this.sobrenome = scan.next();
        this.setSobrenome(sobrenome);
        System.out.println("");

        System.out.print("SEXO: ");
        this.setSexo(sexo);
        this.sexo = scan.next();
        System.out.println("");

        System.out.print("IDADE: ");
        this.setIdade(idade);
        this.idade = scan.nextInt();
        System.out.println("");
    
        System.out.print("Funcao: ");
        this.setFuncao(funcao);
        this.funcao = scan.next();
        System.out.println("");

        System.out.print("ENDERECO: ");
        this.setEndereco(endereco);
        this.endereco = scan.next();
        System.out.println("");

        System.out.print("NUMERO: ");
        this.setNumCasa(numCasa);
        this.numCasa = scan.nextInt();
        System.out.println("");

        System.out.print("DDD: ");
        this.setNumDDD(numDDD);
        this.numDDD = scan.nextInt();
        System.out.println("");

        System.out.print("FONE: ");
        this.setNumFone(numFone);
        this.numFone = scan.nextInt();
        System.out.println("");

        System.out.print("SALARIO: ");
        this.setSalario(salario);
        this.salario = scan.nextInt();
        System.out.println("");
    }

    public void printDados() {
        System.out.println("Nome:  " + this.getNome());
        System.out.println("Sobrenome: " + this.getSobrenome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Cargo: " + this.getFuncao());
        System.out.printf("Salario: %.2f" , this.getSalario());
        System.out.println("");
    }

    public double imc(double imc) {
        imc = this.peso / this.altura * this.altura;
        return imc;
    }

    public double aumentaSalario(double salario) {
        double aumento = 0;
        if (this.salario <= 1000) {
            aumento = this.salario * 0.50;
        } else if (this.salario > 1000 && this.salario <= 2000) {
            aumento = this.salario * 0.25;
        } else if (this.salario < 2000 && this.salario <= 3000) {
            aumento = this.salario * 0.10;
        } else if (this.salario > 3000) {
            aumento = this.salario * 0.05;
        }

        this.salario = this.salario + aumento;
        System.out.printf("O novo salário é: %.2f" , this.salario);
        System.out.println("");
        return this.salario;

    }

    public void sexo(String sexo) {
        this.setSexo(sexo);
        if (sexo.equalsIgnoreCase("F")) {
            System.out.println("SEXO FEMININO");
        } else if (sexo.equalsIgnoreCase("M")) {
            System.out.println("SEXO MASCULINO");
        } else {
            System.out.println("SEXO NAO INFORMADO");
        }
    }

    public double descontaINSS(double salario) {
        double inss;

        salario = this.salario;

        if (this.salario <= 1217.7) {
            inss = this.salario * 0.08;
            this.salario = this.salario - inss;

        } else if (this.salario > 1217.7 && this.salario <= 2079.89) {
            inss = this.salario * 0.09;
            this.salario = this.salario - inss;

        } else if (this.salario > 2079.89 && this.salario <= 4150.00) {
            inss = this.salario * 0.11;
            this.salario = this.salario - inss;

        } else {
            inss = this.salario * 0.12;
            this.salario = this.salario - inss;

        }

        if (this.salario < 1710.78) {

        }
        System.out.printf("O Desconto de INSS é: %.2f" , inss);
        System.out.println("");
        return salario;
    }

    public double descontaIR(double salario) {
        double ir;
        descontaINSS(salario);

        salario = this.salario;

        if (this.salario <= 1710.78) {
            ir = this.salario * 0;
            this.salario = this.salario - ir;

        } else if (this.salario > 1710.79 && this.salario <= 2563.91) {
            ir = this.salario * 0.075;
            this.salario = this.salario - ir;

        } else if (this.salario > 2563.92 && this.salario <= 3418.59) {
            ir = this.salario * 0.15;
            this.salario = this.salario - ir;

        } else if (this.salario > 3418.60 && this.salario <= 4271.59) {
            ir = this.salario * 0.225;
            this.salario = this.salario - ir;

        } else {
            ir = this.salario * 0.275;
            this.salario = this.salario - ir;
        }
        System.out.printf("O desconto de imposto de renda é %.2f" , ir);
        System.out.println("");
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getNumCasa() {
        return numCasa;
    }

    public void setNumCasa(int numCasa) {
        this.numCasa = numCasa;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumFone() {
        return numFone;
    }

    public void setNumFone(int numFone) {
        this.numFone = numFone;
    }

    public int getNumDDD() {
        return numDDD;
    }

    public void setNumDDD(int numDDD) {
        this.numDDD = numDDD;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getAumentoSal() {
        return aumentoSal;
    }

    public void setAumentoSal(double aumentoSal) {
        this.aumentoSal = aumentoSal;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public boolean isEmpregado() {
        return empregado;
    }

    public void setEmpregado(boolean empregado) {
        this.empregado = empregado;
    }

}
