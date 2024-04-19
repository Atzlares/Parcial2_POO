/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_sobrecarga_metodos;

/**
 *
 * @author Axel
 */
public class Eva2_1_sobrecarga_metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("La suma de 5 + 4= "+sumar (5,4));
        System.out.println("La suma de 3.1 + 2.5= "+sumar (3.1,2.5));
        System.out.println("La suma de hola + mundo= "+sumar ("hola","mundo"));
        sumar();
    }
    
    public static int sumar(int n1,int n2){
        return n1+n2;
    }
    public static double sumar(double n1,double n2){
        return n1+n2;
    }
    public static String sumar(String n1, String n2){
        return n1+n2;
    }
    
    public static void sumar(){
        System.out.println("Metodo que no hace nada");
    }
    
}
