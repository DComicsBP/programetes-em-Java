package AreaTriangulo;
public class Triangulo {
    private double area, base, altura; 
    
public double setArea(double area){
    return area;
}
    public double getArea() {
        
    this.area = (this.altura * this.base)/2;
        return this.setArea(area);
    }

    

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
}
