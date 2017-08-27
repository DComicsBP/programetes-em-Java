/*
1. Crie uma classe chamada Quadrado, que será um modelo para construção de objetos que armazenem
dados de quadrados. Esta classe conterá um único atributo, que armazenará o tamanho do lado do quadrado
em centímetros. Além deste atributo, a classe conterá três métodos: um que calcule e devolva a área do
quadrado (dado por LADO² ), outro que calcule e devolva o perímetro do quadrado (4 * LADO) e outro que
calcule e devolva o valor da diagonal do quadrado (LADO * √2). Escreva um programa que recebe o valor
do lado de um quadrado, crie um objeto da classe Quadrado com este valor de lado e mostre a área, o perí-
metro e a diagonal deste quadrado, usando os métodos do objeto criado.
 */

package exercicio01;


public class Quadrado {
    double lado; 
    double diagonal;
    double perimetro; 
    double area;
    
    
    
    public double areaQuadrado(double lado){
        area = lado*lado;
    return area; 
    }
    
    public double perimetroQuadrado(double lado){
         
        perimetro = lado*4; 
        
        return perimetro; 
    }
    
    public double diagonalQuadrado(double lado){
        double a =2;
        double b = Math.sqrt(a);
        diagonal  = lado*b; 
        
        return diagonal; 
    }

    @Override
    public String toString() {
        return "Quadrado{" + " diagonal=%.2f\n" + diagonal + ", perimetro=%.2f\n" + perimetro + ", area=%.2f\n" + area + '}';
    }

    

    
    
}
