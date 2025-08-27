package com.mycompany.practica2;
import java.util.*;
public class Practica2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a,b,c;
        System.out.println("Ingrese a,b,c");
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        Ecuaciones ec1=new Ecuaciones(a,b,c);
        double discriminante = ec1.getDiscriminante();
        if(discriminante>0){
            System.out.println("La ecuacion tiene 2 raices: "+"raiz 1: " + ec1.getRaiz1() + "raiz 2: " + ec1.getRaiz2());
        }else if(discriminante == 0){
            System.out.println("La ecuacion solo pose la raiz 1: "+ ec1.getRaiz1());
        }else{
            System.out.println("La ecuacion no tiene raices");
        }
        ec1.mostrar();
    }
}
