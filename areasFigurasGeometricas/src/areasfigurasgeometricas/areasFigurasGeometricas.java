/*Faça um algoritmo para calcular a área de uma circunferência, considerando a
fórmula ÁREA = π * RAIO2. Utilize as variáveis AREA e RAIO, a constante π (pi =
3,14159) e os operadores aritméticos de multiplicação.
8. Faça um algoritmo que calcule a área de um triângulo, considerando a fórmula
Á􀜴􀜧􀜣 􀵌 􀮻􀮺􀯌􀮾 .􀮺􀯅􀯍􀯎􀯋􀮺
􀬶 . Utilize as variáveis AREA, BASE e ALTURA e os
operadores aritméticos de multiplicação e divisão.
 */
package areasfigurasgeometricas;


import static java.lang.Math.sqrt;

/**
 *
 * @author Daione
 */
public class areasFigurasGeometricas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static double areaRetangulo(double altura, double base){
        double area;
        
        area = altura*base;
     return area;   
    }
    
    public static double areaTriangulo(double altura, double base){
        double area;
        area = (altura*base)/2;
        return area;
    }
    
    public static double areaCircunferencia(double raio){
        double area;
        
        area = 3.14*3.14*raio;
        
        return area;
    }
    
    public static void classiArea(double area){
    do{
        if(area<0 || area == 0){
            System.out.println("Você não forneceu um valor válido de área!");
            
        } else{
                
        if(area<15){
            System.out.println("Area de pequeno porte. ");
        }else if (area>=15 && area < 56){
            System.out.println("Ares de médio porte.");
        } else if (area>=56){
            System.out.println("Area de grande porte.");
                     }
        
        
                }
    }while(area<0 || area == 0);
            }
     }
