/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio12;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Index {

    public static boolean divisivel(int varA, int varB) {
        boolean ehDivisivel = false;

        if (varA % varB == 0) {
            ehDivisivel = true;
        }

        return ehDivisivel;
    }

    public static boolean ehPrimo(int varB) {
        int varA = 0;
        boolean naoPrimo = divisivel(varA, varB);
        if(naoPrimo){
            naoPrimo = true;
        }


        return naoPrimo;
    }

    public static void main(String[] args) {

        int varB , varA;
        boolean ehDivisivel ;
        boolean primo = true;

        for (varB = 2; varB < 10000; varB++) {
            ehDivisivel = false;

            for (varA = 2; varA < varB; varA++) {
                ehDivisivel = divisivel(varB, varA);
                //if (varA % varB == 0) {
                  //  ehDivisivel = true;
                    

                //}
                break;

            }
            ehPrimo(varA);
          
            
            primo = false;
            System.out.println(" O número " + varB + " eh divisivel: " + ehDivisivel);
            System.out.println("O número é primo " + primo);
            System.out.println("");
        }

    }

}
