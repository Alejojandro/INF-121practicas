package com.mycompany.ejercicio1;
import java.util.*;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese a,b,c,d,e y f: ");
        double a=sc.nextInt();
        double b=sc.nextInt();
        double c=sc.nextInt();
        double d=sc.nextInt();
        double e=sc.nextInt();
        double f=sc.nextInt();
        Algebra ejer1=new Algebra(a,b,c,d,e,f);
        ejer1.getX();
        ejer1.getY();
        ejer1.mostrar();
    }
}
