/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desarrollo18;

import java.util.Scanner;

/**
 *
 * @author pc15
 */
public class DESARROLLO18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner meses = new Scanner (System.in);
        System.out.println("Ingrese el numero del día");
    int mes = meses.nextInt();
    String nomMes;
    
    switch(mes){
        case 1:nomMes = "Enero";
            break;
        case 2:nomMes = "Febrero";
            break;
        case 3:nomMes = "Marzo";
            break;
        case 4:nomMes = "Abril";
            break;
        case 5:nomMes = "Mayo";
            break;
        case 6:nomMes = "Junio";
            break;
        case 7:nomMes = "Julio";
            break;
        case 8:nomMes = "Agosto";
            break;
        case 9:nomMes = "Septiembre";
            break;
        case 10:nomMes = "Octubre";
            break;
        case 11:nomMes = "Noviembre";
            break;
        case 12:nomMes = "Diciembre";
            break;
        default:nomMes = "Mes invalido";
            break;
    }        
        System.out.println(nomMes);
            
    }
}
    

