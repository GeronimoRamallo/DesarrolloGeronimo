/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desarrollo19;

import java.util.Scanner;

/**
 *
 * @author pc15
 */
public class DESARROLLO19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        char caracter;
        System.out.println("Ingrese un caracter y le diré si es vocal");
        caracter = entrada.next().charAt(0);
    
    switch(caracter){
        case 'A':System.out.println("El caracter es la vocal A");
            break;
        case 'E':System.out.println("El caracter es la vocal E");
            break;
        case 'I':System.out.println("El caracter es la vocal I");
            break;
        case 'O':System.out.println("El caracter es la vocal O");
            break;
        case 'U':System.out.println("El caracter es la vocal U");
            break;
        default:System.out.println("El caracter no es una vocal o ha insertado el caracter en minuscula. Intente insertando una vocal o insertando el caracter en mayúscula");
            break;
    }        
            
    }
    
}
