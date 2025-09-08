package com.mycompany.pract4;
public class Circulo2D {
    private double x;
    private double y;
    private double radio; 

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadio() {
        return radio;
    }
    public Circulo2D() {
        this.x=0;
        this.y=0;
        this.radio=1;
    }
    public Circulo2D(double x, double y, double radio) {
        this.x = x;
        this.y = y;
        this.radio = radio;
    }
    public double getArea(){
        return Math.PI*(radio*radio);
    }
    public double getPerimetro(){
        return 2*Math.PI*(radio);
    }
    public boolean contiene(double cx, double cy){
        double distancia = Math.sqrt(Math.pow(cx-x, 2)+ Math.pow(cy-y, 2));
        return distancia<=radio;
    }
    public boolean contiene(Circulo2D circulo){
        double distancia = Math.sqrt(Math.pow(circulo.getX()-x, 2)+Math.pow(circulo.getY()-y, 2));
        return distancia+circulo.getRadio() <radio;
    }
    public boolean sobrepone(Circulo2D circulo){
        double distancia = Math.sqrt(Math.pow(circulo.getX()-x, 2)+Math.pow(circulo.getY(), 2));
        return distancia<(radio+circulo.getRadio()) && distancia> Math.abs(radio-circulo.getRadio());
    }
    void mostrar(){
        System.out.println("El centro del circulo es:"+"("+x+","+y+")"+"y el radio es:"+radio);
    }
}
