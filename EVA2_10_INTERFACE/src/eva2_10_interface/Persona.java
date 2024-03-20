/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_10_interface;

/**
 *
 * @author rente
 */
public class Persona{
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private int edad;
    
    
    public Persona(){
        this.nombre="-----";
        this.apellidoP="-----";
        this.apellidoM="-----";
        this.edad=0;
    }
    

    public Persona(String nombre, String apellidoP, String apellidoM, int edad) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.edad = edad;
        
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public int getEdad() {
        return edad;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /*@Override
    public void imprimirDatos() {
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido P: "+apellidoP);
        System.out.println("Apellido M: "+apellidoM);
    }

    @Override
    public String generarNombreComp() {
       return nombre +" "+apellidoP+" "+apellidoM;
    }
*/
    
    
    
    
}
