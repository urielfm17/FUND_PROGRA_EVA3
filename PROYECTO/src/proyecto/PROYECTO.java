/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;

import java.util.Scanner;

/**
 *
 * @author frias
 */
public class PROYECTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner (System.in);
         String actividad, materia,fprograma; 
         
         String[] Ttrabajo = {"trabajo","tareas","proyectos","examenes"};
         
         String[]
         
        do{ 
             System.out.println("Que actividad es: (tarea, trabajo,proyecto,examen ");
              actividad = captu.nextLine();
              
            System.out.println("De que materia es el/la "+ actividad );
              materia = captu.nextLine();
            System.out.println("desea terminar con el programa " );
              fprograma = captu.nextLine();
              
            
            
            
        } while(fprograma.equals("no"));
        System.out.println("fin del programa");
        
                
    }
    
}
