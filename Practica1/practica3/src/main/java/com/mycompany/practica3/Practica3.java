package com.mycompany.practica3;
import java.util.*;
public class Practica3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x1,x2,x3,x4,x5,x6,x7,x8,x9,x10;
        System.out.println("Ingrese 10 numeros:");
        x1=sc.nextDouble();
        x2=sc.nextDouble();
        x3=sc.nextDouble();
        x4=sc.nextDouble();
        x5=sc.nextDouble();
        x6=sc.nextDouble();
        x7=sc.nextDouble();
        x8=sc.nextDouble();
        x9=sc.nextDouble();
        x10=sc.nextDouble();
        Estadistica est1=new Estadistica(x1,x2,x3,x4,x5,x6,x7,x8,x9,x10);
        System.out.printf("El promedio es %.2f%n", est1.promedio());
        System.out.printf("La desviación estándar es %.5f%n", est1.desviacion());
    }
}
