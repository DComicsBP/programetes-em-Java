/*1. Crie uma classe chamada ItemNotaFiscal que deverá conter os seguintes atributos:
 O número do item faturado (um número inteiro).
 A descrição do item.
 A quantidade comprada do item (um valor inteiro).
 O preço unitário do item.
Acrescente os seguintes métodos à classe:
 Um método chamado valorTotal que retorna o valor total do item (multiplicando o valor total pela
quantidade).
 Um método chamado valorDescontado que recebe como parâmetro um valor double contendo o
percentual de desconto a ser aplicado ao item e calcula o valor total descontado, seguindo a seguinte
expressão:
Faça um programa que crie um objeto da classe com valores quaisquer e mostre os valores contidos nos
atributos, o valor total do item e o valor total descontado de 15% (utilizando o método valorDescontado)
 */

package exercicio01;

import java.util.Scanner;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class NotaFiscal {
    Scanner scan = new Scanner(System.in);
    int numeroItem; 
    String descricao; 
    int quantidade; 
    double precoUnitario;

    public double valorTotal(){

        System.out.println("Forneca o número do item: ");
        System.out.println("DIGITE [1] = PIPOCA DOCE");
        System.out.println("DIGITE [2] = PIPOCA SALGADA");
        System.out.println("DIGITE [3] = COCA-COLA");
        System.out.println("DIGITE [4] = FRUKI guaraná");
        this.numeroItem = scan.nextInt(); 
        switch(this.numeroItem){
            case 1:
                this.descricao = "Pipoca Doce ";this.precoUnitario  = 1.50;  break; 
                 
            case 2: 
                this.descricao = "Pipoca salgada"; this.precoUnitario = 1.20; break; 
            case 3:
                this.descricao = "Coca - Cola"; this.precoUnitario = 2.50; break; 
            case 4: 
                this.descricao = "Fruki Guaraná"; this.precoUnitario = 2.00; break;
            default:
                break; 
        }
        System.out.println("Qual a quantidade? ");
        this.quantidade = scan.nextInt();
       
        System.out.println("VALOR TOTAL DO ITEM SEM DESCONTO = " + (this.precoUnitario*this.quantidade));
        return this.precoUnitario*this.quantidade;
        
    }
    
    public double valorDescontado(double valorDescontado){
        
        valorDescontado  = this.precoUnitario*this.quantidade - (15*this.precoUnitario*this.quantidade/100);
        
        return valorDescontado;
    }

    
    
    

}
