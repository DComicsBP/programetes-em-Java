
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 Faça um algoritmo que:
a) Obtenha o valor para a variável HT (horas trabalhadas no mês);
b) Obtenha o valor para a variável VH (valor hora trabalhada):
c) Obtenha o valor para a variável PD (percentual de desconto);
d) Calcule o salário bruto => SB = HT * VH;
e) Calcule o total de desconto => TD = (PD/100)*SB;
f) Calcule o salário líquido => SL = SB – TD;
g) Apresente os valores de: Horas trabalhadas, Salário Bruto, Desconto, Salário
Liquido.
 */

/**
 *
 * @author Daione
 */
public class fichaFuncional {
    public static void main(String[] args) {
      dadosCadastrais();
    }
   public static void dadosCadastrais(){
       
       Scanner scan = new Scanner(System.in);
       boolean cond = false; 
      
       
       System.out.println("Forneça o nome: ");
        String nome= scan.next();
        
        System.out.println("Forneca o sobrenome: ");
        String sobrenome = scan.next();
        
       
       
        System.out.println("Forneca a idade: ");
        int idade = scan.nextInt();
            
        System.out.println("Forneca o sexo [F/M] ");
        String sexo = scan.next();
        if(sexo.equalsIgnoreCase("F")){
            System.out.println("Sexo feminino");
        } else if(sexo.equalsIgnoreCase("M")){
            System.out.println("Sexo masculino");
            } else if (sexo != "m" || sexo!="f"){
                System.out.println("Você não forneceu um sexo válido!");
                }
            }

   
      
    
    public static void horasTrabalhadas(double ht){
        do{
        
        if(ht < 40){
            System.out.println("O nuncionário deve horas a empresa");
        }else if(ht>40){
            System.out.println("A empresa deve recompensar as horas excedentes trabalhadas ");
        }
        }while(ht < 0 || ht ==0);
    }
}
    
    
    
    
    
    

