/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desarrollo3;
import java.util.Scanner;
/**
 *
 * @author pc13
 */
public class DESARROLLO3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner (System.in);
    String nombre_alumno;
    double evaluacion1;
    double evaluacion2;
    double evaluacionfinal;
        System.out.println ("Nombre del alumno");
        nombre_alumno = entrada.nextLine ();
            System.out.println ("Nota 1º evaluación");
            evaluacion1 = entrada.nextDouble ();
                System.out.println ("Nota 2º evaluación");
                evaluacion2 = entrada.nextDouble ();
        evaluacionfinal = ((evaluacion1 + evaluacion2) / 2);
        System.out.println ("Nota final" + evaluacionfinal);
    }
}
    

