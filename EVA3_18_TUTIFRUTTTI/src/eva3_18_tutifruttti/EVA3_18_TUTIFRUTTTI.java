/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_18_tutifruttti;

import java.util.Scanner;

/**
 *
 * @author frias
 */
public class EVA3_18_TUTIFRUTTTI {
     final static String USUARIO = "tutti";
     final static String PASSWORD= "frutti";
  
             
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
         String usu;
          String pwd;
        do{
             
              usu = capturadatos("usuario");
            
              pwd = capturadatos("contraseña");
        }while(!validaracceso(usu, pwd));
        System.out.println("BIENVENIDO AL SISTEMA");
                
    }
    public static boolean validaracceso(String usuario, String pwd){
        if (usuario.equals(USUARIO) && pwd.equals(PASSWORD))
                return true;
        else
            return false;
    }
    public static String capturadatos(String mensaje){
        Scanner captu = new Scanner (System.in);
        System.out.println(mensaje);
        return captu.nextLine();
        
        
    }
    
}
