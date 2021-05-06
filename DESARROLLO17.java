/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desarrollo17;
import java.util.Scanner;

/**
 *
 * @author pc15
 */
public class DESARROLLO17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner dias = new Scanner (System.in);
        System.out.println("Ingrese el numero del día");
    int dia = dias.nextInt();
    String nomDia;
    
    switch(dia){
        case 1:nomDia = "Lunes";
            break;
        case 2:nomDia = "Martes";
            break;
        case 3:nomDia = "Miercoles";
            break;
        case 4:nomDia = "Jueves";
            break;
        case 5:nomDia = "Viernes";
            break;
        case 6:nomDia = "Sabado";
            break;
        case 7:nomDia = "Domingo";
            break;
        default:nomDia = "Dia invalido";
            break;
    }        
        System.out.println(nomDia);
            
    }
    
}
