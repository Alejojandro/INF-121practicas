package com.mycompany.practica3;
public class Estadistica {
    private double x1, x2, x3, x4, x5, x6, x7, x8, x9, x10;

    public Estadistica(double x1, double x2, double x3, double x4, double x5,
                                 double x6, double x7, double x8, double x9, double x10) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.x4 = x4;
        this.x5 = x5;
        this.x6 = x6;
        this.x7 = x7;
        this.x8 = x8;
        this.x9 = x9;
        this.x10 = x10;
    }

    public double promedio() {
        return (x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8 + x9 + x10) / 10;
    }

    public double desviacion() {
        double media = promedio();
        double suma = Math.pow(x1 - media, 2) + Math.pow(x2 - media, 2) +
                      Math.pow(x3 - media, 2) + Math.pow(x4 - media, 2) +
                      Math.pow(x5 - media, 2) + Math.pow(x6 - media, 2) +
                      Math.pow(x7 - media, 2) + Math.pow(x8 - media, 2) +
                      Math.pow(x9 - media, 2) + Math.pow(x10 - media, 2);
        return Math.sqrt(suma / 9); // n - 1
    }
}

