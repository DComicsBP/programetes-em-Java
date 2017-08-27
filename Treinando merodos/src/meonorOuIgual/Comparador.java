package meonorOuIgual;

public class Comparador {

    double valor1;
    double valor2;
    double valor3;
    double valor4;

    public void comparador() {
        double valor[] = new double[4];
        int aux = 0;
        valor[0] = valor1;
        valor[1] = valor2;
        valor[2] = valor3;
        valor[3] = valor4;
        for (int i = 0; i < valor.length; i++) {
            for (int j = 0; j < valor.length; j++) {
                if (valor[j] > valor[j + 1]) {
                    aux = (int) valor[j];
                    valor[j] = valor[j + 1];
                    valor[j + 1] = aux;
                }
            }
        }
    }

    public Comparador() {
    }

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public double getValor3() {
        return valor3;
    }

    public void setValor3(double valor3) {
        this.valor3 = valor3;
    }

    public double getValor4() {
        return valor4;
    }

    public void setValor4(double valor4) {
        this.valor4 = valor4;
    }

}
