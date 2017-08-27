
import java.util.Scanner;

/*
3. Faça um programa que leia e valide as seguintes informações:
a. Nome: maior que 3 caracteres;
b. Idade: entre 0 e 150;
c. Salário: maior que zero;
d. Sexo: 'f' ou 'm';
e. Estado Civil: 's', 'c', 'v', 'd';
 */

/**
 *
 * @author Daione
 */
public class exercicio0301 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean condVerdade = false;
        
        
        do{
        System.out.println("Forneça o seu nome");
            String nome = input.next();
        
            if(nome.length() > 3){
                condVerdade = true;
            System.out.println("Seu nome é " + nome);
        } else{
                condVerdade = false;
                System.out.println("Você não digitoou um nome válido");
            }
        }while(!condVerdade);
        
        do{
            System.out.println("Forneça a idade: ");
            int idade = input.nextInt();
            
            if(idade > 0 && idade <= 150){
                condVerdade = true;
                System.out.println("Sua idade é " + idade + " anos.");
                            } else{
                condVerdade = false;
                System.out.println("Forneça uma idade válida sua anta!");
            }
        }while(!condVerdade);
        
        do{
            System.out.println("Forneça o salário que recebe (maior que zero): ");
            double salario = input.nextDouble();
            
            if(salario > 0 ){
                condVerdade = true;
                System.out.println("Seu salario é R$" + salario + " .");
                            } else{
                condVerdade = false;
                System.out.println("Forneça valor válido, sua anta!");
            }
        }while(!condVerdade);
        
        
        
        do{
            System.out.println("Qual o seu sexp? [feminino/masculino] ");
            String sexo = input.next();  
            
            if(sexo.equalsIgnoreCase("feminino") ||  sexo.equalsIgnoreCase("masculino") ){
                condVerdade = true; 
                System.out.println("Seu sexo é " + sexo + " .");
                            } else{
                condVerdade = false;
                System.out.println("Forneça sexo válido, sua anta!");
            }
        }while(!condVerdade); 
        
        
        
        do{
            System.out.println("Qual o seu estado civil? [casado/solteiro/viuvo/divorciado] ");
            String civil = input.next();  
            
            if(civil.equalsIgnoreCase("viúvo") ||  civil.equalsIgnoreCase("casado") || 
                    civil.equalsIgnoreCase("solteiro") || civil.equalsIgnoreCase("divorciado") ){
                condVerdade = true; 
                System.out.println("Seu estado civil é " + civil + " .");
                            } else{
                condVerdade = false;
                System.out.println("Forneça estado civil válido, sua anta!");
            }
        }while(!condVerdade);
        
        
        
    }
    
}
