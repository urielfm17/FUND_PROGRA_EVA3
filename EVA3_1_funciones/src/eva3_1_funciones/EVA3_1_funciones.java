/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_funciones;

/**
 *
 * @author frias
 */
public class EVA3_1_funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //llamada funcion o procedimiento
       
        imprimirmensaje("hola mundo",5);
    
    }
    
   public static void imprimirmensaje(String mensaje, int cant)   {
       for (int i = 0; i < cant; i++) {
            System.out.println(mensaje);
   }
   }
           
}
