/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_funcion_arreglo;

/**
 *
 * @author frias
 */
public class EVA3_4_FUNCION_ARREGLO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] arreglo;
        arreglo = creararreglo(10);
        for(int valor: arreglo)
        System.out.print("[ "+ valor+ "]");
    }
    
    public static int[] creararreglo(int tama){
        int[] arreglo = new int[ tama];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random() * 100);
                                
        }
        return arreglo;
    }
}
