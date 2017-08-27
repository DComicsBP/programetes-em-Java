package exercicio01;
import java.util.Scanner;
public class Index {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        
        String resp = null; double soma = 0, i =0; 
        double valorDescontado = 0; 
        NotaFiscal nf = new NotaFiscal();
        
        do{
        
        i = (nf.valorTotal());
        System.out.println("Deseja comprar mais outro item? ");
        resp = scan.next(); 
        soma =  soma + nf.valorDescontado(valorDescontado);
                 
         
        }while(resp.equalsIgnoreCase("s"));
        /*
        int numeroItem; 
    String descricao; 
    int quantidade; 
    double precoUnitario;

        */
        
        System.out.printf("Valor total da compra com desconto: %.2f" , soma);
    }

}
