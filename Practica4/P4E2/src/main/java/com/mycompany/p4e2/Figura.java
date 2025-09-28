package com.mycompany.p4e2;
public abstract class Figura {
    public String color;

    public Figura(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "La figura es de color: " + color;
    }
    public abstract double Area();
    public abstract double Perimetro();
}
