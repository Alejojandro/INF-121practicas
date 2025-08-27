package com.mycompany.practica2;
public class Ecuaciones {
    private double a;
    private double b;
    private double c;

    public Ecuaciones(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminante(){
        return (b*b)-4*a*c;
    }
    public double getRaiz1(){
        double discriminante=getDiscriminante();
        if(discriminante<0) return 0;
        return (-b+(Math.sqrt((b*b)-4*a*c)))/(2*a);
    }
    public double getRaiz2(){
        double discriminante=getDiscriminante();
        if(discriminante<0)return 0;
        return (-b-(Math.sqrt((b*b)-4*a*c)))/(2*a);
    }
    void mostrar(){
        System.out.println(a+","+b+","+c);
    }
}
