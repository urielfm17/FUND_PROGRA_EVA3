/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_6_parametros;

/**
 *
 * @author frias
 */
public class EVA3_6_PARAMETROS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 5;
        System.out.println("el valor de x en el main() es de "+ x);
        pasoporvalor(x);
         System.out.println("el valor de x en el main() desoues de la llamada es de "+ x);
    }
    //en el paso por valor de argumentos, se envia una copia al metodo
    public static void pasoporvalor(int valor){
        System.out.println("el valor que recibo en el metodo es de "+ valor);
        valor++;
        System.out.println("el valor modificado en el metodo es de "+ valor);
    }
    
    
    
}
