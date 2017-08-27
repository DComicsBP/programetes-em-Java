package exercicio03;
import java.util.Scanner;
/*. Faça um programa que leia três valores para os lados de um triângulo (A, B e C). O programa deve
indicar qual tipo de triângulo foi formado: isósceles (dois lados iguais), escaleno (os três lados diferentes) ou
equilátero (três lados iguais). Lembre-se que, para formar um triângulo, a soma de dois lados deve ser
maior do que o valor do terceiro lado (A + B > C, A + C > B, B + C > A )*/
public class exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Forneca o lado 1: ");
        double lado01 = scan.nextDouble();
        
        System.out.println("Forneca o lado 1: ");
        double lado02 = scan.nextDouble();
        
        System.out.println("Forneca o lado 1: ");
        double lado03 = scan.nextDouble();
        
        
        
        if(lado01+lado02 < lado03 || lado03+lado02 < lado01 || lado01+lado03 < lado01 ){
            System.out.println("Não é triangulo! ");
        }else{
            if(lado01 == lado02 && lado03 == lado01){
                System.out.println("O triangulo é equilátero");
            }else if(lado01 == lado02 || lado02 == lado03 || lado01 == lado03){
                System.out.println("O triangulo é isóceles");
        
            }else {
                //if(lado01 != lado02 && lado01!=lado03 && lado03 != lado02){
                /*
                Se as possibilidades excluem umas das outras 
                não preciso colocar a ultima condicional 
                */
                
                
            System.out.println("O triangulo é escaleno");
                }
            }
        }

    }
