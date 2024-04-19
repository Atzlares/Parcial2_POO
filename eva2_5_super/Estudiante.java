/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_5_super;

/**
 *
 * @author rente
 */
public class Estudiante extends Persona{
    private String noControl;
    private String carrera;
    
    public Estudiante(){
        super();//llama al contructor de la superclase
        noControl="----";
        carrera="-----";
    }
    //REGLA de herencia:siempre hay que llamar al contructor de la superclase
    //Siempre tiene que ser la primer instruccion del contructor
    public Estudiante(String nombre, String apellidoP, String apellidoM, int edad, char genero, String noControl, String carrera){
        super(nombre,apellidoP,apellidoM,edad,genero);
        this.noControl=noControl;
        this.carrera=carrera;
    }
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("No. control: "+noControl);
        System.out.println("Carrera: "+carrera);
    }
    
    public String getNoControl(){
        return noControl;
    }
}
