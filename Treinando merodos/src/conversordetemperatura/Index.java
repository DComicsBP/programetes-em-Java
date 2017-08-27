package conversordetemperatura;
public class Index {
    public static void main(String[] args) {
        double celsus = 0, kielven = 0, fahrenheit = 0;
                
        ConversorDeTemperatura c1 = new ConversorDeTemperatura();
        
        System.out.println(c1.converteCelsusFah(celsus, fahrenheit));
        
    }
    
}
