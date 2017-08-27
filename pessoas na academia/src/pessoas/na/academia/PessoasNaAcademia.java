/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoas.na.academia;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Daione
 */
public class PessoasNaAcademia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
       
        
                
        
        
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("    REGISTRO DE ALUNOS DA ACADEMIA FORMA REDONDA    ");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        
        System.out.println("Quantas pessoas você deseja cadastrar?");
        int num = teclado.nextInt();
        System.out.println("O número de pessoas que você deseja cadastrar é " + num );
        
        
        
        String nome[] = new String [num];
        int idade[] = new int[num];
        String endereco[] = new String [num];
        String sexo[] = new String [num];
        double fone[] = new double [num];
        double circun_abdominal[] = new double[num];
        double porcent_gordura[] = new double[num];
        double peso[] = new double[num];
        double altura[] = new double[num];
        double imc[] = new double[num];
        
        Arrays.sort(nome);

        for (int i = 0; i < num; i++) {
            
            
            System.out.print("Forneça o nome do aluno: ");
            nome[i] = teclado.next();
            
            System.out.print("Forneça a idade da pessoa: ");
            idade[i] = teclado.nextInt();
            
            System.out.println("Forneça o sexo da pessoa: ");
            sexo[i] = teclado.next();
            
            
            System.out.print("Forneça o endereço do aluno: ");
            endereco[i] = teclado.next();
            
            System.out.print("Forneça o telefone do aluno: ");
            fone[i] = teclado.nextDouble();
            
            System.out.print("Forneça o tamanho da circunferência abidominal: ");
            circun_abdominal[i] = teclado.nextDouble();
            
            System.out.print("Forneça a porcentagem de gordura no corpo: ");
            porcent_gordura[i] = teclado.nextDouble();
            
            System.out.println("Forneça a massa do aluno: ");
            peso[i] = teclado.nextDouble();
            
            System.out.println("Forneça a altura do aluno: ");
            altura[i] = teclado.nextDouble();
            
            imc[i] = peso[i]/(altura[i]*altura[i]);
            System.out.print("O IMC do aluno é " + imc[i]);

        }
        
        
        
        System.out.println(nome);
        
    }
    
}
