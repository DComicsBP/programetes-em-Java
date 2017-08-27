package exercicio03;
import java.util.Scanner;
public class Index {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        
        String nome = null, resp = null; double saldo =0; int codigo =0;
        
        Conta c = new Conta(codigo, nome, saldo); 
        System.out.println("Forneca o código da conta: "); c.codigo = scan.nextInt(); 
        
        System.out.println("Forneca o nome do usuário: ");c.nome = scan.next(); 
        
        System.out.println("Forneca o saldo da conta: "); c.saldo = scan.nextDouble(); 
        
        
        do{
            c.mostraOPcoes();
            int n = scan.nextInt(); 
        
            switch(n){
            case 1: System.out.println(c.depositar(saldo)); break; 
            case 2:System.out.println(c.sacar(saldo)); break; 
            default: System.out.println("Saindo do MENU!");
         
        }
            System.out.println("Deseja fazer outra operacao?");
            resp = scan.next();
        }while(resp.equals("s"));


    }
    
}
