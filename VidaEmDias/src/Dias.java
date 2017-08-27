
import java.util.Scanner;

public class Dias {
    public int dias; 
    public int mes ; 
    public int anos; 
    
    Scanner scan = new Scanner(System.in); 
    
    public int anos(){
        int anoNascimento, anoAtual;
        System.out.println("Forneca o ano de seu nascimento: ");
        anoNascimento = scan.nextInt(); 
        
        System.out.println("Forneca o ano que está: ");
        anoAtual = scan.nextInt(); 
        
        this.anos = anoAtual - anoNascimento; 
        return this.anos; 
    }
    public void escolheMes(){
        System.out.println("Forneca o mes em que nasceu: ");
        System.out.println("[1] - janeiro");
        System.out.println("[2] - fevereiro");
        System.out.println("[3] - março");
        System.out.println("[4] - abril");
        System.out.println("[5] - maio");
        System.out.println("[6] - junho");
        System.out.println("[7] - julho");
        System.out.println("[8] - agosto");
        System.out.println("[9] - setembro");
        System.out.println("[10] - outubro");
        System.out.println("[11] - novembro");
        System.out.println("[12] - dezembro");
        
    }
    public void condicoes(){
    int n = scan.nextInt(); 
    switch(n){
        case 1: this.mes = 31;break;  
        case 2: this.mes = 28;break;  
        case 3: this.mes = 31;break;  
        case 4: this.mes = 30;break;  
        case 5: this.mes = 31;break;  
        case 6: this.mes = 30;break;  
        case 7: this.mes = 31;break;  
        case 8: this.mes = 31;break;  
        case 9: this.mes = 30;break;  
        case 10: this.mes = 31;break;  
        case 11: this.mes = 30;break;  
        case 12: this.mes = 31;break;  
        default: break; 
        
    }
    }
    
    public void diaNascimento(){
        System.out.println("Forneca o dia que nasceu ");
        this.dias = scan.nextInt(); 
        
        }
    
    public int calculaEmDias(){
        return this.anos + this.mes - this.dias; 
        
    
    }
           

}
