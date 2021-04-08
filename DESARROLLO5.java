/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desarrollo5;

import java.util.Scanner;

/**
 *
 * @author pc13
 */
public class DESARROLLO5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner (System.in);
    int numero;
        System.out.println ("Introduce un número multiplo de 10 ");
        numero = entrada.nextInt ();
        if (numero%10 == 0)
            System.out.println ("Correcto");
        else 
            System.out.println ("INCORRECTO. INGRESE UN NUMERO MULTIPLO DE 10");
            }
    
}
