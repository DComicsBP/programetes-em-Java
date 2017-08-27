package comparacaoBoolean;
//6 <= 7
import static java.lang.Integer.parseInt;
import java.util.Scanner;
public class Comparador {
    Scanner scan = new Scanner(System.in);
    public void compararDoisNumeros(){
        System.out.println("Forneca um numero: ");
        int number01 = scan.nextInt();
        System.out.println("Forneca outro numero inteiro: ");
        int number02 = scan.nextInt();
        if(number01<=number02){
            System.out.println("O primeiro número é " + number01 + " e é menor que " + number02 + " .");
        }else if(number02<=number01){
            System.out.println("O segundo número é " + number02 + " e é menor que " + number01 + " .");
        
        }
    }
    public void compararValorChar(){
        char p1 = 'p', p ='P', s1 = 's', s ='S' ,e1 = 'e', e = 'E' ,u1 = 'u' ,u ='U' ,d1 = 'd', d ='D' ,o1 = 'o' ,o = 'O' ,c = 'c' ,c1 ='C' ,i1 = 'i' ,i = 'I' ,g1 ='g' ,g = 'G';
        boolean status = false;  
        int soma01;
        int soma02;
        soma01 = p+s+e+u+d+o+c+o+d+i+g+o;
        soma02 = p1+s1+e1+u1+d1+o1+c1+o1+d1+i1+g1+o1;
        //System.out.println(soma01);
        //System.out.println(soma02);
        
        if(soma01 == soma02){
            status = false;
            System.out.println("A soma não é igual!");
        }
        if(soma01< soma02){
            status = true;
            System.out.println("A desigualdade é verdadeira");
        }
        if (soma01 > soma02){
            status = false;
            System.out.println("A desigualdade é falsa!");
        }
        System.out.println("As relações são falsas quando: " );
        System.out.println(soma01 + " > " + soma02);
        System.out.println(soma01 + " = " + soma02);
    }
    
    
    
}
