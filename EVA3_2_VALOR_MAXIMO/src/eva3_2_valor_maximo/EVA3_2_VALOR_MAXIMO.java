/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_valor_maximo;

/**
 *
 * @author frias
 */
public class EVA3_2_VALOR_MAXIMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //llamada funcion( invocar funcion)
        //utilizar el valor directamnete de la funcion
        System.out.println(buscarMaximo(100,200));
        //guardar el valor en una variable
        int resu = buscarMaximo(100,200);
        System.out.println(resu);
        //llamar la funcion e ignorar el resultado
        buscarMaximo(100,200);
    }
    public static int buscarMaximo(int val1, int val2){
    
        /*if(val1 > val2)
         return val1;
     else 
         return val2;
     */
                             // cualqiuer metodo es correcto pero es mejor poner solo un return
    int result;
    
     if(val1 > val2)
         result = val1;
      else
         result = val2;
     return result;
         
     }
}
