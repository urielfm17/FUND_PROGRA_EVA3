/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_6_paso_parametros_referencia;

/**
 *
 * @author frias
 */
public class EVA3_6_PASO_PARAMETROS_REFERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int[] arreglo = new int[10]; 
        System.out.println("la direccion de arreglo es "+ arreglo);
        llenararreglo(arreglo);
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("["+ arreglo[i] + "]");
            
        }
    }
    
    public static void llenararreglo( int[] valores){
        System.out.println("la direccion de valores es "+ valores);
        for (int i = 0; i < valores.length; i++) {
            valores[i] = (int)(Math.random()* 100);
            
            
        }
    }
    
}
