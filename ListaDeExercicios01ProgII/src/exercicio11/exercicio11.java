/*
11. Uma pequena companhia aérea acabou de comprar um computador para seu novo sistema automatizado
de reservas. Você foi solicitado a desenvolver o novo sistema. Você deve escrever um programa que
permita reservar assentos em cada voo da companhia (os aviões tem capacidade para 10 passageiros).
O programa deve mostrar as seguintes opções para o usuário: digite 1 para Primeira Classe, 2 para
Econômica e 0 para sair. Se o usuário digitar 1, seu programa deve selecionar o primeiro assento vago na
primeira classe (poltronas 1 a 5). Se o usuário digitar 2, seu programa deve selecionar o primeiro assento
vago na classe econômica (poltronas 6 a 10). O programa deve mostrar o número da poltrona selecionada e
se ela está na primeira classe ou na classe econômica.
Utilize um array do tipo boolean para representar o gráfico de assentos do avião. Inicialize todos os
elementos como false para indicar que todas as poltronas estão vagas. À medida que cada assento é reservado,
configure o elemento correspondente do array como true.
Quando a classe selecionada pelo usuário estiver lotada, mostre a mensagem “Não há mais vagas.” */



package exercicio11;

import java.util.Scanner;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class exercicio11 {
    public static void adiciona(boolean[] vetor, int j) {
        for (; j < 5; j++) {

            if (vetor[j] == false) {
                vetor[j] = true;
                break;
            }

        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean[] vetor01 = new boolean[5];
        boolean[] vetor02 = new boolean[5];
        boolean[] vetor00 = new boolean[10];
        

        int i = 0;

        for (; i < 10; i++) {
            

            System.out.println("DIGITE [1] CLASSE ECONOMICA");
            System.out.println("DIGITE [2] PRIMEIRA CLASSE");
            System.out.println("DIGITE [0] SAIR DO MENU ");
            int n = scan.nextInt();
            switch (n) {
                case 1:

                    for (int j = 0; j <= 5; j++) {
                        try {

                            if (vetor01[j] == false) {
                                vetor01[j] = true;
                                break;
                            }
                        } catch (Exception a) {
                            if (j == 5) {

                                System.out.println("A reserva não pode ser feita na primeira classe");
                                System.out.println("Deseja tentar fazer reserva na segunda classe? [s/n]");
                                String resp = scan.next();

                                switch (resp) {
                                    case "s":
                                        System.out.println("Saindo da Opção");
                                        
                                        break;
                                    default:
                                        System.out.println("Saindo do Looping");
                                        break;
                                }
                                break;

                            }

                        }
                        
                            i = i - 1;
                    }
                    

                    break;
                case 2:
                    for (int j = 0; j <= 5; j++) {
                        try {

                            if (vetor02[j] == false) {
                                vetor02[j] = true;
                                break;
                            }
                        } catch (Exception e) {
                            if (j == 5) {
                                System.out.println("A reserva não pode ser feita na clsse economica");
                                System.out.println("Aperte 'S' para sair");
                                String resp = scan.next();
                                while (resp.equalsIgnoreCase("s")) {
                                    System.out.println("Saindo da Opção");
                                    break;
                                }
                                
                            }
                            i = i - 1;
                            break;

                        }
                        
                    }
                    break;

                case 0:
                    System.out.println("Saindo do programa");
                    break;
                default:
                    break;

            }

            System.out.println(vetor01[0] + " " + vetor01[1]);
            System.out.println(vetor01[2] + " " + vetor01[3]);
            System.out.println(vetor01[4] + " " + vetor02[0]);
            System.out.println(vetor02[1] + " " + vetor02[2]);
            System.out.println(vetor02[3] + " " + vetor02[4]);

        
        }

    }
}

