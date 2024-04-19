/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_6_clases_abstractas;

/**
 *
 * @author rente
 */
public class Rectangulo extends Figura{
    private double altura;
    private double base;
    
    public Rectangulo(){
        this.altura = 0;
        this.base = 0;
    }

    public Rectangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    @Override
    public double calcularArea() {
        return (base*altura);
    }

    @Override
    public double calPerimetro() {
        return (base*2)+(base*2);
    }
    
    
}
