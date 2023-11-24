/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_factorial;

/**
 *
 * @author frias
 */
public class EVA3_3_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor = 5;
        System.out.println("factorial de 5 = "+ calcularfactorial(valor));
        // crear metodo calcularpotencia -> (int base, int potencia) --> regresa entero
        int base =2 ;
        int potencia = 2;
        System.out.println("el valor de 2 a la potencia 2 es "+ calcularpotencia (base,potencia));
        
    }
    public static int calcularfactorial(int valor){
        int guardar = 1;
        for (int i = 1; i <= valor; i++) {
            guardar = guardar * i;// guardar *= i (acumulador)
            
        }
        return guardar;
    }
    public static int calcularpotencia(int base,int potencia){
        int resultado = 1;
        
        for (int i = 1; i <= potencia; i++) {
            resultado = resultado * base;
            
          }
        return  resultado;
    }
}
