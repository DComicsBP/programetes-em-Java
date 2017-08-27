/*
Cria uma classe para representar  uma contacorrente que possui	 um  número, um saldo, um status
que informa  se ela  é	 especial ou não, um  limite. */

/**
 *
 * @author Daione
 */
public class index {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        conta especifica = new conta();
        
        especifica.especial = true;
        especifica.limite = 500;
        especifica.nomeCliente = "Daione Pavan";
        especifica.numConta = 199345;
        especifica.saldo = -230;
        
        System.out.println(especifica.especial);
        System.out.println(especifica.limite);
        System.out.println(especifica.nomeCliente);
        System.out.println(especifica.numConta);
        System.out.println(especifica.saldo);
        
        
    }
    
}
