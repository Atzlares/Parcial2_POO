/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_6_clases_abstractas;

/**
 *
 * @author rente
 */
public class Circulo Extends Figura{
    private double radio;
    
    public Circulo(){
        this.radio = 0;
        
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    
    public double calcularArea() {
        return (3.14*Math.pow(radio, 2));
    }
    public double calcularPerimetro(){
        return (3.14*(radio+radio));
    }
    
    
    
}
