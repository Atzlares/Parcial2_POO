/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_sobrecarga_constructores;

/**
 *
 * @author Axel
 */
public class Eva2_2_sobrecarga_constructores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona person1=new Persona();
        person1.imprimirDatos();
        
        Persona person2=new Persona("Axel","Lares Estrada",22);
        person2.imprimirDatos();
        person2.setNombre("Jorge");
        person2.setApellidos("Lares");
        person2.setEdad(23);
        person2.imprimirDatos();
        
    }
    
}
