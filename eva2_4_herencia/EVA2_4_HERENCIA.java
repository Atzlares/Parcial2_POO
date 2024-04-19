/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_herencia;

/**
 *
 * @author rente
 */
public class EVA2_4_HERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso1= new Persona();
        System.out.println(perso1.toString());
        Estudiante estu1=new Estudiante();
        System.out.println("Nombre: "+estu1.getNombre());
        System.out.println("Apellidos: "+estu1.getApellidos());
        System.out.println("Edad: "+estu1.getEdad());
        
        // Todas las clases en java descienden en la clase objet
    }
    
}
class Persona{
    private String nombre;
    private String apellidos;
    private int edad;
    
    public Persona(){
        this.nombre="sin nombre";
        this.apellidos="sin apellidos";
        this.edad=0;
    }
    
    //Getters
    public String getNombre(){
        return nombre;
    }
    public String getApellidos(){
        return apellidos;
    }
    public int getEdad(){
        return edad;
    }
    
    //Setters
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setApellidos(String apellidos){
        this.apellidos=apellidos;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
}
class Estudiante extends Persona{
    private String noControl;
    
    
    public String getNoControl(){
        return noControl;
    }
    public void setNoControl(String noControl){
        this.noControl=noControl;
    }
}
