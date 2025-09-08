package com.mycompany.pract4;
public class Pract4 {
    public static void main(String[] args) {
        Circulo2D c1=new Circulo2D(2,0,1);
        Circulo2D c2=new Circulo2D();
        Circulo2D c3=new Circulo2D(2,0,0.5);
        Circulo2D c4=new Circulo2D(0,0,2);
        c2.mostrar();
        c1.mostrar();
        c3.mostrar();
        c4.mostrar();
        System.out.println("Area de c1: "+c1.getArea());
        System.out.println("Perimetro de c1: "+c1.getPerimetro());
        System.out.println("El circulo c1 tiene en su interior los puntos (2.5,0)?: "+c1.contiene(2.5, 0));
        System.out.println("El circulo c1 tiene en su interior el circulo c3=(2,0,0.5)?: "+c1.contiene(c3));
        System.out.println("El circulo c1 se sobrepone al circulo c4=(0,0,2)?: "+c1.sobrepone(c4));
    }
}
