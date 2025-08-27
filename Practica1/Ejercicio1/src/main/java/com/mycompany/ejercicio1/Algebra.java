package com.mycompany.ejercicio1;
public class Algebra {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    public Algebra(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    private boolean TieneSolucion() {
        return (a*d)-(b*c)!=0;
    }
    public double getX(){
        return ((e*d)-(b*f))/((a*d-b*c));
    }
    public double getY(){
        return ((a*f)-(e*c))/((a*d)-(b*c));
    }
    void mostrar(){
        System.out.println(a + "," + b + "," + c + ","+ d + "," + e + "," + f);
        System.out.println("x: " + getX() );
        System.out.println("y: " + getY());
        if(TieneSolucion()){
            System.out.println("La ecucacion no tiene solucion");
        }else{
            System.out.println("Tine Solucion");
        }
    }
}
