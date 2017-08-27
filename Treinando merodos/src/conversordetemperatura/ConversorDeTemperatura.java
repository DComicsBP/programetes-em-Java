package conversordetemperatura;

import java.util.Scanner;

public class ConversorDeTemperatura {
    Scanner scan = new Scanner(System.in);
    private double celsus, fahrenheit, kielvin;
    
    public double converteCelsusFah(double fah, double cel){
        this.setCelsus(cel);
        this.setFahrenheit(fah);
        System.out.println("Forneca uma temperatura em grau celsus");
        cel = scan.nextDouble();
        fah = (9 * cel + 160)/5;
        return fah;
    }
    public double converteFahCelsus(double cel, double fah){
        this.setCelsus(cel);
        this.setFahrenheit(fah);
        cel = 5*fah/(9*cel+160);
        return cel;
    }
    public double converteCelsusKi(double cel, double kie){
        this.setCelsus(cel);
        
        return kie;
    }
    
    public double getCelsus() {
        return celsus;
    }

    public void setCelsus(double celsus) {
        this.celsus = celsus;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double getKielvin() {
        return kielvin;
    }

    public void setKielvin(double kielvin) {
        this.kielvin = kielvin;
    }
    
}
