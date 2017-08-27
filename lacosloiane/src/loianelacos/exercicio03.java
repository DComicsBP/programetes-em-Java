/* 3. Faça um programa que leia e valide as seguintes informações:
a. Nome: maior que 3 caracteres;
b. Idade: entre 0 e 150;
c. Salário: maior que zero;
d. Sexo: 'f' ou 'm';
e. Estado Civil: 's', 'c', 'v', 'd';  */
package loianelacos;
import java.util.Scanner;
 public class exercicio03 {
     public static void main(String[] args) {
         boolean infoValida = false;
         
         Scanner teclado = new Scanner(System.in);
         String nome, sexo, estadoCivil;
         int idade;
         double salario;
         
         do{
             
         
         System.out.println("Digite o seu nome:");
         nome = teclado.next();
         if(nome.length() >= 3){
             infoValida = true;
         } else {
             System.out.println("O nome precisa de no mínimo três caracteres");
         }
         }while(!infoValida);
         
         do{
         System.out.println("Digite a sua idade: ");
         idade = teclado.nextInt();
         if(idade > 0 && idade<=150){
             infoValida = true;
             System.out.println("A idade é " + idade);
         } else{
             infoValida = false;
             System.out.println("Insira uma idade válida");
         }
         }while(!infoValida);
         
         
         do{
         System.out.println("Digite o seu salário:");
         salario = teclado.nextDouble();
         
         if(salario > 0){
             
             
             infoValida = true;
         
             System.out.println("Seu salário é " + salario + "R$ . ");
         }else{
             infoValida = false;
             System.out.println("Forneça um valor válido");
         }
     }while(!infoValida);
         
         do{
         System.out.println("Qual o seu sexo? [f/m]");
         sexo = teclado.next();
         if(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")){
         infoValida = true;
             System.out.println("Seu sexo é " + sexo);} else{
             infoValida = false;
             System.out.println("Forneça o sexo como se pede:");
         }             
         }while(!infoValida);
         
         do{
         System.out.println("Qual o seu estado civil?");
         System.out.println("   Digite [s] se solteiro");
         System.out.println("   Digite [c] se casado ");
         System.out.println("   Digite [v] se viúvo");
         System.out.println("   Digite [d] se divorciado");
         estadoCivil = teclado.next();
         
         if(estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("v") ||estadoCivil.equalsIgnoreCase("d")){
             
         infoValida = true;
             System.out.println("Você é " + estadoCivil);} 
         else{
             infoValida = false;
             System.out.println("Forneça o valor correto");
         }
             
     }while(!infoValida);
 
     
     
     }
}
