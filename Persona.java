/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_5_super;

import java.awt.BorderLayout;

/**
 *
 * @author rente
 */
public class Persona {
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private int edad;
    private char genero;
    
    public Persona(){
        this.nombre="------------";
        this.apellidoP="----";
        this.apellidoM="----";
        this.edad=0;
        this.genero='-';
        
    } 
    public Persona(String nombre, String apellidoP, String apellidoM, int edad, char genero) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.edad=edad;
        this.genero=genero;
    }
    public void setNombre(String valor) {
        nombre = valor;
    }
    public void setApellidoP(String valor) {
        apellidoP = valor;
    }
    public void setApellidoM(String valor) {
        apellidoM = valor;
    }
    public void setEdad(int valor){
        edad=valor;
    }
    public void setGenero(char valor){
        genero=valor;
    }

    //Metodos get
    public String getNombre() {
        return nombre;
    }
    public String getApellidoP(){
        return apellidoP;
    }
    public String getApellidoM(){
        return apellidoM;
    }
    public int getEdad(){
        return edad;
    }
    public char getGenero(){
        return genero;
    }
    
    public void imprimirDatos() {
        System.out.println("Nombre completo: "+nombre+" "+apellidoP+" "+apellidoM);
        System.out.println("Edad: "+edad);
        System.out.println("Genero: "+genero);
                
    }
}
