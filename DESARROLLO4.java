/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desarrollo4;
import java.util.Scanner;
/**
 *
 * @author pc13
 */
public class DESARROLLO4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner (System.in);
    int numero;
        System.out.println ("Introduce un número entero");
        numero = entrada.nextInt ();
        if (numero% 2 == 0)
            System.out.println ("Par");
        else 
            System.out.println ("Impar");
            
            }
    
}
