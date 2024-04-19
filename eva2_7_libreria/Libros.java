/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_7_libreria;

/**
 *
 * @author rente
 */
public class Libros extends Publicaciones{
    private String autor;
    
    //constructores
    //set y get
    
    

    public Libros(String autor, String titulo, double precio, int copias) {
        super(titulo, precio, copias);
        this.autor = autor;
    }
    
    //siempre se llama al contructor de la superclase
    public Libros() {
        super();
        this.autor ="---";
    }
    
    
    
    
    //set
    public void setAutor(String autor) {
        this.autor = autor;
    }
    //get
    public String getAutor() {
        return autor;
    }
    
    
    
    
    public void ordenarCopias(int cant){
        //las copias se deben agregar a la variable
        //copias de la clase Publicaciones()
        int existencias=getCopias();
        setCopias(existencias+cant);
    }
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Autor: "+autor);
    }
}
