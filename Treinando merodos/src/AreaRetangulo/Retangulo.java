package AreaRetangulo;
import java.util.Scanner;
public class Retangulo {
    Scanner scan = new Scanner(System.in);
    private double base;
    private double altura;
    private double area;

    public Retangulo() {
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Scanner getScan() {
        return scan;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        
        return altura;
    }

    public double getArea() {
        area = base*altura;
        return area;
    }
    double retangulo(){
        area = base*altura;
        
        return area;
    }
    
}
