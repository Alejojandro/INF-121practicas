package com.mycompany.p4e2;
public class Cuadrado extends Figura implements Coloreado {
    private int lado;
    public Cuadrado(int lado, String color) {
        super(color);
        this.lado = lado;
    }
    @Override
    public String comoColorear(){
        return "Colorear los cuatro lados";
    }
    @Override
    public double Area(){
        return Math.pow(lado, 2);
    }
    @Override
    public double Perimetro(){
        return lado*4;
    }

    @Override
    public String toString() {
        return super.toString()+"y el tamaño del lado del Cuadrado es: " + lado;
    }
}
