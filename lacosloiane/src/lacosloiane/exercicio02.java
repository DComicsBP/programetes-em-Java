/*
Faça um programa que leia um nome de usuário e a sua senha e não
aceite a senha igual ao nome do usuário, mostrando uma mensagem
de erro e voltando a pedir as informações. */
package lacosloiane;
import java.util.Scanner;

/**
 *
 * @author Daione
 */
public class exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String resp = null;
        boolean infValidas = false;
        do{
        System.out.println("Digite o seu login:");
        String usuario = teclado.next();
        System.out.println("Digite a sua senha: ");
        String senha = teclado.next();
        
            if(usuario.equalsIgnoreCase(senha)){
                infValidas = false;
                System.out.println("A sua senha é igual ao seu login");
                System.out.println("Deseja fornecer novamente o seu login e senha?[s/n]");
            }else{
                infValidas = true;
                System.out.println("Senha e usuários válidas");
                                           
                }
        }while(!infValidas);
        }
}

            
    

