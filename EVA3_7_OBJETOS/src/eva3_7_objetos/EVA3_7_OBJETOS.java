/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_objetos;

/**
 *
 * @author frias
 */
public class EVA3_7_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        persona perso1 = new persona();
        System.out.println(perso1);
       perso1.nombre = "uriel";
       perso1.apellido = "frias";   
       perso1.edad = 18;
       imprimirpersonas(perso1);
       persona perso2 = new persona();
        System.out.println(perso2);
        perso2.nombre = "pedro";
        perso2.apellido = "espinoza";
        perso2.edad = 18;
        
        imprimirpersonas(perso2);
    }
    public static void imprimirpersonas(persona perso){
        
        System.out.println("direccion " + perso);
        System.out.println("nombre completo "+ perso.nombre + " "+ perso.apellido);
        System.out.println("edad "+ perso.edad);
        
        
    }
}
//deg¿fine una plantilla para crear objetos
//crea un nuevo tipo de datos
class persona{
    String nombre;
    String apellido;
    int edad;
    
}
