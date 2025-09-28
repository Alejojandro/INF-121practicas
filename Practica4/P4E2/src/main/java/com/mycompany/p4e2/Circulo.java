package com.mycompany.p4e2;
public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio, String color) {
        super(color);
        this.radio = radio;
    }
    @Override
    public double Area(){
        return Math.PI*(Math.pow(radio,2));
    }
    @Override
    public double Perimetro(){
        return 2*Math.PI*radio;
    }
    @Override
    public String toString() {
        return super.toString()+"y el radio del circulo es:" + radio;
    }
}
