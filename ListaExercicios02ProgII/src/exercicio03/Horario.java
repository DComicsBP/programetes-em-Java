/*
3. Crie uma classe chamada Horario que defina três atributos: hora, minuto e segundo. Defina também um
método chamado incSegundo que não recebe parâmetros e aumenta o horário em um segundo. Lembre-se
que aumentar o horário em um segundo pode implicar alterações na quantidade de minutos e/ou na quantidade
de horas (por exemplo, aumentar o horário 07:59:59 em 1 segundo altera o horário para 08:00:00).
Implemente um programa que leia um horário do usuário (como três números inteiros separados) e
construa um objeto da classe Horario, preenchendo-o com os valores informados. Logo após, leia outro número
inteiro do usuário especificando uma quantidade de segundos. Incremente o horário com o número de
segundos especificados pelo usuário, utilizando apenas uma estrutura for e o método incSegundo. Ao final,
mostre o horário modificado */

package exercicio03;
public class Horario {
    int hora; 
    int minuto; 
    int segundo;
    
    public int incSegundo(){
        segundo = this.segundo; 
        
        segundo = segundo+1; 
    return segundo;
    }

    public void contagem(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
       
        this.segundo = segundo;
        
       int segResto, minResto;
       
       
       if (minuto ==60)
           minuto = 0;
            
       
       minuto = minuto+(segundo/60); 
       hora = hora+(minuto/60);
       if(hora == 24){
           hora = 0; 
       }
       if (hora > 24){
           hora = hora%24; 
       }
       segResto = segundo%60; 
       minResto = minuto%60;
       
       
        System.out.println("Horario: " +hora + " : " + minResto + " : " + segResto);
        
    }
    

}
