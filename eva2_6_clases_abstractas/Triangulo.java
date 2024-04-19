/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_6_clases_abstractas;

/**
 *
 * @author rente
 */
public class Triangulo extends Figura{
    //Dos atributos base y altura, contructores y set y get
    private double altura;
    private double base;
    
    
    public Triangulo(){
        this.altura = 0;
        this.base = 0;
    }

    public Triangulo(double altura, double base) {
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
        return (base*altura)/2;
    
    }
    
    private double calcularHip(){
        //Teorema de pitagoras
        return Math.sqrt(Math.pow(base, 2)+ Math.pow(altura, 2));
    }

    @Override
    public double calPerimetro() {
        return base+altura+calcularHip();
    }
    

    
}
