/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgclass.pkg4;
import java.util.Scanner; //Librería para pedir datos

/**
 *
 * @author Estudiante
 */
public class Class4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner lectura= new Scanner(System.in);
        int a=5;
        System.out.println("Mensaje " + a); //Con salto de línea
        System.out.print("mensaje " + a); // Sin salto de l+inea
        String cadena=lectura.next();
        int entero=lectura.nextInt();
        double real=lectura.nextDouble();
        boolean booleano=lectura.nextBoolean(); 
    }
    
}
